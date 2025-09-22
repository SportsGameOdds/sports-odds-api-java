// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.services.blocking

import com.sports_odds_api.api.TestServerExtension
import com.sports_odds_api.api.client.okhttp.SportsGameOddsOkHttpClient
import com.sports_odds_api.api.models.leagues.LeagueGetParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LeagueServiceTest {

    @Test
    fun get() {
        val client =
            SportsGameOddsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKeyHeader("My API Key Header")
                .build()
        val leagueService = client.leagues()

        val leagues =
            leagueService.get(
                LeagueGetParams.builder().leagueId("leagueID").sportId("sportID").build()
            )

        leagues.forEach { it.validate() }
    }
}
