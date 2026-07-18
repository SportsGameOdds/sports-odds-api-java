// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.teams

import com.sportsgameodds.api.core.Params
import com.sportsgameodds.api.core.http.Headers
import com.sportsgameodds.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a list of Teams by ID or league */
class TeamGetParams
private constructor(
    private val cursor: String?,
    private val leagueId: String?,
    private val limit: Double?,
    private val sportId: String?,
    private val teamId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The cursor for the request. Used to get the next group of Teams. This is an opaque token —
     * pass the nextCursor value from the prior response unchanged.
     */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** A single leagueID or comma-separated list of leagueIDs to get Teams for */
    fun leagueId(): Optional<String> = Optional.ofNullable(leagueId)

    /** The maximum number of Teams to return */
    fun limit(): Optional<Double> = Optional.ofNullable(limit)

    /** A single sportID or comma-separated list of sportIDs to get Teams for */
    fun sportId(): Optional<String> = Optional.ofNullable(sportId)

    /** A single teamID or comma-separated list of teamIDs to get data for */
    fun teamId(): Optional<String> = Optional.ofNullable(teamId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TeamGetParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TeamGetParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TeamGetParams]. */
    class Builder internal constructor() {

        private var cursor: String? = null
        private var leagueId: String? = null
        private var limit: Double? = null
        private var sportId: String? = null
        private var teamId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(teamGetParams: TeamGetParams) = apply {
            cursor = teamGetParams.cursor
            leagueId = teamGetParams.leagueId
            limit = teamGetParams.limit
            sportId = teamGetParams.sportId
            teamId = teamGetParams.teamId
            additionalHeaders = teamGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = teamGetParams.additionalQueryParams.toBuilder()
        }

        /**
         * The cursor for the request. Used to get the next group of Teams. This is an opaque token
         * — pass the nextCursor value from the prior response unchanged.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** A single leagueID or comma-separated list of leagueIDs to get Teams for */
        fun leagueId(leagueId: String?) = apply { this.leagueId = leagueId }

        /** Alias for calling [Builder.leagueId] with `leagueId.orElse(null)`. */
        fun leagueId(leagueId: Optional<String>) = leagueId(leagueId.getOrNull())

        /** The maximum number of Teams to return */
        fun limit(limit: Double?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Double) = limit(limit as Double?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Double>) = limit(limit.getOrNull())

        /** A single sportID or comma-separated list of sportIDs to get Teams for */
        fun sportId(sportId: String?) = apply { this.sportId = sportId }

        /** Alias for calling [Builder.sportId] with `sportId.orElse(null)`. */
        fun sportId(sportId: Optional<String>) = sportId(sportId.getOrNull())

        /** A single teamID or comma-separated list of teamIDs to get data for */
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
         * Returns an immutable instance of [TeamGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TeamGetParams =
            TeamGetParams(
                cursor,
                leagueId,
                limit,
                sportId,
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
                leagueId?.let { put("leagueID", it) }
                limit?.let { put("limit", it.toString()) }
                sportId?.let { put("sportID", it) }
                teamId?.let { put("teamID", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamGetParams &&
            cursor == other.cursor &&
            leagueId == other.leagueId &&
            limit == other.limit &&
            sportId == other.sportId &&
            teamId == other.teamId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            cursor,
            leagueId,
            limit,
            sportId,
            teamId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TeamGetParams{cursor=$cursor, leagueId=$leagueId, limit=$limit, sportId=$sportId, teamId=$teamId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
