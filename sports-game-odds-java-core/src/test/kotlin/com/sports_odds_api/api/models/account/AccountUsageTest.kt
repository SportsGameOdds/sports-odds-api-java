// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.models.account

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.sports_odds_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountUsageTest {

    @Test
    fun create() {
        val accountUsage =
            AccountUsage.builder()
                .customerId("customerID")
                .email("email")
                .isActive(true)
                .keyId("keyID")
                .rateLimits(
                    AccountUsage.RateLimits.builder()
                        .perDay(
                            RateLimitInterval.builder()
                                .currentEntities(0L)
                                .currentRequests(0L)
                                .maxEntities(RateLimitInterval.MaxEntities.UnionMember0.UNLIMITED)
                                .maxRequests(RateLimitInterval.MaxRequests.UnionMember0.UNLIMITED)
                                .build()
                        )
                        .perHour(
                            RateLimitInterval.builder()
                                .currentEntities(0L)
                                .currentRequests(0L)
                                .maxEntities(RateLimitInterval.MaxEntities.UnionMember0.UNLIMITED)
                                .maxRequests(RateLimitInterval.MaxRequests.UnionMember0.UNLIMITED)
                                .build()
                        )
                        .perMinute(
                            RateLimitInterval.builder()
                                .currentEntities(0L)
                                .currentRequests(0L)
                                .maxEntities(RateLimitInterval.MaxEntities.UnionMember0.UNLIMITED)
                                .maxRequests(RateLimitInterval.MaxRequests.UnionMember0.UNLIMITED)
                                .build()
                        )
                        .perMonth(
                            RateLimitInterval.builder()
                                .currentEntities(0L)
                                .currentRequests(0L)
                                .maxEntities(RateLimitInterval.MaxEntities.UnionMember0.UNLIMITED)
                                .maxRequests(RateLimitInterval.MaxRequests.UnionMember0.UNLIMITED)
                                .build()
                        )
                        .perSecond(
                            RateLimitInterval.builder()
                                .currentEntities(0L)
                                .currentRequests(0L)
                                .maxEntities(RateLimitInterval.MaxEntities.UnionMember0.UNLIMITED)
                                .maxRequests(RateLimitInterval.MaxRequests.UnionMember0.UNLIMITED)
                                .build()
                        )
                        .build()
                )
                .tier("tier")
                .build()

        assertThat(accountUsage.customerId()).contains("customerID")
        assertThat(accountUsage.email()).contains("email")
        assertThat(accountUsage.isActive()).contains(true)
        assertThat(accountUsage.keyId()).contains("keyID")
        assertThat(accountUsage.rateLimits())
            .contains(
                AccountUsage.RateLimits.builder()
                    .perDay(
                        RateLimitInterval.builder()
                            .currentEntities(0L)
                            .currentRequests(0L)
                            .maxEntities(RateLimitInterval.MaxEntities.UnionMember0.UNLIMITED)
                            .maxRequests(RateLimitInterval.MaxRequests.UnionMember0.UNLIMITED)
                            .build()
                    )
                    .perHour(
                        RateLimitInterval.builder()
                            .currentEntities(0L)
                            .currentRequests(0L)
                            .maxEntities(RateLimitInterval.MaxEntities.UnionMember0.UNLIMITED)
                            .maxRequests(RateLimitInterval.MaxRequests.UnionMember0.UNLIMITED)
                            .build()
                    )
                    .perMinute(
                        RateLimitInterval.builder()
                            .currentEntities(0L)
                            .currentRequests(0L)
                            .maxEntities(RateLimitInterval.MaxEntities.UnionMember0.UNLIMITED)
                            .maxRequests(RateLimitInterval.MaxRequests.UnionMember0.UNLIMITED)
                            .build()
                    )
                    .perMonth(
                        RateLimitInterval.builder()
                            .currentEntities(0L)
                            .currentRequests(0L)
                            .maxEntities(RateLimitInterval.MaxEntities.UnionMember0.UNLIMITED)
                            .maxRequests(RateLimitInterval.MaxRequests.UnionMember0.UNLIMITED)
                            .build()
                    )
                    .perSecond(
                        RateLimitInterval.builder()
                            .currentEntities(0L)
                            .currentRequests(0L)
                            .maxEntities(RateLimitInterval.MaxEntities.UnionMember0.UNLIMITED)
                            .maxRequests(RateLimitInterval.MaxRequests.UnionMember0.UNLIMITED)
                            .build()
                    )
                    .build()
            )
        assertThat(accountUsage.tier()).contains("tier")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountUsage =
            AccountUsage.builder()
                .customerId("customerID")
                .email("email")
                .isActive(true)
                .keyId("keyID")
                .rateLimits(
                    AccountUsage.RateLimits.builder()
                        .perDay(
                            RateLimitInterval.builder()
                                .currentEntities(0L)
                                .currentRequests(0L)
                                .maxEntities(RateLimitInterval.MaxEntities.UnionMember0.UNLIMITED)
                                .maxRequests(RateLimitInterval.MaxRequests.UnionMember0.UNLIMITED)
                                .build()
                        )
                        .perHour(
                            RateLimitInterval.builder()
                                .currentEntities(0L)
                                .currentRequests(0L)
                                .maxEntities(RateLimitInterval.MaxEntities.UnionMember0.UNLIMITED)
                                .maxRequests(RateLimitInterval.MaxRequests.UnionMember0.UNLIMITED)
                                .build()
                        )
                        .perMinute(
                            RateLimitInterval.builder()
                                .currentEntities(0L)
                                .currentRequests(0L)
                                .maxEntities(RateLimitInterval.MaxEntities.UnionMember0.UNLIMITED)
                                .maxRequests(RateLimitInterval.MaxRequests.UnionMember0.UNLIMITED)
                                .build()
                        )
                        .perMonth(
                            RateLimitInterval.builder()
                                .currentEntities(0L)
                                .currentRequests(0L)
                                .maxEntities(RateLimitInterval.MaxEntities.UnionMember0.UNLIMITED)
                                .maxRequests(RateLimitInterval.MaxRequests.UnionMember0.UNLIMITED)
                                .build()
                        )
                        .perSecond(
                            RateLimitInterval.builder()
                                .currentEntities(0L)
                                .currentRequests(0L)
                                .maxEntities(RateLimitInterval.MaxEntities.UnionMember0.UNLIMITED)
                                .maxRequests(RateLimitInterval.MaxRequests.UnionMember0.UNLIMITED)
                                .build()
                        )
                        .build()
                )
                .tier("tier")
                .build()

        val roundtrippedAccountUsage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountUsage),
                jacksonTypeRef<AccountUsage>(),
            )

        assertThat(roundtrippedAccountUsage).isEqualTo(accountUsage)
    }
}
