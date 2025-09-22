// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.models.players

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.sports_odds_api.api.core.JsonValue
import com.sports_odds_api.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlayerGetPageResponseTest {

    @Test
    fun create() {
        val playerGetPageResponse =
            PlayerGetPageResponse.builder()
                .addData(
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
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(mapOf("teamID" to "teamID")),
                                )
                                .build()
                        )
                        .position("position")
                        .sportId("sportID")
                        .teamId("teamID")
                        .build()
                )
                .nextCursor("nextCursor")
                .success(true)
                .build()

        assertThat(playerGetPageResponse.data().getOrNull())
            .containsExactly(
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
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(mapOf("teamID" to "teamID")),
                            )
                            .build()
                    )
                    .position("position")
                    .sportId("sportID")
                    .teamId("teamID")
                    .build()
            )
        assertThat(playerGetPageResponse.nextCursor()).contains("nextCursor")
        assertThat(playerGetPageResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val playerGetPageResponse =
            PlayerGetPageResponse.builder()
                .addData(
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
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(mapOf("teamID" to "teamID")),
                                )
                                .build()
                        )
                        .position("position")
                        .sportId("sportID")
                        .teamId("teamID")
                        .build()
                )
                .nextCursor("nextCursor")
                .success(true)
                .build()

        val roundtrippedPlayerGetPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(playerGetPageResponse),
                jacksonTypeRef<PlayerGetPageResponse>(),
            )

        assertThat(roundtrippedPlayerGetPageResponse).isEqualTo(playerGetPageResponse)
    }
}
