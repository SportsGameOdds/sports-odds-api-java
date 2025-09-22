// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.models.stats

import com.sports_odds_api.api.core.Params
import com.sports_odds_api.api.core.http.Headers
import com.sports_odds_api.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a list of StatIDs */
class StatGetParams
private constructor(
    private val sportId: String?,
    private val statId: String?,
    private val statLevel: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** SportID to get StatIDs for */
    fun sportId(): Optional<String> = Optional.ofNullable(sportId)

    /** StatID to get data for */
    fun statId(): Optional<String> = Optional.ofNullable(statId)

    /**
     * Level of the stat, must be used in combination with sportID. Must be one of all, player, or
     * team. Shows stats that are applicable to that specified entity, defaults to all.
     */
    fun statLevel(): Optional<String> = Optional.ofNullable(statLevel)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): StatGetParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [StatGetParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StatGetParams]. */
    class Builder internal constructor() {

        private var sportId: String? = null
        private var statId: String? = null
        private var statLevel: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(statGetParams: StatGetParams) = apply {
            sportId = statGetParams.sportId
            statId = statGetParams.statId
            statLevel = statGetParams.statLevel
            additionalHeaders = statGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = statGetParams.additionalQueryParams.toBuilder()
        }

        /** SportID to get StatIDs for */
        fun sportId(sportId: String?) = apply { this.sportId = sportId }

        /** Alias for calling [Builder.sportId] with `sportId.orElse(null)`. */
        fun sportId(sportId: Optional<String>) = sportId(sportId.getOrNull())

        /** StatID to get data for */
        fun statId(statId: String?) = apply { this.statId = statId }

        /** Alias for calling [Builder.statId] with `statId.orElse(null)`. */
        fun statId(statId: Optional<String>) = statId(statId.getOrNull())

        /**
         * Level of the stat, must be used in combination with sportID. Must be one of all, player,
         * or team. Shows stats that are applicable to that specified entity, defaults to all.
         */
        fun statLevel(statLevel: String?) = apply { this.statLevel = statLevel }

        /** Alias for calling [Builder.statLevel] with `statLevel.orElse(null)`. */
        fun statLevel(statLevel: Optional<String>) = statLevel(statLevel.getOrNull())

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
         * Returns an immutable instance of [StatGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StatGetParams =
            StatGetParams(
                sportId,
                statId,
                statLevel,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                sportId?.let { put("sportID", it) }
                statId?.let { put("statID", it) }
                statLevel?.let { put("statLevel", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StatGetParams &&
            sportId == other.sportId &&
            statId == other.statId &&
            statLevel == other.statLevel &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(sportId, statId, statLevel, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "StatGetParams{sportId=$sportId, statId=$statId, statLevel=$statLevel, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
