// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.markets

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.sportsgameodds.api.core.Enum
import com.sportsgameodds.api.core.ExcludeMissing
import com.sportsgameodds.api.core.JsonField
import com.sportsgameodds.api.core.JsonMissing
import com.sportsgameodds.api.core.JsonValue
import com.sportsgameodds.api.core.toImmutable
import com.sportsgameodds.api.errors.SportsGameOddsInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Market
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val activeEvents: JsonField<Double>,
    private val betTypeId: JsonField<String>,
    private val isMainDerivative: JsonField<Boolean>,
    private val isMainMarket: JsonField<Boolean>,
    private val isProp: JsonField<Boolean>,
    private val isSubPeriod: JsonField<Boolean>,
    private val isSupported: JsonField<Boolean>,
    private val marketGroupId: JsonField<String>,
    private val marketGroupName: JsonField<String>,
    private val marketGroupNameAlias: JsonField<String>,
    private val marketGroupNameBySport: JsonField<MarketGroupNameBySport>,
    private val oddId: JsonField<String>,
    private val periodId: JsonField<String>,
    private val playerId: JsonField<String>,
    private val propType: JsonField<PropType>,
    private val sideId: JsonField<String>,
    private val statEntityId: JsonField<String>,
    private val statId: JsonField<String>,
    private val support: JsonField<Support>,
    private val teamId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("activeEvents")
        @ExcludeMissing
        activeEvents: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("betTypeID") @ExcludeMissing betTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isMainDerivative")
        @ExcludeMissing
        isMainDerivative: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isMainMarket")
        @ExcludeMissing
        isMainMarket: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isProp") @ExcludeMissing isProp: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isSubPeriod")
        @ExcludeMissing
        isSubPeriod: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isSupported")
        @ExcludeMissing
        isSupported: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("marketGroupID")
        @ExcludeMissing
        marketGroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("marketGroupName")
        @ExcludeMissing
        marketGroupName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("marketGroupNameAlias")
        @ExcludeMissing
        marketGroupNameAlias: JsonField<String> = JsonMissing.of(),
        @JsonProperty("marketGroupNameBySport")
        @ExcludeMissing
        marketGroupNameBySport: JsonField<MarketGroupNameBySport> = JsonMissing.of(),
        @JsonProperty("oddID") @ExcludeMissing oddId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("periodID") @ExcludeMissing periodId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("playerID") @ExcludeMissing playerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("propType") @ExcludeMissing propType: JsonField<PropType> = JsonMissing.of(),
        @JsonProperty("sideID") @ExcludeMissing sideId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("statEntityID")
        @ExcludeMissing
        statEntityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("statID") @ExcludeMissing statId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("support") @ExcludeMissing support: JsonField<Support> = JsonMissing.of(),
        @JsonProperty("teamID") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
    ) : this(
        activeEvents,
        betTypeId,
        isMainDerivative,
        isMainMarket,
        isProp,
        isSubPeriod,
        isSupported,
        marketGroupId,
        marketGroupName,
        marketGroupNameAlias,
        marketGroupNameBySport,
        oddId,
        periodId,
        playerId,
        propType,
        sideId,
        statEntityId,
        statId,
        support,
        teamId,
        mutableMapOf(),
    )

    /**
     * The number of unique active events with available odds for this market across all supported
     * league and bookmaker combinations.
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun activeEvents(): Optional<Double> = activeEvents.getOptional("activeEvents")

    /**
     * The type of bet
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun betTypeId(): Optional<String> = betTypeId.getOptional("betTypeID")

    /**
     * True if this is a sub-period of a main market
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun isMainDerivative(): Optional<Boolean> = isMainDerivative.getOptional("isMainDerivative")

    /**
     * True if this is a main market
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun isMainMarket(): Optional<Boolean> = isMainMarket.getOptional("isMainMarket")

    /**
     * True if this is a prop bet
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun isProp(): Optional<Boolean> = isProp.getOptional("isProp")

    /**
     * True if this market is for a sub-period
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun isSubPeriod(): Optional<Boolean> = isSubPeriod.getOptional("isSubPeriod")

    /**
     * True if this market is supported by at least one league/bookmaker.
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun isSupported(): Optional<Boolean> = isSupported.getOptional("isSupported")

    /**
     * The unique identifier for the group (all sides of the market) this market belongs to
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun marketGroupId(): Optional<String> = marketGroupId.getOptional("marketGroupID")

    /**
     * The primary display name for this market's group
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun marketGroupName(): Optional<String> = marketGroupName.getOptional("marketGroupName")

    /**
     * An alternative display name for this market's group
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun marketGroupNameAlias(): Optional<String> =
        marketGroupNameAlias.getOptional("marketGroupNameAlias")

    /**
     * Sport-specific market group names when they differ from the primary name
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun marketGroupNameBySport(): Optional<MarketGroupNameBySport> =
        marketGroupNameBySport.getOptional("marketGroupNameBySport")

    /**
     * The unique identifier for this market
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun oddId(): Optional<String> = oddId.getOptional("oddID")

    /**
     * The period of the event this market applies to
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun periodId(): Optional<String> = periodId.getOptional("periodID")

    /**
     * Set to a player's unique playerID if it's a player prop
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun playerId(): Optional<String> = playerId.getOptional("playerID")

    /**
     * The type of prop bet
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun propType(): Optional<PropType> = propType.getOptional("propType")

    /**
     * The side of the bet
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sideId(): Optional<String> = sideId.getOptional("sideID")

    /**
     * The statEntityID represents whose performance on the stat is being evaluated
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun statEntityId(): Optional<String> = statEntityId.getOptional("statEntityID")

    /**
     * The statistic which is being evaluated as a part of this market
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun statId(): Optional<String> = statId.getOptional("statID")

    /**
     * Nested object showing which leagues and bookmakers support this market.
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun support(): Optional<Support> = support.getOptional("support")

    /**
     * Set to team's unique teamID if it's a team prop for a tournament type event
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun teamId(): Optional<String> = teamId.getOptional("teamID")

    /**
     * Returns the raw JSON value of [activeEvents].
     *
     * Unlike [activeEvents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activeEvents")
    @ExcludeMissing
    fun _activeEvents(): JsonField<Double> = activeEvents

    /**
     * Returns the raw JSON value of [betTypeId].
     *
     * Unlike [betTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("betTypeID") @ExcludeMissing fun _betTypeId(): JsonField<String> = betTypeId

    /**
     * Returns the raw JSON value of [isMainDerivative].
     *
     * Unlike [isMainDerivative], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isMainDerivative")
    @ExcludeMissing
    fun _isMainDerivative(): JsonField<Boolean> = isMainDerivative

    /**
     * Returns the raw JSON value of [isMainMarket].
     *
     * Unlike [isMainMarket], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isMainMarket")
    @ExcludeMissing
    fun _isMainMarket(): JsonField<Boolean> = isMainMarket

    /**
     * Returns the raw JSON value of [isProp].
     *
     * Unlike [isProp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isProp") @ExcludeMissing fun _isProp(): JsonField<Boolean> = isProp

    /**
     * Returns the raw JSON value of [isSubPeriod].
     *
     * Unlike [isSubPeriod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isSubPeriod")
    @ExcludeMissing
    fun _isSubPeriod(): JsonField<Boolean> = isSubPeriod

    /**
     * Returns the raw JSON value of [isSupported].
     *
     * Unlike [isSupported], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isSupported")
    @ExcludeMissing
    fun _isSupported(): JsonField<Boolean> = isSupported

    /**
     * Returns the raw JSON value of [marketGroupId].
     *
     * Unlike [marketGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("marketGroupID")
    @ExcludeMissing
    fun _marketGroupId(): JsonField<String> = marketGroupId

    /**
     * Returns the raw JSON value of [marketGroupName].
     *
     * Unlike [marketGroupName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("marketGroupName")
    @ExcludeMissing
    fun _marketGroupName(): JsonField<String> = marketGroupName

    /**
     * Returns the raw JSON value of [marketGroupNameAlias].
     *
     * Unlike [marketGroupNameAlias], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("marketGroupNameAlias")
    @ExcludeMissing
    fun _marketGroupNameAlias(): JsonField<String> = marketGroupNameAlias

    /**
     * Returns the raw JSON value of [marketGroupNameBySport].
     *
     * Unlike [marketGroupNameBySport], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("marketGroupNameBySport")
    @ExcludeMissing
    fun _marketGroupNameBySport(): JsonField<MarketGroupNameBySport> = marketGroupNameBySport

    /**
     * Returns the raw JSON value of [oddId].
     *
     * Unlike [oddId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("oddID") @ExcludeMissing fun _oddId(): JsonField<String> = oddId

    /**
     * Returns the raw JSON value of [periodId].
     *
     * Unlike [periodId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("periodID") @ExcludeMissing fun _periodId(): JsonField<String> = periodId

    /**
     * Returns the raw JSON value of [playerId].
     *
     * Unlike [playerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("playerID") @ExcludeMissing fun _playerId(): JsonField<String> = playerId

    /**
     * Returns the raw JSON value of [propType].
     *
     * Unlike [propType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propType") @ExcludeMissing fun _propType(): JsonField<PropType> = propType

    /**
     * Returns the raw JSON value of [sideId].
     *
     * Unlike [sideId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sideID") @ExcludeMissing fun _sideId(): JsonField<String> = sideId

    /**
     * Returns the raw JSON value of [statEntityId].
     *
     * Unlike [statEntityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statEntityID")
    @ExcludeMissing
    fun _statEntityId(): JsonField<String> = statEntityId

    /**
     * Returns the raw JSON value of [statId].
     *
     * Unlike [statId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statID") @ExcludeMissing fun _statId(): JsonField<String> = statId

    /**
     * Returns the raw JSON value of [support].
     *
     * Unlike [support], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("support") @ExcludeMissing fun _support(): JsonField<Support> = support

    /**
     * Returns the raw JSON value of [teamId].
     *
     * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("teamID") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [Market]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Market]. */
    class Builder internal constructor() {

        private var activeEvents: JsonField<Double> = JsonMissing.of()
        private var betTypeId: JsonField<String> = JsonMissing.of()
        private var isMainDerivative: JsonField<Boolean> = JsonMissing.of()
        private var isMainMarket: JsonField<Boolean> = JsonMissing.of()
        private var isProp: JsonField<Boolean> = JsonMissing.of()
        private var isSubPeriod: JsonField<Boolean> = JsonMissing.of()
        private var isSupported: JsonField<Boolean> = JsonMissing.of()
        private var marketGroupId: JsonField<String> = JsonMissing.of()
        private var marketGroupName: JsonField<String> = JsonMissing.of()
        private var marketGroupNameAlias: JsonField<String> = JsonMissing.of()
        private var marketGroupNameBySport: JsonField<MarketGroupNameBySport> = JsonMissing.of()
        private var oddId: JsonField<String> = JsonMissing.of()
        private var periodId: JsonField<String> = JsonMissing.of()
        private var playerId: JsonField<String> = JsonMissing.of()
        private var propType: JsonField<PropType> = JsonMissing.of()
        private var sideId: JsonField<String> = JsonMissing.of()
        private var statEntityId: JsonField<String> = JsonMissing.of()
        private var statId: JsonField<String> = JsonMissing.of()
        private var support: JsonField<Support> = JsonMissing.of()
        private var teamId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(market: Market) = apply {
            activeEvents = market.activeEvents
            betTypeId = market.betTypeId
            isMainDerivative = market.isMainDerivative
            isMainMarket = market.isMainMarket
            isProp = market.isProp
            isSubPeriod = market.isSubPeriod
            isSupported = market.isSupported
            marketGroupId = market.marketGroupId
            marketGroupName = market.marketGroupName
            marketGroupNameAlias = market.marketGroupNameAlias
            marketGroupNameBySport = market.marketGroupNameBySport
            oddId = market.oddId
            periodId = market.periodId
            playerId = market.playerId
            propType = market.propType
            sideId = market.sideId
            statEntityId = market.statEntityId
            statId = market.statId
            support = market.support
            teamId = market.teamId
            additionalProperties = market.additionalProperties.toMutableMap()
        }

        /**
         * The number of unique active events with available odds for this market across all
         * supported league and bookmaker combinations.
         */
        fun activeEvents(activeEvents: Double) = activeEvents(JsonField.of(activeEvents))

        /**
         * Sets [Builder.activeEvents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activeEvents] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun activeEvents(activeEvents: JsonField<Double>) = apply {
            this.activeEvents = activeEvents
        }

        /** The type of bet */
        fun betTypeId(betTypeId: String) = betTypeId(JsonField.of(betTypeId))

        /**
         * Sets [Builder.betTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.betTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun betTypeId(betTypeId: JsonField<String>) = apply { this.betTypeId = betTypeId }

        /** True if this is a sub-period of a main market */
        fun isMainDerivative(isMainDerivative: Boolean) =
            isMainDerivative(JsonField.of(isMainDerivative))

        /**
         * Sets [Builder.isMainDerivative] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isMainDerivative] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isMainDerivative(isMainDerivative: JsonField<Boolean>) = apply {
            this.isMainDerivative = isMainDerivative
        }

        /** True if this is a main market */
        fun isMainMarket(isMainMarket: Boolean) = isMainMarket(JsonField.of(isMainMarket))

        /**
         * Sets [Builder.isMainMarket] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isMainMarket] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isMainMarket(isMainMarket: JsonField<Boolean>) = apply {
            this.isMainMarket = isMainMarket
        }

        /** True if this is a prop bet */
        fun isProp(isProp: Boolean) = isProp(JsonField.of(isProp))

        /**
         * Sets [Builder.isProp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isProp] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isProp(isProp: JsonField<Boolean>) = apply { this.isProp = isProp }

        /** True if this market is for a sub-period */
        fun isSubPeriod(isSubPeriod: Boolean) = isSubPeriod(JsonField.of(isSubPeriod))

        /**
         * Sets [Builder.isSubPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isSubPeriod] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isSubPeriod(isSubPeriod: JsonField<Boolean>) = apply { this.isSubPeriod = isSubPeriod }

        /** True if this market is supported by at least one league/bookmaker. */
        fun isSupported(isSupported: Boolean) = isSupported(JsonField.of(isSupported))

        /**
         * Sets [Builder.isSupported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isSupported] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isSupported(isSupported: JsonField<Boolean>) = apply { this.isSupported = isSupported }

        /** The unique identifier for the group (all sides of the market) this market belongs to */
        fun marketGroupId(marketGroupId: String) = marketGroupId(JsonField.of(marketGroupId))

        /**
         * Sets [Builder.marketGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marketGroupId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun marketGroupId(marketGroupId: JsonField<String>) = apply {
            this.marketGroupId = marketGroupId
        }

        /** The primary display name for this market's group */
        fun marketGroupName(marketGroupName: String) =
            marketGroupName(JsonField.of(marketGroupName))

        /**
         * Sets [Builder.marketGroupName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marketGroupName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun marketGroupName(marketGroupName: JsonField<String>) = apply {
            this.marketGroupName = marketGroupName
        }

        /** An alternative display name for this market's group */
        fun marketGroupNameAlias(marketGroupNameAlias: String) =
            marketGroupNameAlias(JsonField.of(marketGroupNameAlias))

        /**
         * Sets [Builder.marketGroupNameAlias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marketGroupNameAlias] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun marketGroupNameAlias(marketGroupNameAlias: JsonField<String>) = apply {
            this.marketGroupNameAlias = marketGroupNameAlias
        }

        /** Sport-specific market group names when they differ from the primary name */
        fun marketGroupNameBySport(marketGroupNameBySport: MarketGroupNameBySport) =
            marketGroupNameBySport(JsonField.of(marketGroupNameBySport))

        /**
         * Sets [Builder.marketGroupNameBySport] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marketGroupNameBySport] with a well-typed
         * [MarketGroupNameBySport] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun marketGroupNameBySport(marketGroupNameBySport: JsonField<MarketGroupNameBySport>) =
            apply {
                this.marketGroupNameBySport = marketGroupNameBySport
            }

        /** The unique identifier for this market */
        fun oddId(oddId: String) = oddId(JsonField.of(oddId))

        /**
         * Sets [Builder.oddId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oddId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun oddId(oddId: JsonField<String>) = apply { this.oddId = oddId }

        /** The period of the event this market applies to */
        fun periodId(periodId: String) = periodId(JsonField.of(periodId))

        /**
         * Sets [Builder.periodId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun periodId(periodId: JsonField<String>) = apply { this.periodId = periodId }

        /** Set to a player's unique playerID if it's a player prop */
        fun playerId(playerId: String) = playerId(JsonField.of(playerId))

        /**
         * Sets [Builder.playerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.playerId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun playerId(playerId: JsonField<String>) = apply { this.playerId = playerId }

        /** The type of prop bet */
        fun propType(propType: PropType) = propType(JsonField.of(propType))

        /**
         * Sets [Builder.propType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propType] with a well-typed [PropType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun propType(propType: JsonField<PropType>) = apply { this.propType = propType }

        /** The side of the bet */
        fun sideId(sideId: String) = sideId(JsonField.of(sideId))

        /**
         * Sets [Builder.sideId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sideId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sideId(sideId: JsonField<String>) = apply { this.sideId = sideId }

        /** The statEntityID represents whose performance on the stat is being evaluated */
        fun statEntityId(statEntityId: String) = statEntityId(JsonField.of(statEntityId))

        /**
         * Sets [Builder.statEntityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statEntityId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun statEntityId(statEntityId: JsonField<String>) = apply {
            this.statEntityId = statEntityId
        }

        /** The statistic which is being evaluated as a part of this market */
        fun statId(statId: String) = statId(JsonField.of(statId))

        /**
         * Sets [Builder.statId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun statId(statId: JsonField<String>) = apply { this.statId = statId }

        /** Nested object showing which leagues and bookmakers support this market. */
        fun support(support: Support) = support(JsonField.of(support))

        /**
         * Sets [Builder.support] to an arbitrary JSON value.
         *
         * You should usually call [Builder.support] with a well-typed [Support] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun support(support: JsonField<Support>) = apply { this.support = support }

        /** Set to team's unique teamID if it's a team prop for a tournament type event */
        fun teamId(teamId: String) = teamId(JsonField.of(teamId))

        /**
         * Sets [Builder.teamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [Market].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Market =
            Market(
                activeEvents,
                betTypeId,
                isMainDerivative,
                isMainMarket,
                isProp,
                isSubPeriod,
                isSupported,
                marketGroupId,
                marketGroupName,
                marketGroupNameAlias,
                marketGroupNameBySport,
                oddId,
                periodId,
                playerId,
                propType,
                sideId,
                statEntityId,
                statId,
                support,
                teamId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws SportsGameOddsInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): Market = apply {
        if (validated) {
            return@apply
        }

        activeEvents()
        betTypeId()
        isMainDerivative()
        isMainMarket()
        isProp()
        isSubPeriod()
        isSupported()
        marketGroupId()
        marketGroupName()
        marketGroupNameAlias()
        marketGroupNameBySport().ifPresent { it.validate() }
        oddId()
        periodId()
        playerId()
        propType().ifPresent { it.validate() }
        sideId()
        statEntityId()
        statId()
        support().ifPresent { it.validate() }
        teamId()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: SportsGameOddsInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (activeEvents.asKnown().isPresent) 1 else 0) +
            (if (betTypeId.asKnown().isPresent) 1 else 0) +
            (if (isMainDerivative.asKnown().isPresent) 1 else 0) +
            (if (isMainMarket.asKnown().isPresent) 1 else 0) +
            (if (isProp.asKnown().isPresent) 1 else 0) +
            (if (isSubPeriod.asKnown().isPresent) 1 else 0) +
            (if (isSupported.asKnown().isPresent) 1 else 0) +
            (if (marketGroupId.asKnown().isPresent) 1 else 0) +
            (if (marketGroupName.asKnown().isPresent) 1 else 0) +
            (if (marketGroupNameAlias.asKnown().isPresent) 1 else 0) +
            (marketGroupNameBySport.asKnown().getOrNull()?.validity() ?: 0) +
            (if (oddId.asKnown().isPresent) 1 else 0) +
            (if (periodId.asKnown().isPresent) 1 else 0) +
            (if (playerId.asKnown().isPresent) 1 else 0) +
            (propType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sideId.asKnown().isPresent) 1 else 0) +
            (if (statEntityId.asKnown().isPresent) 1 else 0) +
            (if (statId.asKnown().isPresent) 1 else 0) +
            (support.asKnown().getOrNull()?.validity() ?: 0) +
            (if (teamId.asKnown().isPresent) 1 else 0)

    /** Sport-specific market group names when they differ from the primary name */
    class MarketGroupNameBySport
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [MarketGroupNameBySport].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MarketGroupNameBySport]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(marketGroupNameBySport: MarketGroupNameBySport) = apply {
                additionalProperties = marketGroupNameBySport.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [MarketGroupNameBySport].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): MarketGroupNameBySport =
                MarketGroupNameBySport(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws SportsGameOddsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): MarketGroupNameBySport = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: SportsGameOddsInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MarketGroupNameBySport &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MarketGroupNameBySport{additionalProperties=$additionalProperties}"
    }

    /** The type of prop bet */
    class PropType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val GAME_PROP = of("game_prop")

            @JvmField val TEAM_PROP = of("team_prop")

            @JvmField val PLAYER_PROP = of("player_prop")

            @JvmField val OTHER_PROP = of("other_prop")

            @JvmStatic fun of(value: String) = PropType(JsonField.of(value))
        }

        /** An enum containing [PropType]'s known values. */
        enum class Known {
            GAME_PROP,
            TEAM_PROP,
            PLAYER_PROP,
            OTHER_PROP,
        }

        /**
         * An enum containing [PropType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PropType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GAME_PROP,
            TEAM_PROP,
            PLAYER_PROP,
            OTHER_PROP,
            /** An enum member indicating that [PropType] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                GAME_PROP -> Value.GAME_PROP
                TEAM_PROP -> Value.TEAM_PROP
                PLAYER_PROP -> Value.PLAYER_PROP
                OTHER_PROP -> Value.OTHER_PROP
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws SportsGameOddsInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                GAME_PROP -> Known.GAME_PROP
                TEAM_PROP -> Known.TEAM_PROP
                PLAYER_PROP -> Known.PLAYER_PROP
                OTHER_PROP -> Known.OTHER_PROP
                else -> throw SportsGameOddsInvalidDataException("Unknown PropType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws SportsGameOddsInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                SportsGameOddsInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws SportsGameOddsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): PropType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: SportsGameOddsInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PropType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Nested object showing which leagues and bookmakers support this market. */
    class Support
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Support]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Support]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(support: Support) = apply {
                additionalProperties = support.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Support].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Support = Support(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws SportsGameOddsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Support = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: SportsGameOddsInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Support && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Support{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Market &&
            activeEvents == other.activeEvents &&
            betTypeId == other.betTypeId &&
            isMainDerivative == other.isMainDerivative &&
            isMainMarket == other.isMainMarket &&
            isProp == other.isProp &&
            isSubPeriod == other.isSubPeriod &&
            isSupported == other.isSupported &&
            marketGroupId == other.marketGroupId &&
            marketGroupName == other.marketGroupName &&
            marketGroupNameAlias == other.marketGroupNameAlias &&
            marketGroupNameBySport == other.marketGroupNameBySport &&
            oddId == other.oddId &&
            periodId == other.periodId &&
            playerId == other.playerId &&
            propType == other.propType &&
            sideId == other.sideId &&
            statEntityId == other.statEntityId &&
            statId == other.statId &&
            support == other.support &&
            teamId == other.teamId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            activeEvents,
            betTypeId,
            isMainDerivative,
            isMainMarket,
            isProp,
            isSubPeriod,
            isSupported,
            marketGroupId,
            marketGroupName,
            marketGroupNameAlias,
            marketGroupNameBySport,
            oddId,
            periodId,
            playerId,
            propType,
            sideId,
            statEntityId,
            statId,
            support,
            teamId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Market{activeEvents=$activeEvents, betTypeId=$betTypeId, isMainDerivative=$isMainDerivative, isMainMarket=$isMainMarket, isProp=$isProp, isSubPeriod=$isSubPeriod, isSupported=$isSupported, marketGroupId=$marketGroupId, marketGroupName=$marketGroupName, marketGroupNameAlias=$marketGroupNameAlias, marketGroupNameBySport=$marketGroupNameBySport, oddId=$oddId, periodId=$periodId, playerId=$playerId, propType=$propType, sideId=$sideId, statEntityId=$statEntityId, statId=$statId, support=$support, teamId=$teamId, additionalProperties=$additionalProperties}"
}
