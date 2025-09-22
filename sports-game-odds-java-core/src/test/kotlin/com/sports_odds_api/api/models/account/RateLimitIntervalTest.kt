// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.models.account

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.sports_odds_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateLimitIntervalTest {

    @Test
    fun create() {
        val rateLimitInterval =
            RateLimitInterval.builder()
                .currentEntities(0L)
                .currentRequests(0L)
                .maxEntities(RateLimitInterval.MaxEntities.UnionMember0.UNLIMITED)
                .maxRequests(RateLimitInterval.MaxRequests.UnionMember0.UNLIMITED)
                .build()

        assertThat(rateLimitInterval.currentEntities()).contains(0L)
        assertThat(rateLimitInterval.currentRequests()).contains(0L)
        assertThat(rateLimitInterval.maxEntities())
            .contains(
                RateLimitInterval.MaxEntities.ofUnionMember0(
                    RateLimitInterval.MaxEntities.UnionMember0.UNLIMITED
                )
            )
        assertThat(rateLimitInterval.maxRequests())
            .contains(
                RateLimitInterval.MaxRequests.ofUnionMember0(
                    RateLimitInterval.MaxRequests.UnionMember0.UNLIMITED
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rateLimitInterval =
            RateLimitInterval.builder()
                .currentEntities(0L)
                .currentRequests(0L)
                .maxEntities(RateLimitInterval.MaxEntities.UnionMember0.UNLIMITED)
                .maxRequests(RateLimitInterval.MaxRequests.UnionMember0.UNLIMITED)
                .build()

        val roundtrippedRateLimitInterval =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rateLimitInterval),
                jacksonTypeRef<RateLimitInterval>(),
            )

        assertThat(roundtrippedRateLimitInterval).isEqualTo(rateLimitInterval)
    }
}
