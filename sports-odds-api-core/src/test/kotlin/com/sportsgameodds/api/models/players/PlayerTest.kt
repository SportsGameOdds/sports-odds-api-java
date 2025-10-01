// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.players

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.sportsgameodds.api.core.JsonValue
import com.sportsgameodds.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlayerTest {

    @Test
    fun create() {
        val player =
            Player.builder()
                .addAlias("string")
                .jerseyNumber(0.0)
                .leagueId("leagueID")
                .lookups(
                    Player.Lookups.builder()
                        .addAnyName("string")
                        .addFullName("string")
                        .addInitial("string")
                        .build()
                )
                .names(
                    Player.Names.builder()
                        .display("display")
                        .firstName("firstName")
                        .lastName("lastName")
                        .build()
                )
                .playerId("playerID")
                .playerTeams(
                    Player.PlayerTeams.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("teamID" to "teamID")))
                        .build()
                )
                .position("position")
                .sportId("sportID")
                .teamId("teamID")
                .build()

        assertThat(player.aliases().getOrNull()).containsExactly("string")
        assertThat(player.jerseyNumber()).contains(0.0)
        assertThat(player.leagueId()).contains("leagueID")
        assertThat(player.lookups())
            .contains(
                Player.Lookups.builder()
                    .addAnyName("string")
                    .addFullName("string")
                    .addInitial("string")
                    .build()
            )
        assertThat(player.names())
            .contains(
                Player.Names.builder()
                    .display("display")
                    .firstName("firstName")
                    .lastName("lastName")
                    .build()
            )
        assertThat(player.playerId()).contains("playerID")
        assertThat(player.playerTeams())
            .contains(
                Player.PlayerTeams.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("teamID" to "teamID")))
                    .build()
            )
        assertThat(player.position()).contains("position")
        assertThat(player.sportId()).contains("sportID")
        assertThat(player.teamId()).contains("teamID")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val player =
            Player.builder()
                .addAlias("string")
                .jerseyNumber(0.0)
                .leagueId("leagueID")
                .lookups(
                    Player.Lookups.builder()
                        .addAnyName("string")
                        .addFullName("string")
                        .addInitial("string")
                        .build()
                )
                .names(
                    Player.Names.builder()
                        .display("display")
                        .firstName("firstName")
                        .lastName("lastName")
                        .build()
                )
                .playerId("playerID")
                .playerTeams(
                    Player.PlayerTeams.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("teamID" to "teamID")))
                        .build()
                )
                .position("position")
                .sportId("sportID")
                .teamId("teamID")
                .build()

        val roundtrippedPlayer =
            jsonMapper.readValue(jsonMapper.writeValueAsString(player), jacksonTypeRef<Player>())

        assertThat(roundtrippedPlayer).isEqualTo(player)
    }
}
