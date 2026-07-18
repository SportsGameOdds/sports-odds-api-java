// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.markets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.sportsgameodds.api.core.JsonValue
import com.sportsgameodds.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketGetPageResponseTest {

    @Test
    fun create() {
        val marketGetPageResponse =
            MarketGetPageResponse.builder()
                .addData(
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
                )
                .nextCursor("nextCursor")
                .success(true)
                .build()

        assertThat(marketGetPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(marketGetPageResponse.nextCursor()).contains("nextCursor")
        assertThat(marketGetPageResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketGetPageResponse =
            MarketGetPageResponse.builder()
                .addData(
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
                )
                .nextCursor("nextCursor")
                .success(true)
                .build()

        val roundtrippedMarketGetPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketGetPageResponse),
                jacksonTypeRef<MarketGetPageResponse>(),
            )

        assertThat(roundtrippedMarketGetPageResponse).isEqualTo(marketGetPageResponse)
    }
}
