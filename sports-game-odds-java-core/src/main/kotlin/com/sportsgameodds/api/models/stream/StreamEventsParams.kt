// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.stream

import com.sportsgameodds.api.core.Params
import com.sportsgameodds.api.core.http.Headers
import com.sportsgameodds.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Setup streamed (WebSocket) connection */
class StreamEventsParams
private constructor(
    private val eventId: String?,
    private val feed: String?,
    private val leagueId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** An eventID to stream events for */
    fun eventId(): Optional<String> = Optional.ofNullable(eventId)

    /** The feed you would like to subscribe to */
    fun feed(): Optional<String> = Optional.ofNullable(feed)

    /** A leagueID to stream events for */
    fun leagueId(): Optional<String> = Optional.ofNullable(leagueId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): StreamEventsParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [StreamEventsParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StreamEventsParams]. */
    class Builder internal constructor() {

        private var eventId: String? = null
        private var feed: String? = null
        private var leagueId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(streamEventsParams: StreamEventsParams) = apply {
            eventId = streamEventsParams.eventId
            feed = streamEventsParams.feed
            leagueId = streamEventsParams.leagueId
            additionalHeaders = streamEventsParams.additionalHeaders.toBuilder()
            additionalQueryParams = streamEventsParams.additionalQueryParams.toBuilder()
        }

        /** An eventID to stream events for */
        fun eventId(eventId: String?) = apply { this.eventId = eventId }

        /** Alias for calling [Builder.eventId] with `eventId.orElse(null)`. */
        fun eventId(eventId: Optional<String>) = eventId(eventId.getOrNull())

        /** The feed you would like to subscribe to */
        fun feed(feed: String?) = apply { this.feed = feed }

        /** Alias for calling [Builder.feed] with `feed.orElse(null)`. */
        fun feed(feed: Optional<String>) = feed(feed.getOrNull())

        /** A leagueID to stream events for */
        fun leagueId(leagueId: String?) = apply { this.leagueId = leagueId }

        /** Alias for calling [Builder.leagueId] with `leagueId.orElse(null)`. */
        fun leagueId(leagueId: Optional<String>) = leagueId(leagueId.getOrNull())

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
         * Returns an immutable instance of [StreamEventsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StreamEventsParams =
            StreamEventsParams(
                eventId,
                feed,
                leagueId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                eventId?.let { put("eventID", it) }
                feed?.let { put("feed", it) }
                leagueId?.let { put("leagueID", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StreamEventsParams &&
            eventId == other.eventId &&
            feed == other.feed &&
            leagueId == other.leagueId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(eventId, feed, leagueId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "StreamEventsParams{eventId=$eventId, feed=$feed, leagueId=$leagueId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
