// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.stats

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.sportsgameodds.api.core.JsonValue
import com.sportsgameodds.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatTest {

    @Test
    fun create() {
        val stat =
            Stat.builder()
                .description("description")
                .displays(Stat.Displays.builder().long_("long").short_("short").build())
                .isScoreStat(true)
                .statId("statID")
                .supportedLevels(
                    Stat.SupportedLevels.builder().all(true).player(true).team(true).build()
                )
                .supportedSports(
                    Stat.SupportedSports.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .units(
                    Stat.Units.builder()
                        .long_(
                            Stat.Units.Long.builder().plural("plural").singular("singular").build()
                        )
                        .short_(
                            Stat.Units.Short.builder().plural("plural").singular("singular").build()
                        )
                        .build()
                )
                .build()

        assertThat(stat.description()).contains("description")
        assertThat(stat.displays())
            .contains(Stat.Displays.builder().long_("long").short_("short").build())
        assertThat(stat.isScoreStat()).contains(true)
        assertThat(stat.statId()).contains("statID")
        assertThat(stat.supportedLevels())
            .contains(Stat.SupportedLevels.builder().all(true).player(true).team(true).build())
        assertThat(stat.supportedSports())
            .contains(
                Stat.SupportedSports.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(stat.units())
            .contains(
                Stat.Units.builder()
                    .long_(Stat.Units.Long.builder().plural("plural").singular("singular").build())
                    .short_(
                        Stat.Units.Short.builder().plural("plural").singular("singular").build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stat =
            Stat.builder()
                .description("description")
                .displays(Stat.Displays.builder().long_("long").short_("short").build())
                .isScoreStat(true)
                .statId("statID")
                .supportedLevels(
                    Stat.SupportedLevels.builder().all(true).player(true).team(true).build()
                )
                .supportedSports(
                    Stat.SupportedSports.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .units(
                    Stat.Units.builder()
                        .long_(
                            Stat.Units.Long.builder().plural("plural").singular("singular").build()
                        )
                        .short_(
                            Stat.Units.Short.builder().plural("plural").singular("singular").build()
                        )
                        .build()
                )
                .build()

        val roundtrippedStat =
            jsonMapper.readValue(jsonMapper.writeValueAsString(stat), jacksonTypeRef<Stat>())

        assertThat(roundtrippedStat).isEqualTo(stat)
    }
}
