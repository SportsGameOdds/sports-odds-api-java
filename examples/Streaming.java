import com.sportsgameodds.api.client.SportsGameOddsClient;
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient;
import com.sportsgameodds.api.errors.SportsGameOddsException;
import com.sportsgameodds.api.models.events.Event;
import com.sportsgameodds.api.models.events.EventGetPage;
import com.sportsgameodds.api.models.events.EventGetParams;
import com.sportsgameodds.api.models.stream.StreamEventsParams;
import com.sportsgameodds.api.models.stream.StreamEventsResponse;
import com.pusher.client.Pusher;
import com.pusher.client.channel.Channel;
import com.pusher.client.connection.ConnectionEventListener;
import com.pusher.client.connection.ConnectionState;
import com.pusher.client.connection.ConnectionStateChange;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Sports Odds API Java SDK - Streaming Example
 *
 * This example demonstrates:
 * - Using the streaming API to receive real-time event updates
 * - Connecting to WebSocket using Pusher
 * - Processing event change notifications
 * - Maintaining a local cache of events
 * - Graceful shutdown handling
 *
 * Note: Streaming requires an AllStar plan subscription
 * Get your API key from https://sportsgameodds.com/pricing
 */
public class Streaming {

    private static final String API_KEY_ENV_VAR = "SPORTS_ODDS_API_KEY_HEADER";
    private static final String STREAM_FEED = "events:live"; // Options: events:upcoming, events:byid, events:live
    private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");

    public static void main(String[] args) {
        // Get API key from environment variable
        String apiKey = System.getenv(API_KEY_ENV_VAR);

        if (apiKey == null || apiKey.trim().isEmpty()) {
            System.err.println("Error: " + API_KEY_ENV_VAR + " environment variable not set");
            System.err.println("Usage: export " + API_KEY_ENV_VAR + "='your-api-key-here'");
            System.exit(1);
        }

        System.out.println("Sports Odds API Java SDK - Streaming Example");
        System.out.println("Note: Streaming requires an AllStar plan subscription\n");

        try {
            System.out.println("=== Setting up Event Stream ===");
            System.out.println("Feed: " + STREAM_FEED + "\n");

            // Initialize the client
            SportsGameOddsClient client = SportsGameOddsOkHttpClient.builder()
                .apiKeyHeader(apiKey)
                .build();

            // Initialize a data structure where we'll save the event data
            Map<String, Event> events = new HashMap<>();

            // Call this endpoint to get initial data and connection parameters
            System.out.println("Fetching stream info and initial data...");
            StreamEventsParams request = StreamEventsParams.builder()
                .feed(STREAM_FEED)
                .build();

            StreamEventsResponse streamInfo = client.stream().events(request);

            // Seed initial data
            for (Event event : streamInfo.data()) {
                events.put(event.eventId(), event);
            }

            System.out.println("✓ Loaded " + events.size() + " initial events");
            System.out.println("✓ Connecting to WebSocket...");

            // Connect to WebSocket server
            Pusher pusher = new Pusher(streamInfo.pusherKey(), streamInfo.pusherOptions().orElse(null));

            // Add connection event listener
            pusher.connect(new ConnectionEventListener() {
                @Override
                public void onConnectionStateChange(ConnectionStateChange change) {
                    if (change.getCurrentState() == ConnectionState.CONNECTED) {
                        System.out.println("✓ Connected! Listening for updates...");
                        System.out.println("Press Ctrl+C to stop\n");
                    }
                }

                @Override
                public void onError(String message, String code, Exception e) {
                    System.err.println("Connection error: " + message);
                    if (e != null) {
                        e.printStackTrace();
                    }
                }
            });

            // Subscribe to the channel
            Channel channel = pusher.subscribe(streamInfo.channel());

            // Bind to the 'data' event
            channel.bind("data", (channelName, eventName, data) -> {
                try {
                    // Parse the changed events
                    // The data is a JSON array of objects with eventID field
                    @SuppressWarnings("unchecked")
                    List<Map<String, Object>> changedEvents = (List<Map<String, Object>>) data;

                    System.out.println("\n[" + TIME_FORMAT.format(new Date()) + "] Received update for " +
                        changedEvents.size() + " event(s)");

                    // Get the eventIDs that changed
                    String eventIds = changedEvents.stream()
                        .map(e -> (String) e.get("eventID"))
                        .collect(Collectors.joining(","));

                    // Get the full event data for the changed events
                    EventGetParams eventRequest = EventGetParams.builder()
                        .eventIDs(eventIds)
                        .build();

                    EventGetPage updatedEvents = client.events().get(eventRequest);

                    for (Event event : updatedEvents.items()) {
                        // Update our data with the full event data
                        events.put(event.eventId(), event);

                        System.out.println("  Updated: " + event.eventId());
                        if (event.awayTeamName().isPresent() && event.homeTeamName().isPresent()) {
                            System.out.println("    " + event.awayTeamName().get() + " @ " + event.homeTeamName().get());
                        }
                        if (event.activity().isPresent()) {
                            System.out.println("    Activity: " + event.activity().get());
                        }
                    }
                } catch (Exception e) {
                    System.err.println("Error processing event update: " + e.getMessage());
                    e.printStackTrace();
                }
            });

            // Handle graceful shutdown
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.out.println("\n\nDisconnecting...");
                pusher.disconnect();
                System.out.println("✓ Disconnected from stream");
            }));

            // Keep the script running
            while (true) {
                Thread.sleep(1000);
            }

        } catch (SportsGameOddsException e) {
            System.err.println("✗ API Error: " + e.getMessage());
            System.err.println("Error type: " + e.getClass().getSimpleName());
            System.exit(1);
        } catch (NoClassDefFoundError e) {
            System.err.println("✗ Missing dependency: Pusher Java library");
            System.err.println("Add to your build.gradle:");
            System.err.println("  implementation 'com.pusher:pusher-java-client:2.4.2'");
            System.err.println("\nOr to your pom.xml:");
            System.err.println("  <dependency>");
            System.err.println("    <groupId>com.pusher</groupId>");
            System.err.println("    <artifactId>pusher-java-client</artifactId>");
            System.err.println("    <version>2.4.2</version>");
            System.err.println("  </dependency>");
            System.exit(1);
        } catch (Exception e) {
            System.err.println("✗ Unexpected error: " + e.getMessage());
            System.err.println("Error type: " + e.getClass().getSimpleName());
            e.printStackTrace();
            System.exit(1);
        }
    }
}
