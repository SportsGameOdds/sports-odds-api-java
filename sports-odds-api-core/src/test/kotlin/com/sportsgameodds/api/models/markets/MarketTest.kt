// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.markets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.sportsgameodds.api.core.JsonValue
import com.sportsgameodds.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketTest {

    @Test
    fun create() {
        val market =
            Market.builder()
                .activeEvents(0.0)
                .betTypeId("betTypeID")
                .isMainDerivative(true)
                .isMainMarket(true)
                .isProp(true)
                .isSubPeriod(true)
                .isSupported(true)
                .marketGroupId("marketGroupID")
                .marketGroupName("marketGroupName")
                .marketGroupNameAlias("marketGroupNameAlias")
                .marketGroupNameBySport(
                    Market.MarketGroupNameBySport.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .oddId("oddID")
                .periodId("periodID")
                .playerId("playerID")
                .propType(Market.PropType.GAME_PROP)
                .sideId("sideID")
                .statEntityId("statEntityID")
                .statId("statID")
                .support(
                    Market.Support.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("foo" to mapOf("supported" to true))),
                        )
                        .build()
                )
                .teamId("teamID")
                .build()

        assertThat(market.activeEvents()).contains(0.0)
        assertThat(market.betTypeId()).contains("betTypeID")
        assertThat(market.isMainDerivative()).contains(true)
        assertThat(market.isMainMarket()).contains(true)
        assertThat(market.isProp()).contains(true)
        assertThat(market.isSubPeriod()).contains(true)
        assertThat(market.isSupported()).contains(true)
        assertThat(market.marketGroupId()).contains("marketGroupID")
        assertThat(market.marketGroupName()).contains("marketGroupName")
        assertThat(market.marketGroupNameAlias()).contains("marketGroupNameAlias")
        assertThat(market.marketGroupNameBySport())
            .contains(
                Market.MarketGroupNameBySport.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(market.oddId()).contains("oddID")
        assertThat(market.periodId()).contains("periodID")
        assertThat(market.playerId()).contains("playerID")
        assertThat(market.propType()).contains(Market.PropType.GAME_PROP)
        assertThat(market.sideId()).contains("sideID")
        assertThat(market.statEntityId()).contains("statEntityID")
        assertThat(market.statId()).contains("statID")
        assertThat(market.support())
            .contains(
                Market.Support.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(mapOf("foo" to mapOf("supported" to true))),
                    )
                    .build()
            )
        assertThat(market.teamId()).contains("teamID")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val market =
            Market.builder()
                .activeEvents(0.0)
                .betTypeId("betTypeID")
                .isMainDerivative(true)
                .isMainMarket(true)
                .isProp(true)
                .isSubPeriod(true)
                .isSupported(true)
                .marketGroupId("marketGroupID")
                .marketGroupName("marketGroupName")
                .marketGroupNameAlias("marketGroupNameAlias")
                .marketGroupNameBySport(
                    Market.MarketGroupNameBySport.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .oddId("oddID")
                .periodId("periodID")
                .playerId("playerID")
                .propType(Market.PropType.GAME_PROP)
                .sideId("sideID")
                .statEntityId("statEntityID")
                .statId("statID")
                .support(
                    Market.Support.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("foo" to mapOf("supported" to true))),
                        )
                        .build()
                )
                .teamId("teamID")
                .build()

        val roundtrippedMarket =
            jsonMapper.readValue(jsonMapper.writeValueAsString(market), jacksonTypeRef<Market>())

        assertThat(roundtrippedMarket).isEqualTo(market)
    }
}
