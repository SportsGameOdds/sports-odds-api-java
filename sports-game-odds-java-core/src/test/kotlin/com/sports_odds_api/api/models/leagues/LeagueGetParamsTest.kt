// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.models.leagues

import com.sports_odds_api.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LeagueGetParamsTest {

    @Test
    fun create() {
        LeagueGetParams.builder().leagueId("leagueID").sportId("sportID").build()
    }

    @Test
    fun queryParams() {
        val params = LeagueGetParams.builder().leagueId("leagueID").sportId("sportID").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("leagueID", "leagueID").put("sportID", "sportID").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LeagueGetParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
