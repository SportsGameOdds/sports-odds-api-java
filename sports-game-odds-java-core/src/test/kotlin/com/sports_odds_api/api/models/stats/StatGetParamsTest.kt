// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.models.stats

import com.sports_odds_api.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatGetParamsTest {

    @Test
    fun create() {
        StatGetParams.builder().sportId("sportID").statId("statID").statLevel("statLevel").build()
    }

    @Test
    fun queryParams() {
        val params =
            StatGetParams.builder()
                .sportId("sportID")
                .statId("statID")
                .statLevel("statLevel")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("sportID", "sportID")
                    .put("statID", "statID")
                    .put("statLevel", "statLevel")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = StatGetParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
