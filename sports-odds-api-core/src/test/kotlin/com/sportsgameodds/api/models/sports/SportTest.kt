// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.sports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.sportsgameodds.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SportTest {

    @Test
    fun create() {
        val sport =
            Sport.builder()
                .backgroundImage("backgroundImage")
                .addBasePeriod("string")
                .clockType("clockType")
                .defaultPopularityScore(0.0)
                .enabled(true)
                .eventWord(
                    Sport.EventWord.builder()
                        .long_(
                            Sport.EventWord.Long.builder()
                                .plural("plural")
                                .singular("singular")
                                .build()
                        )
                        .short_(
                            Sport.EventWord.Short.builder()
                                .plural("plural")
                                .singular("singular")
                                .build()
                        )
                        .build()
                )
                .addExtraPeriod("string")
                .hasMeaningfulHomeAway(true)
                .imageIcon("imageIcon")
                .name("name")
                .pointWord(
                    Sport.PointWord.builder()
                        .long_(
                            Sport.PointWord.Long.builder()
                                .plural("plural")
                                .singular("singular")
                                .build()
                        )
                        .short_(
                            Sport.PointWord.Short.builder()
                                .plural("plural")
                                .singular("singular")
                                .build()
                        )
                        .build()
                )
                .shortName("shortName")
                .sportId("sportID")
                .squareImage("squareImage")
                .build()

        assertThat(sport.backgroundImage()).contains("backgroundImage")
        assertThat(sport.basePeriods().getOrNull()).containsExactly("string")
        assertThat(sport.clockType()).contains("clockType")
        assertThat(sport.defaultPopularityScore()).contains(0.0)
        assertThat(sport.enabled()).contains(true)
        assertThat(sport.eventWord())
            .contains(
                Sport.EventWord.builder()
                    .long_(
                        Sport.EventWord.Long.builder().plural("plural").singular("singular").build()
                    )
                    .short_(
                        Sport.EventWord.Short.builder()
                            .plural("plural")
                            .singular("singular")
                            .build()
                    )
                    .build()
            )
        assertThat(sport.extraPeriods().getOrNull()).containsExactly("string")
        assertThat(sport.hasMeaningfulHomeAway()).contains(true)
        assertThat(sport.imageIcon()).contains("imageIcon")
        assertThat(sport.name()).contains("name")
        assertThat(sport.pointWord())
            .contains(
                Sport.PointWord.builder()
                    .long_(
                        Sport.PointWord.Long.builder().plural("plural").singular("singular").build()
                    )
                    .short_(
                        Sport.PointWord.Short.builder()
                            .plural("plural")
                            .singular("singular")
                            .build()
                    )
                    .build()
            )
        assertThat(sport.shortName()).contains("shortName")
        assertThat(sport.sportId()).contains("sportID")
        assertThat(sport.squareImage()).contains("squareImage")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sport =
            Sport.builder()
                .backgroundImage("backgroundImage")
                .addBasePeriod("string")
                .clockType("clockType")
                .defaultPopularityScore(0.0)
                .enabled(true)
                .eventWord(
                    Sport.EventWord.builder()
                        .long_(
                            Sport.EventWord.Long.builder()
                                .plural("plural")
                                .singular("singular")
                                .build()
                        )
                        .short_(
                            Sport.EventWord.Short.builder()
                                .plural("plural")
                                .singular("singular")
                                .build()
                        )
                        .build()
                )
                .addExtraPeriod("string")
                .hasMeaningfulHomeAway(true)
                .imageIcon("imageIcon")
                .name("name")
                .pointWord(
                    Sport.PointWord.builder()
                        .long_(
                            Sport.PointWord.Long.builder()
                                .plural("plural")
                                .singular("singular")
                                .build()
                        )
                        .short_(
                            Sport.PointWord.Short.builder()
                                .plural("plural")
                                .singular("singular")
                                .build()
                        )
                        .build()
                )
                .shortName("shortName")
                .sportId("sportID")
                .squareImage("squareImage")
                .build()

        val roundtrippedSport =
            jsonMapper.readValue(jsonMapper.writeValueAsString(sport), jacksonTypeRef<Sport>())

        assertThat(roundtrippedSport).isEqualTo(sport)
    }
}
