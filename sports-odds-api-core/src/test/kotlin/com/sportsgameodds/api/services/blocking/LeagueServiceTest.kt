// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.blocking

import com.sportsgameodds.api.TestServerExtension
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient
import com.sportsgameodds.api.models.leagues.LeagueGetParams
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
