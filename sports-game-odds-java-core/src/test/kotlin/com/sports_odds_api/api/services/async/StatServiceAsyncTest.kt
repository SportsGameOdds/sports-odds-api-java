// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.services.async

import com.sports_odds_api.api.TestServerExtension
import com.sports_odds_api.api.client.okhttp.SportsGameOddsOkHttpClientAsync
import com.sports_odds_api.api.models.stats.StatGetParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StatServiceAsyncTest {

    @Test
    fun get() {
        val client =
            SportsGameOddsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKeyHeader("My API Key Header")
                .build()
        val statServiceAsync = client.stats()

        val statsFuture =
            statServiceAsync.get(
                StatGetParams.builder()
                    .sportId("sportID")
                    .statId("statID")
                    .statLevel("statLevel")
                    .build()
            )

        val stats = statsFuture.get()
        stats.forEach { it.validate() }
    }
}
