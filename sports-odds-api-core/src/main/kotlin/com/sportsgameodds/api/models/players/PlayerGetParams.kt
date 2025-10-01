// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.players

import com.sportsgameodds.api.core.Params
import com.sportsgameodds.api.core.http.Headers
import com.sportsgameodds.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a list of Players for a specific Team or Event */
class PlayerGetParams
private constructor(
    private val cursor: String?,
    private val eventId: String?,
    private val limit: Double?,
    private val playerId: String?,
    private val teamId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The cursor for the request. Used to get the next group of Players. This should be the
     * nextCursor from the prior response.
     */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** EventID to get Players data for */
    fun eventId(): Optional<String> = Optional.ofNullable(eventId)

    /** The maximum number of Players to return */
    fun limit(): Optional<Double> = Optional.ofNullable(limit)

    /** PlayerID to get data for */
    fun playerId(): Optional<String> = Optional.ofNullable(playerId)

    /** TeamID to get Players data for */
    fun teamId(): Optional<String> = Optional.ofNullable(teamId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PlayerGetParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PlayerGetParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlayerGetParams]. */
    class Builder internal constructor() {

        private var cursor: String? = null
        private var eventId: String? = null
        private var limit: Double? = null
        private var playerId: String? = null
        private var teamId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(playerGetParams: PlayerGetParams) = apply {
            cursor = playerGetParams.cursor
            eventId = playerGetParams.eventId
            limit = playerGetParams.limit
            playerId = playerGetParams.playerId
            teamId = playerGetParams.teamId
            additionalHeaders = playerGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = playerGetParams.additionalQueryParams.toBuilder()
        }

        /**
         * The cursor for the request. Used to get the next group of Players. This should be the
         * nextCursor from the prior response.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** EventID to get Players data for */
        fun eventId(eventId: String?) = apply { this.eventId = eventId }

        /** Alias for calling [Builder.eventId] with `eventId.orElse(null)`. */
        fun eventId(eventId: Optional<String>) = eventId(eventId.getOrNull())

        /** The maximum number of Players to return */
        fun limit(limit: Double?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Double) = limit(limit as Double?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Double>) = limit(limit.getOrNull())

        /** PlayerID to get data for */
        fun playerId(playerId: String?) = apply { this.playerId = playerId }

        /** Alias for calling [Builder.playerId] with `playerId.orElse(null)`. */
        fun playerId(playerId: Optional<String>) = playerId(playerId.getOrNull())

        /** TeamID to get Players data for */
        fun teamId(teamId: String?) = apply { this.teamId = teamId }

        /** Alias for calling [Builder.teamId] with `teamId.orElse(null)`. */
        fun teamId(teamId: Optional<String>) = teamId(teamId.getOrNull())

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
         * Returns an immutable instance of [PlayerGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PlayerGetParams =
            PlayerGetParams(
                cursor,
                eventId,
                limit,
                playerId,
                teamId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                cursor?.let { put("cursor", it) }
                eventId?.let { put("eventID", it) }
                limit?.let { put("limit", it.toString()) }
                playerId?.let { put("playerID", it) }
                teamId?.let { put("teamID", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlayerGetParams &&
            cursor == other.cursor &&
            eventId == other.eventId &&
            limit == other.limit &&
            playerId == other.playerId &&
            teamId == other.teamId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            cursor,
            eventId,
            limit,
            playerId,
            teamId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PlayerGetParams{cursor=$cursor, eventId=$eventId, limit=$limit, playerId=$playerId, teamId=$teamId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
