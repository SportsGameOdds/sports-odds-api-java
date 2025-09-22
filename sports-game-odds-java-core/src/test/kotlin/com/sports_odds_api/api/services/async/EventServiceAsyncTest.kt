// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.services.async

import com.sports_odds_api.api.TestServerExtension
import com.sports_odds_api.api.client.okhttp.SportsGameOddsOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventServiceAsyncTest {

    @Test
    fun get() {
        val client =
            SportsGameOddsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKeyHeader("My API Key Header")
                .build()
        val eventServiceAsync = client.events()

        val pageFuture = eventServiceAsync.get()

        val page = pageFuture.get()
        page.response().validate()
    }
}
