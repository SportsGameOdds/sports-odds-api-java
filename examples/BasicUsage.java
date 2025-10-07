import com.sportsgameodds.api.client.SportsGameOddsClient;
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient;
import com.sportsgameodds.api.errors.SportsGameOddsException;
import com.sportsgameodds.api.models.events.Event;
import com.sportsgameodds.api.models.events.EventGetPage;
import com.sportsgameodds.api.models.events.EventGetParams;

/**
 * Sports Odds API Java SDK - Basic Usage Examples
 *
 * This example demonstrates:
 * - Initializing the client with an API key
 * - Fetching events with pagination
 * - Auto-pagination through multiple pages
 * - Error handling
 *
 * Get your API key from https://sportsgameodds.com/pricing
 */
public class BasicUsage {

    private static final String API_KEY_ENV_VAR = "SPORTS_ODDS_API_KEY_HEADER";

    public static void main(String[] args) {
        // Get API key from environment variable
        String apiKey = System.getenv(API_KEY_ENV_VAR);

        if (apiKey == null || apiKey.trim().isEmpty()) {
            System.err.println("Error: " + API_KEY_ENV_VAR + " environment variable not set");
            System.err.println("Usage: export " + API_KEY_ENV_VAR + "='your-api-key-here'");
            System.exit(1);
        }

        System.out.println("Sports Odds API Java SDK - Basic Usage Examples\n");

        // Initialize the client
        SportsGameOddsClient client = SportsGameOddsOkHttpClient.builder()
            .apiKeyHeader(apiKey)
            .build();

        // Example 1: Fetch recent events
        System.out.println("=== Fetching Events ===");
        try {
            EventGetParams request = EventGetParams.builder()
                .limit(10.0)
                .build();

            EventGetPage page = client.events().get(request);

            if (page.items().isEmpty()) {
                System.out.println("No events found");
            } else {
                System.out.println("Found " + page.items().size() + " events:");
                for (int i = 0; i < Math.min(3, page.items().size()); i++) {
                    Event event = page.items().get(i);
                    System.out.println("  - " + event.eventId() + ": " + event.activity().orElse("N/A"));
                }
            }
        } catch (SportsGameOddsException e) {
            System.err.println("API Error: " + e.getMessage());
        }

        // Example 2: Auto-pagination
        System.out.println("\n=== Auto-Pagination Example ===");
        try {
            EventGetParams request = EventGetParams.builder()
                .limit(5.0)
                .build();

            EventGetPage page = client.events().get(request);
            int count = 0;

            // Process first page
            for (Event event : page.items()) {
                count++;
                if (count <= 10) {
                    System.out.println("  Event " + count + ": " + event.eventId());
                }
                if (count >= 15) break; // Limit for demo purposes
            }

            // Auto-paginate through remaining pages
            String cursor = page.cursor().orElse(null);
            while (cursor != null && count < 15) {
                EventGetParams nextRequest = EventGetParams.builder()
                    .limit(5.0)
                    .cursor(cursor)
                    .build();

                page = client.events().get(nextRequest);

                for (Event event : page.items()) {
                    count++;
                    if (count <= 10) {
                        System.out.println("  Event " + count + ": " + event.eventId());
                    }
                    if (count >= 15) break;
                }

                cursor = page.cursor().orElse(null);
            }

            System.out.println("Processed " + count + " events across multiple pages");
        } catch (SportsGameOddsException e) {
            System.err.println("API Error: " + e.getMessage());
        }

        // Example 3: Error handling
        System.out.println("\n=== Error Handling Example ===");
        try {
            EventGetParams request = EventGetParams.builder()
                .eventIDs("invalid-id")
                .build();

            client.events().get(request);
        } catch (SportsGameOddsException e) {
            System.out.println("Caught APIError: " + e.getClass().getSimpleName());
        }

        System.out.println("\nExamples completed successfully!");
    }
}
