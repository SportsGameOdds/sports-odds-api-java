# Sports Odds API - Live Sports Data & Sportsbook Betting Odds - Powered by SportsGameOdds API Library

Get live betting odds, spreads, and totals for NFL, NBA, MLB, and 50 additional sports and leagues.
Production-ready Java SDK with 99.9% uptime and sub-minute updates during live games.
Perfect for developers building sportsbook platforms, odds comparison tools, positive EV models, and anything else that requires fast, accurate sports data.

[![Maven Central](https://img.shields.io/maven-central/v/com.sportsgameodds.api/sports-odds-api)](https://central.sonatype.com/artifact/com.sportsgameodds.api/sports-odds-api/1.2.1)
[![javadoc](https://javadoc.io/badge2/com.sportsgameodds.api/sports-odds-api/1.2.1/javadoc.svg)](https://javadoc.io/doc/com.sportsgameodds.api/sports-odds-api/1.2.1)

This library provides convenient access to the Sports Game Odds REST API from applications written in Java.

The REST API documentation can be found on [sportsgameodds.com](https://sportsgameodds.com/docs/).

## Features

## MCP Server

Use the Sports Game Odds MCP Server to enable AI assistants to interact with this API, allowing them to explore endpoints, make test requests, and use documentation to help integrate this SDK into your application.

[![Add to Cursor](https://cursor.com/deeplink/mcp-install-dark.svg)](https://cursor.com/en-US/install-mcp?name=sports-odds-api-mcp&config=eyJjb21tYW5kIjoibnB4IiwiYXJncyI6WyIteSIsInNwb3J0cy1vZGRzLWFwaS1tY3AiXSwiZW52Ijp7IlNQT1JUU19PRERTX0FQSV9LRVlfSEVBREVSIjoiTXkgQVBJIEtleSBQYXJhbSJ9fQ)
[![Install in VS Code](https://img.shields.io/badge/_-Add_to_VS_Code-blue?style=for-the-badge&logo=data:image/svg%2bxml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIGZpbGw9Im5vbmUiIHZpZXdCb3g9IjAgMCA0MCA0MCI+PHBhdGggZmlsbD0iI0VFRSIgZmlsbC1ydWxlPSJldmVub2RkIiBkPSJNMzAuMjM1IDM5Ljg4NGEyLjQ5MSAyLjQ5MSAwIDAgMS0xLjc4MS0uNzNMMTIuNyAyNC43OGwtMy40NiAyLjYyNC0zLjQwNiAyLjU4MmExLjY2NSAxLjY2NSAwIDAgMS0xLjA4Mi4zMzggMS42NjQgMS42NjQgMCAwIDEtMS4wNDYtLjQzMWwtMi4yLTJhMS42NjYgMS42NjYgMCAwIDEgMC0yLjQ2M0w3LjQ1OCAyMCA0LjY3IDE3LjQ1MyAxLjUwNyAxNC41N2ExLjY2NSAxLjY2NSAwIDAgMSAwLTIuNDYzbDIuMi0yYTEuNjY1IDEuNjY1IDAgMCAxIDIuMTMtLjA5N2w2Ljg2MyA1LjIwOUwyOC40NTIuODQ0YTIuNDg4IDIuNDg4IDAgMCAxIDEuODQxLS43MjljLjM1MS4wMDkuNjk5LjA5MSAxLjAxOS4yNDVsOC4yMzYgMy45NjFhMi41IDIuNSAwIDAgMSAxLjQxNSAyLjI1M3YuMDk5LS4wNDVWMzMuMzd2LS4wNDUuMDk1YTIuNTAxIDIuNTAxIDAgMCAxLTEuNDE2IDIuMjU3bC04LjIzNSAzLjk2MWEyLjQ5MiAyLjQ5MiAwIDAgMS0xLjA3Ny4yNDZabS43MTYtMjguOTQ3LTExLjk0OCA5LjA2MiAxMS45NTIgOS4wNjUtLjAwNC0xOC4xMjdaIi8+PC9zdmc+)](https://vscode.stainless.com/mcp/%7B%22name%22%3A%22sports-odds-api-mcp%22%2C%22command%22%3A%22npx%22%2C%22args%22%3A%5B%22-y%22%2C%22sports-odds-api-mcp%22%5D%2C%22env%22%3A%7B%22SPORTS_ODDS_API_KEY_HEADER%22%3A%22My%20API%20Key%20Param%22%7D%7D)

> Note: You may need to set environment variables in your MCP client.

**For developers building the next generation of sports stats and/or betting applications:**

The REST API documentation can be found on [sportsgameodds.com](https://sportsgameodds.com/docs/). Javadocs are available on [javadoc.io](https://javadoc.io/doc/com.sportsgameodds.api/sports-odds-api/1.2.1).

<!-- x-release-please-end -->
- 📈 **3k+ odds markets** including moneylines, spreads, over/unders, team props, player props & more
- 🏈 **50+ leagues covered** including NFL, NBA, MLB, NHL, NCAAF, NCAAB, EPL, UCL, UFC, PGA, ATP & more
- 📊 **80+ sportsbooks** with unified odds formats, alt lines & deeplinks
- 📺 **Live scores & stats** coverage on all games, teams, and players
- ⚡ **Sub-100ms response times** and sub-minute updates for fast data
- ☕ **First-class Java SDK** with comprehensive type-safe models
- 💰 **Developer-friendly pricing** with a generous free tier
- ⏱️ **5-minute setup** with copy-paste examples

## Installation

### Gradle

```kotlin
implementation("com.sportsgameodds.api:sports-odds-api:1.2.1")
```

### Maven

```xml
<dependency>
  <groupId>com.sportsgameodds.api</groupId>
  <artifactId>sports-odds-api</artifactId>
  <version>1.2.1</version>
</dependency>
```

## Obtain an API Key

Get a free API key from [sportsgameodds.com](https://sportsgameodds.com/pricing).

Unlike enterprise-only solutions, the Sports Game Odds API offers a developer-friendly experience, transparent pricing, comprehensive documentation, and a generous free tier.

## Usage

```java
import com.sportsgameodds.api.client.SportsGameOddsClient;
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient;
import com.sportsgameodds.api.models.events.EventGetPage;

SportsGameOddsClient client = SportsGameOddsOkHttpClient.builder()
    .apiKeyParam(System.getenv("SPORTS_ODDS_API_KEY_HEADER"))
    .build();

EventGetPage page = client.events().get();
System.out.println(page.items().get(0).getActivity());
```

## ProGuard and R8

Although the SDK uses reflection, it is still usable with [ProGuard](https://github.com/Guardsquare/proguard) and [R8](https://developer.android.com/topic/performance/app-optimization/enable-app-optimization) because `sports-odds-api-core` is published with a [configuration file](sports-odds-api-core/src/main/resources/META-INF/proguard/sports-odds-api-core.pro) containing [keep rules](https://www.guardsquare.com/manual/configuration/usage).

ProGuard and R8 should automatically detect and use the published rules, but you can also manually copy the keep rules if necessary.

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`SportsGameOddsOkHttpClient`](sports-odds-api-client-okhttp/src/main/kotlin/com/sportsgameodds/api/client/okhttp/SportsGameOddsOkHttpClient.kt) or [`SportsGameOddsOkHttpClientAsync`](sports-odds-api-client-okhttp/src/main/kotlin/com/sportsgameodds/api/client/okhttp/SportsGameOddsOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

Also note that there are bugs in older Jackson versions that can affect the SDK. We don't work around all Jackson bugs ([example](https://github.com/FasterXML/jackson-databind/issues/3240)) and expect users to upgrade Jackson for those instead.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff between requests.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

# Real-Time Event Streaming API

This API endpoint is only available to **AllStar** and **custom plan** subscribers. It is not included with basic subscription tiers. [Contact support](mailto:api@sportsgameodds.com) to get access.

This streaming API is currently in **beta**. API call patterns, response formats, and functionality may change. Fully managed streaming via SDK may be available in future releases.

Our Streaming API provides real-time updates for Event objects through WebSocket connections. Instead of polling our REST endpoints, you can maintain a persistent connection to receive instant notifications when events change. This is ideal for applications that need immediate updates with minimal delay.

We use [Pusher Protocol](https://pusher.com/docs/channels/library_auth_reference/pusher-websockets-protocol/) for WebSocket communication. While you can connect using any WebSocket library, we strongly recommend using [Pusher Client Library for Java](https://github.com/pusher/pusher-websocket-java).

## How It Works

The streaming process involves two steps:

1. **Get Connection Details**: Make a request using `client.stream().events()` to receive:
  - WebSocket authentication credentials
  - WebSocket URL/channel info
  - Initial snapshot of current data

2. **Connect and Stream**: Use the provided details to connect via Pusher (or another WebSocket library) and receive real-time `eventID` notifications for changed events

Your API key will have limits on concurrent streams.

## Available Feeds

Subscribe to different feeds using the `feed` query parameter:

| Feed              | Description                                                                 | Required Parameters |
| ----------------- | --------------------------------------------------------------------------- | ------------------- |
| `events:live`     | All events currently in progress (started but not finished)                | None                |
| `events:upcoming` | Upcoming events with available odds for a specific league                  | `leagueID`          |
| `events:byid`     | Updates for a single specific event                                         | `eventID`           |

## Quick Start Example

```java
import com.sportsgameodds.api.client.SportsGameOddsClient;
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient;
import com.sportsgameodds.api.models.stream.StreamEventsResponse;
import com.pusher.client.Pusher;
import com.pusher.client.channel.Channel;

import java.util.HashMap;
import java.util.Map;

public class StreamExample {
    public static void main(String[] args) {
        String STREAM_FEED = "events:live";
        String API_KEY = System.getenv("SPORTS_ODDS_API_KEY_HEADER");

        SportsGameOddsClient client = SportsGameOddsOkHttpClient.builder()
            .apiKeyHeader(API_KEY)
            .build();

        StreamEventsResponse streamInfo = client.stream().events(Map.of("feed", STREAM_FEED));

        Map<String, Object> EVENTS = new HashMap<>();
        streamInfo.getData().forEach(event -> EVENTS.put(event.getEventID(), event));

        Pusher pusher = new Pusher(streamInfo.getPusherKey(), streamInfo.getPusherOptions());
        Channel channel = pusher.subscribe(streamInfo.getChannel());
        channel.bind("data", (channelName, eventData) -> {
            System.out.println("Event changed: " + eventData);
        });

        Runtime.getRuntime().addShutdownHook(new Thread(pusher::disconnect));
    }
}
```

## Requirements

This library requires Java 8 or later.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/SportsGameOdds/sports-odds-api-java/issues) with questions, bugs, or suggestions.
