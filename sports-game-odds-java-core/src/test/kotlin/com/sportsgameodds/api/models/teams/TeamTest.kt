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
                .sportId("sportID")
                .standings(
                    Team.Standings.builder()
                        .losses(0.0)
                        .played(0.0)
                        .position("position")
                        .record("record")
                        .ties(0.0)
                        .wins(0.0)
                        .build()
                )
                .teamId("teamID")
                .build()

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
        assertThat(team.sportId()).contains("sportID")
        assertThat(team.standings())
            .contains(
                Team.Standings.builder()
                    .losses(0.0)
                    .played(0.0)
                    .position("position")
                    .record("record")
                    .ties(0.0)
                    .wins(0.0)
                    .build()
            )
        assertThat(team.teamId()).contains("teamID")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val team =
            Team.builder()
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
                .sportId("sportID")
                .standings(
                    Team.Standings.builder()
                        .losses(0.0)
                        .played(0.0)
                        .position("position")
                        .record("record")
                        .ties(0.0)
                        .wins(0.0)
                        .build()
                )
                .teamId("teamID")
                .build()

        val roundtrippedTeam =
            jsonMapper.readValue(jsonMapper.writeValueAsString(team), jacksonTypeRef<Team>())

        assertThat(roundtrippedTeam).isEqualTo(team)
    }
}
