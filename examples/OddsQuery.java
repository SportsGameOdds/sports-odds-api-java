import com.sportsgameodds.api.client.SportsGameOddsClient;
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient;
import com.sportsgameodds.api.core.JsonValue;
import com.sportsgameodds.api.errors.SportsGameOddsException;
import com.sportsgameodds.api.models.events.Event;
import com.sportsgameodds.api.models.events.EventGetParams;
import com.sportsgameodds.api.models.events.EventGetPage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Sports Odds API Java SDK - Odds Query Example
 *
 * This example demonstrates:
 * - Querying for events with specific filters (NFL, not finalized, odds available)
 * - Parsing and organizing odds data by betTypeID
 * - Working with the odds Map structure
 * - Displaying summary statistics
 *
 * Get your API key from https://sportsgameodds.com/pricing
 */
public class OddsQuery {

    private static final String API_KEY_ENV_VAR = "SPORTS_ODDS_API_KEY_HEADER";

    public static void main(String[] args) {
        // Get API key from environment variable
        String apiKey = System.getenv(API_KEY_ENV_VAR);

        if (apiKey == null || apiKey.trim().isEmpty()) {
            System.err.println("Error: " + API_KEY_ENV_VAR + " environment variable not set");
            System.err.println("Usage: export " + API_KEY_ENV_VAR + "='your-api-key-here'");
            System.exit(1);
        }

        System.out.println("Sports Odds API Java SDK - Odds Query Example\n");

        // Initialize the client
        SportsGameOddsClient client = SportsGameOddsOkHttpClient.builder()
            .apiKeyHeader(apiKey)
            .build();

        // Query for NFL events that are not finalized and have odds available
        System.out.println("=== Querying NFL Events with Odds ===");
        System.out.println("Filters: leagueID=NFL, finalized=false, oddsAvailable=true\n");

        try {
            EventGetParams request = EventGetParams.builder()
                .leagueId("NFL")
                .finalized(false)
                .oddsAvailable(true)
                .limit(10.0)
                .build();

            EventGetPage page = client.events().get(request);

            if (page.items().isEmpty()) {
                System.out.println("No NFL events with odds found");
                return;
            }

            System.out.println("Found " + page.items().size() + " NFL events with odds\n");

            // Parse all odds markets into a map
            // Structure: Map<eventID, Map<betTypeID, List<JsonValue>>>
            Map<String, Map<String, List<JsonValue>>> oddsMap = new HashMap<>();

            for (Event event : page.items()) {
                String eventId = event.eventId();
                oddsMap.put(eventId, new HashMap<>());

                System.out.println("Event: " + eventId);
                if (event.awayTeamName().isPresent() && event.homeTeamName().isPresent()) {
                    System.out.println("  " + event.awayTeamName().get() + " @ " + event.homeTeamName().get());
                }

                // Check if odds exist
                Optional<Event.Odds> oddsOpt = event.odds();
                if (!oddsOpt.isPresent()) {
                    System.out.println("  No odds markets available\n");
                    continue;
                }

                // Group odds by betTypeID
                // event.odds() returns Optional<Event.Odds> which has _additionalProperties() returning Map<String, JsonValue>
                Event.Odds odds = oddsOpt.get();
                Map<String, JsonValue> oddsData = odds._additionalProperties();

                for (Map.Entry<String, JsonValue> entry : oddsData.entrySet()) {
                    JsonValue oddValue = entry.getValue();

                    // Extract betTypeID from the JsonValue
                    if (oddValue.isObject()) {
                        Optional<String> betTypeIdOpt = oddValue.asObject()
                            .flatMap(obj -> obj.get("betTypeID"))
                            .flatMap(JsonValue::asString);

                        if (betTypeIdOpt.isPresent()) {
                            String betTypeId = betTypeIdOpt.get();
                            oddsMap.get(eventId).putIfAbsent(betTypeId, new ArrayList<>());
                            oddsMap.get(eventId).get(betTypeId).add(oddValue);
                        }
                    }
                }

                // Display summary of odds markets for this event
                Map<String, List<JsonValue>> eventOdds = oddsMap.get(eventId);
                if (!eventOdds.isEmpty()) {
                    System.out.println("  Odds Markets:");
                    for (Map.Entry<String, List<JsonValue>> betTypeEntry : eventOdds.entrySet()) {
                        String betTypeId = betTypeEntry.getKey();
                        int marketCount = betTypeEntry.getValue().size();
                        System.out.println("    betTypeID " + betTypeId + ": " + marketCount + " markets");
                    }
                } else {
                    System.out.println("  No odds markets available");
                }

                System.out.println();
            }

            // Display summary
            System.out.println("\n=== Summary ===");
            int totalEvents = oddsMap.size();
            int totalBetTypes = oddsMap.values().stream()
                .mapToInt(Map::size)
                .sum();
            int totalMarkets = oddsMap.values().stream()
                .flatMap(markets -> markets.values().stream())
                .mapToInt(List::size)
                .sum();

            System.out.println("Total events processed: " + totalEvents);
            System.out.println("Total unique bet types: " + totalBetTypes);
            System.out.println("Total odds markets: " + totalMarkets);

            // Show example of accessing the odds map
            if (!oddsMap.isEmpty()) {
                String firstEventId = oddsMap.keySet().iterator().next();
                System.out.println("\nExample - Accessing odds for event " + firstEventId + ":");

                Map<String, List<JsonValue>> firstEventOdds = oddsMap.get(firstEventId);
                for (Map.Entry<String, List<JsonValue>> entry : firstEventOdds.entrySet()) {
                    String betTypeId = entry.getKey();
                    List<JsonValue> markets = entry.getValue();

                    System.out.println("  betTypeID " + betTypeId + ": " + markets.size() + " markets");
                    if (!markets.isEmpty()) {
                        JsonValue firstMarket = markets.get(0);
                        if (firstMarket.isObject()) {
                            Optional<String> bookmakerIdOpt = firstMarket.asObject()
                                .flatMap(obj -> obj.get("bookmakerID"))
                                .flatMap(JsonValue::asString);
                            Optional<Double> priceOpt = firstMarket.asObject()
                                .flatMap(obj -> obj.get("price"))
                                .flatMap(JsonValue::asDouble);

                            System.out.println("    Sample market: bookmakerID=" +
                                bookmakerIdOpt.orElse("N/A") + ", price=" + priceOpt.orElse(0.0));
                        }
                    }
                }
            }

            System.out.println("\nOdds query example completed successfully!");

        } catch (SportsGameOddsException e) {
            System.err.println("API Error: " + e.getMessage());
        }
    }
}
