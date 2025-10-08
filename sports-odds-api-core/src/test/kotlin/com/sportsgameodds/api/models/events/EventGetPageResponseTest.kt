// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.sportsgameodds.api.core.JsonValue
import com.sportsgameodds.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventGetPageResponseTest {

    @Test
    fun create() {
        val eventGetPageResponse =
            EventGetPageResponse.builder()
                .addData(
                    Event.builder()
                        .activity(Event.Activity.builder().count(0.0).score(0.0).build())
                        .eventId("eventID")
                        .info(Event.Info.builder().seasonWeek("seasonWeek").build())
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
                                                            "isMainLine" to true,
                                                            "lastUpdatedAt" to
                                                                "2019-12-27T18:11:19.117Z",
                                                            "odds" to "odds",
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
                                            "teamID" to "teamID",
                                        )
                                    ),
                                )
                                .build()
                        )
                        .results(
                            Event.Results.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(mapOf("foo" to mapOf("foo" to 0))),
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
                .nextCursor("nextCursor")
                .success(true)
                .build()

        assertThat(eventGetPageResponse.data().getOrNull())
            .containsExactly(
                Event.builder()
                    .activity(Event.Activity.builder().count(0.0).score(0.0).build())
                    .eventId("eventID")
                    .info(Event.Info.builder().seasonWeek("seasonWeek").build())
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
                                                        "isMainLine" to true,
                                                        "lastUpdatedAt" to
                                                            "2019-12-27T18:11:19.117Z",
                                                        "odds" to "odds",
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
                                        "teamID" to "teamID",
                                    )
                                ),
                            )
                            .build()
                    )
                    .results(
                        Event.Results.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(mapOf("foo" to mapOf("foo" to 0))),
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
        assertThat(eventGetPageResponse.nextCursor()).contains("nextCursor")
        assertThat(eventGetPageResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventGetPageResponse =
            EventGetPageResponse.builder()
                .addData(
                    Event.builder()
                        .activity(Event.Activity.builder().count(0.0).score(0.0).build())
                        .eventId("eventID")
                        .info(Event.Info.builder().seasonWeek("seasonWeek").build())
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
                                                            "isMainLine" to true,
                                                            "lastUpdatedAt" to
                                                                "2019-12-27T18:11:19.117Z",
                                                            "odds" to "odds",
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
                                            "teamID" to "teamID",
                                        )
                                    ),
                                )
                                .build()
                        )
                        .results(
                            Event.Results.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(mapOf("foo" to mapOf("foo" to 0))),
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
                .nextCursor("nextCursor")
                .success(true)
                .build()

        val roundtrippedEventGetPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventGetPageResponse),
                jacksonTypeRef<EventGetPageResponse>(),
            )

        assertThat(roundtrippedEventGetPageResponse).isEqualTo(eventGetPageResponse)
    }
}
