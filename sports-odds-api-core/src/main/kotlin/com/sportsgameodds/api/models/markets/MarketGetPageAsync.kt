// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.markets

import com.sportsgameodds.api.core.AutoPagerAsync
import com.sportsgameodds.api.core.PageAsync
import com.sportsgameodds.api.core.checkRequired
import com.sportsgameodds.api.services.async.MarketServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see MarketServiceAsync.get */
class MarketGetPageAsync
private constructor(
    private val service: MarketServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MarketGetParams,
    private val response: MarketGetPageResponse,
) : PageAsync<Market> {

    /**
     * Delegates to [MarketGetPageResponse], but gracefully handles missing data.
     *
     * @see MarketGetPageResponse.data
     */
    fun data(): List<Market> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MarketGetPageResponse], but gracefully handles missing data.
     *
     * @see MarketGetPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("nextCursor")

    override fun items(): List<Market> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): MarketGetParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<MarketGetPageAsync> = service.get(nextPageParams())

    fun autoPager(): AutoPagerAsync<Market> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MarketGetParams = params

    /** The response that this page was parsed from. */
    fun response(): MarketGetPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MarketGetPageAsync].
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

    /** A builder for [MarketGetPageAsync]. */
    class Builder internal constructor() {

        private var service: MarketServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MarketGetParams? = null
        private var response: MarketGetPageResponse? = null

        @JvmSynthetic
        internal fun from(marketGetPageAsync: MarketGetPageAsync) = apply {
            service = marketGetPageAsync.service
            streamHandlerExecutor = marketGetPageAsync.streamHandlerExecutor
            params = marketGetPageAsync.params
            response = marketGetPageAsync.response
        }

        fun service(service: MarketServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MarketGetParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MarketGetPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MarketGetPageAsync].
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
        fun build(): MarketGetPageAsync =
            MarketGetPageAsync(
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

        return other is MarketGetPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MarketGetPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
