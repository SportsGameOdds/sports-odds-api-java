// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.markets

import com.sportsgameodds.api.core.Params
import com.sportsgameodds.api.core.http.Headers
import com.sportsgameodds.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a list of Markets */
class MarketGetParams
private constructor(
    private val betTypeId: String?,
    private val bookmakerId: String?,
    private val cursor: String?,
    private val isMainMarket: Boolean?,
    private val isProp: Boolean?,
    private val isSubPeriod: Boolean?,
    private val isSupported: Boolean?,
    private val leagueId: String?,
    private val limit: Double?,
    private val oddId: String?,
    private val periodId: String?,
    private val propType: String?,
    private val sideId: String?,
    private val sportId: String?,
    private val statEntityId: String?,
    private val statId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A single betTypeID or comma-separated list of betTypeIDs to filter Markets by */
    fun betTypeId(): Optional<String> = Optional.ofNullable(betTypeId)

    /** A single bookmakerID or comma-separated list of bookmakerIDs to filter Markets by */
    fun bookmakerId(): Optional<String> = Optional.ofNullable(bookmakerId)

    /** The cursor for pagination. Use nextCursor from prior response. */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** Filter to only include main markets (main period moneyline, spread, and over/under) */
    fun isMainMarket(): Optional<Boolean> = Optional.ofNullable(isMainMarket)

    /** Filter by whether it is any type of prop bet market */
    fun isProp(): Optional<Boolean> = Optional.ofNullable(isProp)

    /** Filter by whether it tracks a sub/non-main period */
    fun isSubPeriod(): Optional<Boolean> = Optional.ofNullable(isSubPeriod)

    /**
     * Filter whether this market is fully supported by at least 1 bookmaker in at least 1 league.
     * Defaults to true if not specified.
     */
    fun isSupported(): Optional<Boolean> = Optional.ofNullable(isSupported)

    /** A single leagueID or comma-separated list of leagueIDs to filter Markets by */
    fun leagueId(): Optional<String> = Optional.ofNullable(leagueId)

    /** The maximum number of Markets to return (default: 100, max: 10000) */
    fun limit(): Optional<Double> = Optional.ofNullable(limit)

    /**
     * A single oddID or comma-separated list of oddIDs. Used to specify specific Markets to return.
     */
    fun oddId(): Optional<String> = Optional.ofNullable(oddId)

    /** A single periodID or comma-separated list of periodIDs to filter Markets by */
    fun periodId(): Optional<String> = Optional.ofNullable(periodId)

    /** Filter by prop type (game_prop, team_prop, player_prop, other_prop) */
    fun propType(): Optional<String> = Optional.ofNullable(propType)

    /** A single sideID or comma-separated list of sideIDs to filter Markets by */
    fun sideId(): Optional<String> = Optional.ofNullable(sideId)

    /** A single sportID or comma-separated list of sportIDs to filter Markets by */
    fun sportId(): Optional<String> = Optional.ofNullable(sportId)

    /** A single statEntityID or comma-separated list of statEntityIDs to filter Markets by */
    fun statEntityId(): Optional<String> = Optional.ofNullable(statEntityId)

    /** A single statID or comma-separated list of statIDs to filter Markets by */
    fun statId(): Optional<String> = Optional.ofNullable(statId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MarketGetParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [MarketGetParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarketGetParams]. */
    class Builder internal constructor() {

        private var betTypeId: String? = null
        private var bookmakerId: String? = null
        private var cursor: String? = null
        private var isMainMarket: Boolean? = null
        private var isProp: Boolean? = null
        private var isSubPeriod: Boolean? = null
        private var isSupported: Boolean? = null
        private var leagueId: String? = null
        private var limit: Double? = null
        private var oddId: String? = null
        private var periodId: String? = null
        private var propType: String? = null
        private var sideId: String? = null
        private var sportId: String? = null
        private var statEntityId: String? = null
        private var statId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(marketGetParams: MarketGetParams) = apply {
            betTypeId = marketGetParams.betTypeId
            bookmakerId = marketGetParams.bookmakerId
            cursor = marketGetParams.cursor
            isMainMarket = marketGetParams.isMainMarket
            isProp = marketGetParams.isProp
            isSubPeriod = marketGetParams.isSubPeriod
            isSupported = marketGetParams.isSupported
            leagueId = marketGetParams.leagueId
            limit = marketGetParams.limit
            oddId = marketGetParams.oddId
            periodId = marketGetParams.periodId
            propType = marketGetParams.propType
            sideId = marketGetParams.sideId
            sportId = marketGetParams.sportId
            statEntityId = marketGetParams.statEntityId
            statId = marketGetParams.statId
            additionalHeaders = marketGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = marketGetParams.additionalQueryParams.toBuilder()
        }

        /** A single betTypeID or comma-separated list of betTypeIDs to filter Markets by */
        fun betTypeId(betTypeId: String?) = apply { this.betTypeId = betTypeId }

        /** Alias for calling [Builder.betTypeId] with `betTypeId.orElse(null)`. */
        fun betTypeId(betTypeId: Optional<String>) = betTypeId(betTypeId.getOrNull())

        /** A single bookmakerID or comma-separated list of bookmakerIDs to filter Markets by */
        fun bookmakerId(bookmakerId: String?) = apply { this.bookmakerId = bookmakerId }

        /** Alias for calling [Builder.bookmakerId] with `bookmakerId.orElse(null)`. */
        fun bookmakerId(bookmakerId: Optional<String>) = bookmakerId(bookmakerId.getOrNull())

        /** The cursor for pagination. Use nextCursor from prior response. */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** Filter to only include main markets (main period moneyline, spread, and over/under) */
        fun isMainMarket(isMainMarket: Boolean?) = apply { this.isMainMarket = isMainMarket }

        /**
         * Alias for [Builder.isMainMarket].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isMainMarket(isMainMarket: Boolean) = isMainMarket(isMainMarket as Boolean?)

        /** Alias for calling [Builder.isMainMarket] with `isMainMarket.orElse(null)`. */
        fun isMainMarket(isMainMarket: Optional<Boolean>) = isMainMarket(isMainMarket.getOrNull())

        /** Filter by whether it is any type of prop bet market */
        fun isProp(isProp: Boolean?) = apply { this.isProp = isProp }

        /**
         * Alias for [Builder.isProp].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isProp(isProp: Boolean) = isProp(isProp as Boolean?)

        /** Alias for calling [Builder.isProp] with `isProp.orElse(null)`. */
        fun isProp(isProp: Optional<Boolean>) = isProp(isProp.getOrNull())

        /** Filter by whether it tracks a sub/non-main period */
        fun isSubPeriod(isSubPeriod: Boolean?) = apply { this.isSubPeriod = isSubPeriod }

        /**
         * Alias for [Builder.isSubPeriod].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isSubPeriod(isSubPeriod: Boolean) = isSubPeriod(isSubPeriod as Boolean?)

        /** Alias for calling [Builder.isSubPeriod] with `isSubPeriod.orElse(null)`. */
        fun isSubPeriod(isSubPeriod: Optional<Boolean>) = isSubPeriod(isSubPeriod.getOrNull())

        /**
         * Filter whether this market is fully supported by at least 1 bookmaker in at least 1
         * league. Defaults to true if not specified.
         */
        fun isSupported(isSupported: Boolean?) = apply { this.isSupported = isSupported }

        /**
         * Alias for [Builder.isSupported].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isSupported(isSupported: Boolean) = isSupported(isSupported as Boolean?)

        /** Alias for calling [Builder.isSupported] with `isSupported.orElse(null)`. */
        fun isSupported(isSupported: Optional<Boolean>) = isSupported(isSupported.getOrNull())

        /** A single leagueID or comma-separated list of leagueIDs to filter Markets by */
        fun leagueId(leagueId: String?) = apply { this.leagueId = leagueId }

        /** Alias for calling [Builder.leagueId] with `leagueId.orElse(null)`. */
        fun leagueId(leagueId: Optional<String>) = leagueId(leagueId.getOrNull())

        /** The maximum number of Markets to return (default: 100, max: 10000) */
        fun limit(limit: Double?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Double) = limit(limit as Double?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Double>) = limit(limit.getOrNull())

        /**
         * A single oddID or comma-separated list of oddIDs. Used to specify specific Markets to
         * return.
         */
        fun oddId(oddId: String?) = apply { this.oddId = oddId }

        /** Alias for calling [Builder.oddId] with `oddId.orElse(null)`. */
        fun oddId(oddId: Optional<String>) = oddId(oddId.getOrNull())

        /** A single periodID or comma-separated list of periodIDs to filter Markets by */
        fun periodId(periodId: String?) = apply { this.periodId = periodId }

        /** Alias for calling [Builder.periodId] with `periodId.orElse(null)`. */
        fun periodId(periodId: Optional<String>) = periodId(periodId.getOrNull())

        /** Filter by prop type (game_prop, team_prop, player_prop, other_prop) */
        fun propType(propType: String?) = apply { this.propType = propType }

        /** Alias for calling [Builder.propType] with `propType.orElse(null)`. */
        fun propType(propType: Optional<String>) = propType(propType.getOrNull())

        /** A single sideID or comma-separated list of sideIDs to filter Markets by */
        fun sideId(sideId: String?) = apply { this.sideId = sideId }

        /** Alias for calling [Builder.sideId] with `sideId.orElse(null)`. */
        fun sideId(sideId: Optional<String>) = sideId(sideId.getOrNull())

        /** A single sportID or comma-separated list of sportIDs to filter Markets by */
        fun sportId(sportId: String?) = apply { this.sportId = sportId }

        /** Alias for calling [Builder.sportId] with `sportId.orElse(null)`. */
        fun sportId(sportId: Optional<String>) = sportId(sportId.getOrNull())

        /** A single statEntityID or comma-separated list of statEntityIDs to filter Markets by */
        fun statEntityId(statEntityId: String?) = apply { this.statEntityId = statEntityId }

        /** Alias for calling [Builder.statEntityId] with `statEntityId.orElse(null)`. */
        fun statEntityId(statEntityId: Optional<String>) = statEntityId(statEntityId.getOrNull())

        /** A single statID or comma-separated list of statIDs to filter Markets by */
        fun statId(statId: String?) = apply { this.statId = statId }

        /** Alias for calling [Builder.statId] with `statId.orElse(null)`. */
        fun statId(statId: Optional<String>) = statId(statId.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [MarketGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MarketGetParams =
            MarketGetParams(
                betTypeId,
                bookmakerId,
                cursor,
                isMainMarket,
                isProp,
                isSubPeriod,
                isSupported,
                leagueId,
                limit,
                oddId,
                periodId,
                propType,
                sideId,
                sportId,
                statEntityId,
                statId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                betTypeId?.let { put("betTypeID", it) }
                bookmakerId?.let { put("bookmakerID", it) }
                cursor?.let { put("cursor", it) }
                isMainMarket?.let { put("isMainMarket", it.toString()) }
                isProp?.let { put("isProp", it.toString()) }
                isSubPeriod?.let { put("isSubPeriod", it.toString()) }
                isSupported?.let { put("isSupported", it.toString()) }
                leagueId?.let { put("leagueID", it) }
                limit?.let { put("limit", it.toString()) }
                oddId?.let { put("oddID", it) }
                periodId?.let { put("periodID", it) }
                propType?.let { put("propType", it) }
                sideId?.let { put("sideID", it) }
                sportId?.let { put("sportID", it) }
                statEntityId?.let { put("statEntityID", it) }
                statId?.let { put("statID", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarketGetParams &&
            betTypeId == other.betTypeId &&
            bookmakerId == other.bookmakerId &&
            cursor == other.cursor &&
            isMainMarket == other.isMainMarket &&
            isProp == other.isProp &&
            isSubPeriod == other.isSubPeriod &&
            isSupported == other.isSupported &&
            leagueId == other.leagueId &&
            limit == other.limit &&
            oddId == other.oddId &&
            periodId == other.periodId &&
            propType == other.propType &&
            sideId == other.sideId &&
            sportId == other.sportId &&
            statEntityId == other.statEntityId &&
            statId == other.statId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            betTypeId,
            bookmakerId,
            cursor,
            isMainMarket,
            isProp,
            isSubPeriod,
            isSupported,
            leagueId,
            limit,
            oddId,
            periodId,
            propType,
            sideId,
            sportId,
            statEntityId,
            statId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "MarketGetParams{betTypeId=$betTypeId, bookmakerId=$bookmakerId, cursor=$cursor, isMainMarket=$isMainMarket, isProp=$isProp, isSubPeriod=$isSubPeriod, isSupported=$isSupported, leagueId=$leagueId, limit=$limit, oddId=$oddId, periodId=$periodId, propType=$propType, sideId=$sideId, sportId=$sportId, statEntityId=$statEntityId, statId=$statId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
