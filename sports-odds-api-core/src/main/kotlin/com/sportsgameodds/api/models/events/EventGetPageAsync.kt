// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.events

import com.sportsgameodds.api.core.AutoPagerAsync
import com.sportsgameodds.api.core.PageAsync
import com.sportsgameodds.api.core.checkRequired
import com.sportsgameodds.api.services.async.EventServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see EventServiceAsync.get */
class EventGetPageAsync
private constructor(
    private val service: EventServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EventGetParams,
    private val response: EventGetPageResponse,
) : PageAsync<Event> {

    /**
     * Delegates to [EventGetPageResponse], but gracefully handles missing data.
     *
     * @see EventGetPageResponse.data
     */
    fun data(): List<Event> = response.data().getOrNull() ?: emptyList()

    /**
     * Delegates to [EventGetPageResponse], but gracefully handles missing data.
     *
     * @see EventGetPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response.nextCursor()

    override fun items(): List<Event> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): EventGetParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<EventGetPageAsync> = service.get(nextPageParams())

    fun autoPager(): AutoPagerAsync<Event> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EventGetParams = params

    /** The response that this page was parsed from. */
    fun response(): EventGetPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventGetPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventGetPageAsync]. */
    class Builder internal constructor() {

        private var service: EventServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EventGetParams? = null
        private var response: EventGetPageResponse? = null

        @JvmSynthetic
        internal fun from(eventGetPageAsync: EventGetPageAsync) = apply {
            service = eventGetPageAsync.service
            streamHandlerExecutor = eventGetPageAsync.streamHandlerExecutor
            params = eventGetPageAsync.params
            response = eventGetPageAsync.response
        }

        fun service(service: EventServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EventGetParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EventGetPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EventGetPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventGetPageAsync =
            EventGetPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventGetPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EventGetPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
