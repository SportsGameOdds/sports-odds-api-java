// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.async

import com.sportsgameodds.api.TestServerExtension
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SportServiceAsyncTest {

    @Test
    fun get() {
        val client =
            SportsGameOddsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKeyHeader("My API Key Header")
                .build()
        val sportServiceAsync = client.sports()

        val sportsFuture = sportServiceAsync.get()

        val sports = sportsFuture.get()
        sports.forEach { it.validate() }
    }
}
