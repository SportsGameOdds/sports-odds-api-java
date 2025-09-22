// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.services.async

import com.sports_odds_api.api.TestServerExtension
import com.sports_odds_api.api.client.okhttp.SportsGameOddsOkHttpClientAsync
import com.sports_odds_api.api.models.stream.StreamEventsParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StreamServiceAsyncTest {

    @Test
    fun events() {
        val client =
            SportsGameOddsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKeyHeader("My API Key Header")
                .build()
        val streamServiceAsync = client.stream()

        val responseFuture =
            streamServiceAsync.events(
                StreamEventsParams.builder()
                    .eventId("eventID")
                    .feed("feed")
                    .leagueId("leagueID")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
