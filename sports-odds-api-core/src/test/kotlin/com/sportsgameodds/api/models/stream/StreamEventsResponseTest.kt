// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.stream

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.sportsgameodds.api.core.JsonValue
import com.sportsgameodds.api.core.jsonMapper
import com.sportsgameodds.api.models.events.Event
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StreamEventsResponseTest {

    @Test
    fun create() {
        val streamEventsResponse =
            StreamEventsResponse.builder()
                .channel("channel")
                .addData(
                    Event.builder()
                        .activity(Event.Activity.builder().count(0.0).score(0.0).build())
                        .eventId("eventID")
                        .info(
                            Event.Info.builder()
                                .addBroadcast(
                                    Event.Info.Broadcast.builder()
                                        .broadcasterId("broadcasterID")
                                        .name("name")
                                        .type(Event.Info.Broadcast.Type.TV)
                                        .build()
                                )
                                .referee(Event.Info.Referee.builder().name("name").build())
                                .seasonWeek("seasonWeek")
                                .venue(
                                    Event.Info.Venue.builder()
                                        .address("address")
                                        .capacity(0.0)
                                        .city("city")
                                        .countryCode("countryCode")
                                        .countryName("countryName")
                                        .name("name")
                                        .regionCode("regionCode")
                                        .regionName("regionName")
                                        .build()
                                )
                                .build()
                        )
                        .leagueId("leagueID")
                        .manual(true)
                        .odds(
                            Event.Odds.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "betTypeID" to "betTypeID",
                                            "bookOdds" to "bookOdds",
                                            "bookOddsAvailable" to true,
                                            "bookOverUnder" to "bookOverUnder",
                                            "bookSpread" to "bookSpread",
                                            "byBookmaker" to
                                                mapOf(
                                                    "foo" to
                                                        mapOf(
                                                            "available" to true,
                                                            "bookmakerID" to "bookmakerID",
                                                            "closeOdds" to "closeOdds",
                                                            "closeOverUnder" to "closeOverUnder",
                                                            "closeSpread" to "closeSpread",
                                                            "isMainLine" to true,
                                                            "lastUpdatedAt" to
                                                                "2019-12-27T18:11:19.117Z",
                                                            "odds" to "odds",
                                                            "openOdds" to "openOdds",
                                                            "openOverUnder" to "openOverUnder",
                                                            "openSpread" to "openSpread",
                                                            "overUnder" to "overUnder",
                                                            "spread" to "spread",
                                                        )
                                                ),
                                            "cancelled" to true,
                                            "ended" to true,
                                            "fairOdds" to "fairOdds",
                                            "fairOddsAvailable" to true,
                                            "fairOverUnder" to "fairOverUnder",
                                            "fairSpread" to "fairSpread",
                                            "marketName" to "marketName",
                                            "oddID" to "oddID",
                                            "opposingOddID" to "opposingOddID",
                                            "periodID" to "periodID",
                                            "playerID" to "playerID",
                                            "score" to 0,
                                            "scoringSupported" to true,
                                            "sideID" to "sideID",
                                            "started" to true,
                                            "statEntityID" to "statEntityID",
                                            "statID" to "statID",
                                        )
                                    ),
                                )
                                .build()
                        )
                        .players(
                            Event.Players.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "alias" to "alias",
                                            "firstName" to "firstName",
                                            "lastName" to "lastName",
                                            "name" to "name",
                                            "photo" to "photo",
                                            "playerID" to "playerID",
                                            "status" to "ir",
                                            "statusDetails" to "statusDetails",
                                            "teamID" to "teamID",
                                        )
                                    ),
                                )
                                .build()
                        )
                        .results(
                            Event.Results.builder()
                                .putAdditionalProperty(
                                    "game",
                                    JsonValue.from(
                                        mapOf(
                                            "home" to mapOf("points" to 12),
                                            "away" to mapOf("points" to 10),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .sportId("sportID")
                        .status(
                            Event.Status.builder()
                                .cancelled(true)
                                .completed(true)
                                .currentPeriodId("currentPeriodID")
                                .delayed(true)
                                .displayLong("displayLong")
                                .displayShort("displayShort")
                                .ended(true)
                                .finalized(true)
                                .hardStart(true)
                                .live(true)
                                .oddsAvailable(true)
                                .oddsPresent(true)
                                .periods(
                                    Event.Status.Periods.builder()
                                        .addEnded("string")
                                        .addStarted("string")
                                        .build()
                                )
                                .previousPeriodId("previousPeriodID")
                                .reGrade(true)
                                .started(true)
                                .startsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .teams(
                            Event.Teams.builder()
                                .away(
                                    Event.Teams.Away.builder()
                                        .colors(
                                            Event.Teams.Away.Colors.builder()
                                                .primary("primary")
                                                .primaryContrast("primaryContrast")
                                                .secondary("secondary")
                                                .secondaryContrast("secondaryContrast")
                                                .build()
                                        )
                                        .logo("logo")
                                        .names(
                                            Event.Teams.Away.Names.builder()
                                                .long_("long")
                                                .medium("medium")
                                                .short_("short")
                                                .build()
                                        )
                                        .score(0.0)
                                        .statEntityId("statEntityID")
                                        .teamId("teamID")
                                        .build()
                                )
                                .home(
                                    Event.Teams.Home.builder()
                                        .colors(
                                            Event.Teams.Home.Colors.builder()
                                                .primary("primary")
                                                .primaryContrast("primaryContrast")
                                                .secondary("secondary")
                                                .secondaryContrast("secondaryContrast")
                                                .build()
                                        )
                                        .logo("logo")
                                        .names(
                                            Event.Teams.Home.Names.builder()
                                                .long_("long")
                                                .medium("medium")
                                                .short_("short")
                                                .build()
                                        )
                                        .score(0.0)
                                        .statEntityId("statEntityID")
                                        .teamId("teamID")
                                        .build()
                                )
                                .build()
                        )
                        .type("type")
                        .build()
                )
                .pusherKey("pusherKey")
                .pusherOptions(
                    StreamEventsResponse.PusherOptions.builder()
                        .channelAuthorization(
                            StreamEventsResponse.PusherOptions.ChannelAuthorization.builder()
                                .endpoint("https://example.com")
                                .headers(
                                    StreamEventsResponse.PusherOptions.ChannelAuthorization.Headers
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .cluster("cluster")
                        .httpHost("httpHost")
                        .httpPort(0L)
                        .httpsPort(0L)
                        .wsHost("wsHost")
                        .wsPort(0L)
                        .wssPort(0L)
                        .build()
                )
                .success(true)
                .user("user")
                .build()

        assertThat(streamEventsResponse.channel()).contains("channel")
        assertThat(streamEventsResponse.data().getOrNull())
            .containsExactly(
                Event.builder()
                    .activity(Event.Activity.builder().count(0.0).score(0.0).build())
                    .eventId("eventID")
                    .info(
                        Event.Info.builder()
                            .addBroadcast(
                                Event.Info.Broadcast.builder()
                                    .broadcasterId("broadcasterID")
                                    .name("name")
                                    .type(Event.Info.Broadcast.Type.TV)
                                    .build()
                            )
                            .referee(Event.Info.Referee.builder().name("name").build())
                            .seasonWeek("seasonWeek")
                            .venue(
                                Event.Info.Venue.builder()
                                    .address("address")
                                    .capacity(0.0)
                                    .city("city")
                                    .countryCode("countryCode")
                                    .countryName("countryName")
                                    .name("name")
                                    .regionCode("regionCode")
                                    .regionName("regionName")
                                    .build()
                            )
                            .build()
                    )
                    .leagueId("leagueID")
                    .manual(true)
                    .odds(
                        Event.Odds.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "betTypeID" to "betTypeID",
                                        "bookOdds" to "bookOdds",
                                        "bookOddsAvailable" to true,
                                        "bookOverUnder" to "bookOverUnder",
                                        "bookSpread" to "bookSpread",
                                        "byBookmaker" to
                                            mapOf(
                                                "foo" to
                                                    mapOf(
                                                        "available" to true,
                                                        "bookmakerID" to "bookmakerID",
                                                        "closeOdds" to "closeOdds",
                                                        "closeOverUnder" to "closeOverUnder",
                                                        "closeSpread" to "closeSpread",
                                                        "isMainLine" to true,
                                                        "lastUpdatedAt" to
                                                            "2019-12-27T18:11:19.117Z",
                                                        "odds" to "odds",
                                                        "openOdds" to "openOdds",
                                                        "openOverUnder" to "openOverUnder",
                                                        "openSpread" to "openSpread",
                                                        "overUnder" to "overUnder",
                                                        "spread" to "spread",
                                                    )
                                            ),
                                        "cancelled" to true,
                                        "ended" to true,
                                        "fairOdds" to "fairOdds",
                                        "fairOddsAvailable" to true,
                                        "fairOverUnder" to "fairOverUnder",
                                        "fairSpread" to "fairSpread",
                                        "marketName" to "marketName",
                                        "oddID" to "oddID",
                                        "opposingOddID" to "opposingOddID",
                                        "periodID" to "periodID",
                                        "playerID" to "playerID",
                                        "score" to 0,
                                        "scoringSupported" to true,
                                        "sideID" to "sideID",
                                        "started" to true,
                                        "statEntityID" to "statEntityID",
                                        "statID" to "statID",
                                    )
                                ),
                            )
                            .build()
                    )
                    .players(
                        Event.Players.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "alias" to "alias",
                                        "firstName" to "firstName",
                                        "lastName" to "lastName",
                                        "name" to "name",
                                        "photo" to "photo",
                                        "playerID" to "playerID",
                                        "status" to "ir",
                                        "statusDetails" to "statusDetails",
                                        "teamID" to "teamID",
                                    )
                                ),
                            )
                            .build()
                    )
                    .results(
                        Event.Results.builder()
                            .putAdditionalProperty(
                                "game",
                                JsonValue.from(
                                    mapOf(
                                        "home" to mapOf("points" to 12),
                                        "away" to mapOf("points" to 10),
                                    )
                                ),
                            )
                            .build()
                    )
                    .sportId("sportID")
                    .status(
                        Event.Status.builder()
                            .cancelled(true)
                            .completed(true)
                            .currentPeriodId("currentPeriodID")
                            .delayed(true)
                            .displayLong("displayLong")
                            .displayShort("displayShort")
                            .ended(true)
                            .finalized(true)
                            .hardStart(true)
                            .live(true)
                            .oddsAvailable(true)
                            .oddsPresent(true)
                            .periods(
                                Event.Status.Periods.builder()
                                    .addEnded("string")
                                    .addStarted("string")
                                    .build()
                            )
                            .previousPeriodId("previousPeriodID")
                            .reGrade(true)
                            .started(true)
                            .startsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .teams(
                        Event.Teams.builder()
                            .away(
                                Event.Teams.Away.builder()
                                    .colors(
                                        Event.Teams.Away.Colors.builder()
                                            .primary("primary")
                                            .primaryContrast("primaryContrast")
                                            .secondary("secondary")
                                            .secondaryContrast("secondaryContrast")
                                            .build()
                                    )
                                    .logo("logo")
                                    .names(
                                        Event.Teams.Away.Names.builder()
                                            .long_("long")
                                            .medium("medium")
                                            .short_("short")
                                            .build()
                                    )
                                    .score(0.0)
                                    .statEntityId("statEntityID")
                                    .teamId("teamID")
                                    .build()
                            )
                            .home(
                                Event.Teams.Home.builder()
                                    .colors(
                                        Event.Teams.Home.Colors.builder()
                                            .primary("primary")
                                            .primaryContrast("primaryContrast")
                                            .secondary("secondary")
                                            .secondaryContrast("secondaryContrast")
                                            .build()
                                    )
                                    .logo("logo")
                                    .names(
                                        Event.Teams.Home.Names.builder()
                                            .long_("long")
                                            .medium("medium")
                                            .short_("short")
                                            .build()
                                    )
                                    .score(0.0)
                                    .statEntityId("statEntityID")
                                    .teamId("teamID")
                                    .build()
                            )
                            .build()
                    )
                    .type("type")
                    .build()
            )
        assertThat(streamEventsResponse.pusherKey()).contains("pusherKey")
        assertThat(streamEventsResponse.pusherOptions())
            .contains(
                StreamEventsResponse.PusherOptions.builder()
                    .channelAuthorization(
                        StreamEventsResponse.PusherOptions.ChannelAuthorization.builder()
                            .endpoint("https://example.com")
                            .headers(
                                StreamEventsResponse.PusherOptions.ChannelAuthorization.Headers
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .cluster("cluster")
                    .httpHost("httpHost")
                    .httpPort(0L)
                    .httpsPort(0L)
                    .wsHost("wsHost")
                    .wsPort(0L)
                    .wssPort(0L)
                    .build()
            )
        assertThat(streamEventsResponse.success()).contains(true)
        assertThat(streamEventsResponse.user()).contains("user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val streamEventsResponse =
            StreamEventsResponse.builder()
                .channel("channel")
                .addData(
                    Event.builder()
                        .activity(Event.Activity.builder().count(0.0).score(0.0).build())
                        .eventId("eventID")
                        .info(
                            Event.Info.builder()
                                .addBroadcast(
                                    Event.Info.Broadcast.builder()
                                        .broadcasterId("broadcasterID")
                                        .name("name")
                                        .type(Event.Info.Broadcast.Type.TV)
                                        .build()
                                )
                                .referee(Event.Info.Referee.builder().name("name").build())
                                .seasonWeek("seasonWeek")
                                .venue(
                                    Event.Info.Venue.builder()
                                        .address("address")
                                        .capacity(0.0)
                                        .city("city")
                                        .countryCode("countryCode")
                                        .countryName("countryName")
                                        .name("name")
                                        .regionCode("regionCode")
                                        .regionName("regionName")
                                        .build()
                                )
                                .build()
                        )
                        .leagueId("leagueID")
                        .manual(true)
                        .odds(
                            Event.Odds.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "betTypeID" to "betTypeID",
                                            "bookOdds" to "bookOdds",
                                            "bookOddsAvailable" to true,
                                            "bookOverUnder" to "bookOverUnder",
                                            "bookSpread" to "bookSpread",
                                            "byBookmaker" to
                                                mapOf(
                                                    "foo" to
                                                        mapOf(
                                                            "available" to true,
                                                            "bookmakerID" to "bookmakerID",
                                                            "closeOdds" to "closeOdds",
                                                            "closeOverUnder" to "closeOverUnder",
                                                            "closeSpread" to "closeSpread",
                                                            "isMainLine" to true,
                                                            "lastUpdatedAt" to
                                                                "2019-12-27T18:11:19.117Z",
                                                            "odds" to "odds",
                                                            "openOdds" to "openOdds",
                                                            "openOverUnder" to "openOverUnder",
                                                            "openSpread" to "openSpread",
                                                            "overUnder" to "overUnder",
                                                            "spread" to "spread",
                                                        )
                                                ),
                                            "cancelled" to true,
                                            "ended" to true,
                                            "fairOdds" to "fairOdds",
                                            "fairOddsAvailable" to true,
                                            "fairOverUnder" to "fairOverUnder",
                                            "fairSpread" to "fairSpread",
                                            "marketName" to "marketName",
                                            "oddID" to "oddID",
                                            "opposingOddID" to "opposingOddID",
                                            "periodID" to "periodID",
                                            "playerID" to "playerID",
                                            "score" to 0,
                                            "scoringSupported" to true,
                                            "sideID" to "sideID",
                                            "started" to true,
                                            "statEntityID" to "statEntityID",
                                            "statID" to "statID",
                                        )
                                    ),
                                )
                                .build()
                        )
                        .players(
                            Event.Players.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "alias" to "alias",
                                            "firstName" to "firstName",
                                            "lastName" to "lastName",
                                            "name" to "name",
                                            "photo" to "photo",
                                            "playerID" to "playerID",
                                            "status" to "ir",
                                            "statusDetails" to "statusDetails",
                                            "teamID" to "teamID",
                                        )
                                    ),
                                )
                                .build()
                        )
                        .results(
                            Event.Results.builder()
                                .putAdditionalProperty(
                                    "game",
                                    JsonValue.from(
                                        mapOf(
                                            "home" to mapOf("points" to 12),
                                            "away" to mapOf("points" to 10),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .sportId("sportID")
                        .status(
                            Event.Status.builder()
                                .cancelled(true)
                                .completed(true)
                                .currentPeriodId("currentPeriodID")
                                .delayed(true)
                                .displayLong("displayLong")
                                .displayShort("displayShort")
                                .ended(true)
                                .finalized(true)
                                .hardStart(true)
                                .live(true)
                                .oddsAvailable(true)
                                .oddsPresent(true)
                                .periods(
                                    Event.Status.Periods.builder()
                                        .addEnded("string")
                                        .addStarted("string")
                                        .build()
                                )
                                .previousPeriodId("previousPeriodID")
                                .reGrade(true)
                                .started(true)
                                .startsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .teams(
                            Event.Teams.builder()
                                .away(
                                    Event.Teams.Away.builder()
                                        .colors(
                                            Event.Teams.Away.Colors.builder()
                                                .primary("primary")
                                                .primaryContrast("primaryContrast")
                                                .secondary("secondary")
                                                .secondaryContrast("secondaryContrast")
                                                .build()
                                        )
                                        .logo("logo")
                                        .names(
                                            Event.Teams.Away.Names.builder()
                                                .long_("long")
                                                .medium("medium")
                                                .short_("short")
                                                .build()
                                        )
                                        .score(0.0)
                                        .statEntityId("statEntityID")
                                        .teamId("teamID")
                                        .build()
                                )
                                .home(
                                    Event.Teams.Home.builder()
                                        .colors(
                                            Event.Teams.Home.Colors.builder()
                                                .primary("primary")
                                                .primaryContrast("primaryContrast")
                                                .secondary("secondary")
                                                .secondaryContrast("secondaryContrast")
                                                .build()
                                        )
                                        .logo("logo")
                                        .names(
                                            Event.Teams.Home.Names.builder()
                                                .long_("long")
                                                .medium("medium")
                                                .short_("short")
                                                .build()
                                        )
                                        .score(0.0)
                                        .statEntityId("statEntityID")
                                        .teamId("teamID")
                                        .build()
                                )
                                .build()
                        )
                        .type("type")
                        .build()
                )
                .pusherKey("pusherKey")
                .pusherOptions(
                    StreamEventsResponse.PusherOptions.builder()
                        .channelAuthorization(
                            StreamEventsResponse.PusherOptions.ChannelAuthorization.builder()
                                .endpoint("https://example.com")
                                .headers(
                                    StreamEventsResponse.PusherOptions.ChannelAuthorization.Headers
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .cluster("cluster")
                        .httpHost("httpHost")
                        .httpPort(0L)
                        .httpsPort(0L)
                        .wsHost("wsHost")
                        .wsPort(0L)
                        .wssPort(0L)
                        .build()
                )
                .success(true)
                .user("user")
                .build()

        val roundtrippedStreamEventsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(streamEventsResponse),
                jacksonTypeRef<StreamEventsResponse>(),
            )

        assertThat(roundtrippedStreamEventsResponse).isEqualTo(streamEventsResponse)
    }
}
