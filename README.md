# Sports Odds API - Live Sports Data & Sportsbook Betting Odds - Powered by SportsGameOdds API Library

Get live betting odds, spreads, and totals for NFL, NBA, MLB, and 50 additional sports and leagues.
Production-ready Java SDK with 99.9% uptime and sub-minute updates during live games.
Perfect for developers building sportsbook platforms, odds comparison tools, positive EV models, and anything else that requires fast, accurate sports data.

[![Maven Central](https://img.shields.io/maven-central/v/com.sportsgameodds.api/sports-odds-api)](https://central.sonatype.com/artifact/com.sportsgameodds.api/sports-odds-api/1.0.0)
[![javadoc](https://javadoc.io/badge2/com.sportsgameodds.api/sports-odds-api/1.0.0/javadoc.svg)](https://javadoc.io/doc/com.sportsgameodds.api/sports-odds-api/1.0.0)

This library provides convenient access to the Sports Game Odds REST API from applications written in Java.

The REST API documentation can be found on [sportsgameodds.com](https://sportsgameodds.com/docs/).

## Features

**For developers building the next generation of sports stats and/or betting applications:**

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
implementation("com.sportsgameodds.api:sports-odds-api:1.0.0")
```

### Maven

```xml
<dependency>
  <groupId>com.sportsgameodds.api</groupId>
  <artifactId>sports-odds-api</artifactId>
  <version>1.0.0</version>
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
