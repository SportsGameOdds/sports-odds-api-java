// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.markets

import com.sportsgameodds.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketGetParamsTest {

    @Test
    fun create() {
        MarketGetParams.builder()
            .betTypeId("betTypeID")
            .bookmakerId("bookmakerID")
            .cursor("cursor")
            .isMainMarket(true)
            .isProp(true)
            .isSubPeriod(true)
            .isSupported(true)
            .leagueId("leagueID")
            .limit(0.0)
            .oddId("oddID")
            .periodId("periodID")
            .propType("propType")
            .sideId("sideID")
            .sportId("sportID")
            .statEntityId("statEntityID")
            .statId("statID")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MarketGetParams.builder()
                .betTypeId("betTypeID")
                .bookmakerId("bookmakerID")
                .cursor("cursor")
                .isMainMarket(true)
                .isProp(true)
                .isSubPeriod(true)
                .isSupported(true)
                .leagueId("leagueID")
                .limit(0.0)
                .oddId("oddID")
                .periodId("periodID")
                .propType("propType")
                .sideId("sideID")
                .sportId("sportID")
                .statEntityId("statEntityID")
                .statId("statID")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("betTypeID", "betTypeID")
                    .put("bookmakerID", "bookmakerID")
                    .put("cursor", "cursor")
                    .put("isMainMarket", "true")
                    .put("isProp", "true")
                    .put("isSubPeriod", "true")
                    .put("isSupported", "true")
                    .put("leagueID", "leagueID")
                    .put("limit", "0.0")
                    .put("oddID", "oddID")
                    .put("periodID", "periodID")
                    .put("propType", "propType")
                    .put("sideID", "sideID")
                    .put("sportID", "sportID")
                    .put("statEntityID", "statEntityID")
                    .put("statID", "statID")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MarketGetParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
