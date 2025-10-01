// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.teams

import com.sportsgameodds.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamGetParamsTest {

    @Test
    fun create() {
        TeamGetParams.builder()
            .cursor("cursor")
            .leagueId("leagueID")
            .limit(0.0)
            .sportId("sportID")
            .teamId("teamID")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TeamGetParams.builder()
                .cursor("cursor")
                .leagueId("leagueID")
                .limit(0.0)
                .sportId("sportID")
                .teamId("teamID")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("leagueID", "leagueID")
                    .put("limit", "0.0")
                    .put("sportID", "sportID")
                    .put("teamID", "teamID")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TeamGetParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
