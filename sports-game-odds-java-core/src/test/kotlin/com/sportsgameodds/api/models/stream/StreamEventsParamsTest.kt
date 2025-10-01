// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.stream

import com.sportsgameodds.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StreamEventsParamsTest {

    @Test
    fun create() {
        StreamEventsParams.builder().eventId("eventID").feed("feed").leagueId("leagueID").build()
    }

    @Test
    fun queryParams() {
        val params =
            StreamEventsParams.builder()
                .eventId("eventID")
                .feed("feed")
                .leagueId("leagueID")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("eventID", "eventID")
                    .put("feed", "feed")
                    .put("leagueID", "leagueID")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = StreamEventsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
