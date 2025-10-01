// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient
import com.sportsgameodds.api.core.JsonValue
import com.sportsgameodds.api.core.jsonMapper
import com.sportsgameodds.api.models.events.Event
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/sports-odds-api-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = SportsGameOddsOkHttpClient.builder().apiKeyHeader("My API Key Header").build()

        assertThat(client).isNotNull()
        assertThat(client.events()).isNotNull()
        assertThat(client.teams()).isNotNull()
        assertThat(client.players()).isNotNull()
        assertThat(client.leagues()).isNotNull()
        assertThat(client.sports()).isNotNull()
        assertThat(client.stats()).isNotNull()
        assertThat(client.account()).isNotNull()
        assertThat(client.stream()).isNotNull()
    }

    @Test
    fun eventRoundtrip() {
        val jsonMapper = jsonMapper()
        val event =
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
                                                    "lastUpdatedAt" to "2019-12-27T18:11:19.117Z",
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

        val roundtrippedEvent =
            jsonMapper.readValue(jsonMapper.writeValueAsString(event), jacksonTypeRef<Event>())

        assertThat(roundtrippedEvent).isEqualTo(event)
    }
}
