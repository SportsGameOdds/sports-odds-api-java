// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.models.events

import com.sports_odds_api.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventGetParamsTest {

    @Test
    fun create() {
        EventGetParams.builder()
            .bookmakerId("bookmakerID")
            .cancelled(true)
            .cursor("cursor")
            .ended(true)
            .eventId("eventID")
            .finalized(true)
            .includeAltLines(true)
            .includeOpposingOdds(true)
            .leagueId("leagueID")
            .limit(0.0)
            .live(true)
            .oddId("oddID")
            .oddsAvailable(true)
            .oddsPresent(true)
            .playerId("playerID")
            .sportId("sportID")
            .started(true)
            .startsAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startsBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .teamId("teamID")
            .type("type")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EventGetParams.builder()
                .bookmakerId("bookmakerID")
                .cancelled(true)
                .cursor("cursor")
                .ended(true)
                .eventId("eventID")
                .finalized(true)
                .includeAltLines(true)
                .includeOpposingOdds(true)
                .leagueId("leagueID")
                .limit(0.0)
                .live(true)
                .oddId("oddID")
                .oddsAvailable(true)
                .oddsPresent(true)
                .playerId("playerID")
                .sportId("sportID")
                .started(true)
                .startsAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startsBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .teamId("teamID")
                .type("type")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("bookmakerID", "bookmakerID")
                    .put("cancelled", "true")
                    .put("cursor", "cursor")
                    .put("ended", "true")
                    .put("eventID", "eventID")
                    .put("finalized", "true")
                    .put("includeAltLines", "true")
                    .put("includeOpposingOdds", "true")
                    .put("leagueID", "leagueID")
                    .put("limit", "0.0")
                    .put("live", "true")
                    .put("oddID", "oddID")
                    .put("oddsAvailable", "true")
                    .put("oddsPresent", "true")
                    .put("playerID", "playerID")
                    .put("sportID", "sportID")
                    .put("started", "true")
                    .put("startsAfter", "2019-12-27T18:11:19.117Z")
                    .put("startsBefore", "2019-12-27T18:11:19.117Z")
                    .put("teamID", "teamID")
                    .put("type", "type")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EventGetParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
