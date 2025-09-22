// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.models.leagues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.sports_odds_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LeagueTest {

    @Test
    fun create() {
        val league =
            League.builder()
                .enabled(true)
                .leagueId("leagueID")
                .name("name")
                .shortName("shortName")
                .sportId("sportID")
                .build()

        assertThat(league.enabled()).contains(true)
        assertThat(league.leagueId()).contains("leagueID")
        assertThat(league.name()).contains("name")
        assertThat(league.shortName()).contains("shortName")
        assertThat(league.sportId()).contains("sportID")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val league =
            League.builder()
                .enabled(true)
                .leagueId("leagueID")
                .name("name")
                .shortName("shortName")
                .sportId("sportID")
                .build()

        val roundtrippedLeague =
            jsonMapper.readValue(jsonMapper.writeValueAsString(league), jacksonTypeRef<League>())

        assertThat(roundtrippedLeague).isEqualTo(league)
    }
}
