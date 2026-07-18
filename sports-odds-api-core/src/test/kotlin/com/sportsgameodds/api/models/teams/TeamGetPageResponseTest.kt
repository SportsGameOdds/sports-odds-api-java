// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.teams

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.sportsgameodds.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamGetPageResponseTest {

    @Test
    fun create() {
        val teamGetPageResponse =
            TeamGetPageResponse.builder()
                .addData(
                    Team.builder()
                        .coach(Team.Coach.builder().name("name").build())
                        .colors(
                            Team.Colors.builder()
                                .primary("primary")
                                .primaryContrast("primaryContrast")
                                .secondary("secondary")
                                .secondaryContrast("secondaryContrast")
                                .build()
                        )
                        .leagueId("leagueID")
                        .logo("logo")
                        .lookups(Team.Lookups.builder().addTeamName("string").build())
                        .names(
                            Team.Names.builder()
                                .long_("long")
                                .medium("medium")
                                .short_("short")
                                .build()
                        )
                        .owner(Team.Owner.builder().name("name").build())
                        .sportId("sportID")
                        .standings(
                            Team.Standings.builder()
                                .last5("last5")
                                .losses(0.0)
                                .played(0.0)
                                .position("position")
                                .record("record")
                                .streak(0.0)
                                .ties(0.0)
                                .wins(0.0)
                                .build()
                        )
                        .teamId("teamID")
                        .venue(
                            Team.Venue.builder()
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
                .nextCursor("nextCursor")
                .success(true)
                .build()

        assertThat(teamGetPageResponse.data().getOrNull())
            .containsExactly(
                Team.builder()
                    .coach(Team.Coach.builder().name("name").build())
                    .colors(
                        Team.Colors.builder()
                            .primary("primary")
                            .primaryContrast("primaryContrast")
                            .secondary("secondary")
                            .secondaryContrast("secondaryContrast")
                            .build()
                    )
                    .leagueId("leagueID")
                    .logo("logo")
                    .lookups(Team.Lookups.builder().addTeamName("string").build())
                    .names(
                        Team.Names.builder().long_("long").medium("medium").short_("short").build()
                    )
                    .owner(Team.Owner.builder().name("name").build())
                    .sportId("sportID")
                    .standings(
                        Team.Standings.builder()
                            .last5("last5")
                            .losses(0.0)
                            .played(0.0)
                            .position("position")
                            .record("record")
                            .streak(0.0)
                            .ties(0.0)
                            .wins(0.0)
                            .build()
                    )
                    .teamId("teamID")
                    .venue(
                        Team.Venue.builder()
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
        assertThat(teamGetPageResponse.nextCursor()).contains("nextCursor")
        assertThat(teamGetPageResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamGetPageResponse =
            TeamGetPageResponse.builder()
                .addData(
                    Team.builder()
                        .coach(Team.Coach.builder().name("name").build())
                        .colors(
                            Team.Colors.builder()
                                .primary("primary")
                                .primaryContrast("primaryContrast")
                                .secondary("secondary")
                                .secondaryContrast("secondaryContrast")
                                .build()
                        )
                        .leagueId("leagueID")
                        .logo("logo")
                        .lookups(Team.Lookups.builder().addTeamName("string").build())
                        .names(
                            Team.Names.builder()
                                .long_("long")
                                .medium("medium")
                                .short_("short")
                                .build()
                        )
                        .owner(Team.Owner.builder().name("name").build())
                        .sportId("sportID")
                        .standings(
                            Team.Standings.builder()
                                .last5("last5")
                                .losses(0.0)
                                .played(0.0)
                                .position("position")
                                .record("record")
                                .streak(0.0)
                                .ties(0.0)
                                .wins(0.0)
                                .build()
                        )
                        .teamId("teamID")
                        .venue(
                            Team.Venue.builder()
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
                .nextCursor("nextCursor")
                .success(true)
                .build()

        val roundtrippedTeamGetPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamGetPageResponse),
                jacksonTypeRef<TeamGetPageResponse>(),
            )

        assertThat(roundtrippedTeamGetPageResponse).isEqualTo(teamGetPageResponse)
    }
}
