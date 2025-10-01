// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.blocking

import com.sportsgameodds.api.TestServerExtension
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SportServiceTest {

    @Test
    fun get() {
        val client =
            SportsGameOddsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKeyHeader("My API Key Header")
                .build()
        val sportService = client.sports()

        val sports = sportService.get()

        sports.forEach { it.validate() }
    }
}
