// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.teams

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.sportsgameodds.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamTest {

    @Test
    fun create() {
        val team =
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
                .names(Team.Names.builder().long_("long").medium("medium").short_("short").build())
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

        assertThat(team.coach()).contains(Team.Coach.builder().name("name").build())
        assertThat(team.colors())
            .contains(
                Team.Colors.builder()
                    .primary("primary")
                    .primaryContrast("primaryContrast")
                    .secondary("secondary")
                    .secondaryContrast("secondaryContrast")
                    .build()
            )
        assertThat(team.leagueId()).contains("leagueID")
        assertThat(team.logo()).contains("logo")
        assertThat(team.lookups()).contains(Team.Lookups.builder().addTeamName("string").build())
        assertThat(team.names())
            .contains(Team.Names.builder().long_("long").medium("medium").short_("short").build())
        assertThat(team.owner()).contains(Team.Owner.builder().name("name").build())
        assertThat(team.sportId()).contains("sportID")
        assertThat(team.standings())
            .contains(
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
        assertThat(team.teamId()).contains("teamID")
        assertThat(team.venue())
            .contains(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val team =
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
                .names(Team.Names.builder().long_("long").medium("medium").short_("short").build())
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

        val roundtrippedTeam =
            jsonMapper.readValue(jsonMapper.writeValueAsString(team), jacksonTypeRef<Team>())

        assertThat(roundtrippedTeam).isEqualTo(team)
    }
}
