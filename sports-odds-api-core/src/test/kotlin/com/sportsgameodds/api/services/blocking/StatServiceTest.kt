// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.blocking

import com.sportsgameodds.api.TestServerExtension
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient
import com.sportsgameodds.api.models.stats.StatGetParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StatServiceTest {

    @Test
    fun get() {
        val client =
            SportsGameOddsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKeyHeader("My API Key Header")
                .build()
        val statService = client.stats()

        val stats =
            statService.get(
                StatGetParams.builder()
                    .sportId("sportID")
                    .statId("statID")
                    .statLevel("statLevel")
                    .build()
            )

        stats.forEach { it.validate() }
    }
}
