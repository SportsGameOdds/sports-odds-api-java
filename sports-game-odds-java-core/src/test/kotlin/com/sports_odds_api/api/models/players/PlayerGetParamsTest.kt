// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.models.players

import com.sports_odds_api.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlayerGetParamsTest {

    @Test
    fun create() {
        PlayerGetParams.builder()
            .cursor("cursor")
            .eventId("eventID")
            .limit(0.0)
            .playerId("playerID")
            .teamId("teamID")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PlayerGetParams.builder()
                .cursor("cursor")
                .eventId("eventID")
                .limit(0.0)
                .playerId("playerID")
                .teamId("teamID")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("eventID", "eventID")
                    .put("limit", "0.0")
                    .put("playerID", "playerID")
                    .put("teamID", "teamID")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PlayerGetParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
