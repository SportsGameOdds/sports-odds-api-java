// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.services.blocking

import com.sports_odds_api.api.TestServerExtension
import com.sports_odds_api.api.client.okhttp.SportsGameOddsOkHttpClient
import com.sports_odds_api.api.models.stream.StreamEventsParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StreamServiceTest {

    @Test
    fun events() {
        val client =
            SportsGameOddsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKeyHeader("My API Key Header")
                .build()
        val streamService = client.stream()

        val response =
            streamService.events(
                StreamEventsParams.builder()
                    .eventId("eventID")
                    .feed("feed")
                    .leagueId("leagueID")
                    .build()
            )

        response.validate()
    }
}
