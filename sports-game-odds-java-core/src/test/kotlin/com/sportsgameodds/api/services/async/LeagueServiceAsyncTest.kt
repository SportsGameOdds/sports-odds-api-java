// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.async

import com.sportsgameodds.api.TestServerExtension
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClientAsync
import com.sportsgameodds.api.models.leagues.LeagueGetParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LeagueServiceAsyncTest {

    @Test
    fun get() {
        val client =
            SportsGameOddsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKeyHeader("My API Key Header")
                .build()
        val leagueServiceAsync = client.leagues()

        val leaguesFuture =
            leagueServiceAsync.get(
                LeagueGetParams.builder().leagueId("leagueID").sportId("sportID").build()
            )

        val leagues = leaguesFuture.get()
        leagues.forEach { it.validate() }
    }
}
