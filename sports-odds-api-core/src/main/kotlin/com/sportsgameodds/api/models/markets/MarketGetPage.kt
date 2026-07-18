// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.markets

import com.sportsgameodds.api.core.AutoPager
import com.sportsgameodds.api.core.Page
import com.sportsgameodds.api.core.checkRequired
import com.sportsgameodds.api.services.blocking.MarketService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see MarketService.get */
class MarketGetPage
private constructor(
    private val service: MarketService,
    private val params: MarketGetParams,
    private val response: MarketGetPageResponse,
) : Page<Market> {

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

    override fun nextPage(): MarketGetPage = service.get(nextPageParams())

    fun autoPager(): AutoPager<Market> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MarketGetParams = params

    /** The response that this page was parsed from. */
    fun response(): MarketGetPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MarketGetPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarketGetPage]. */
    class Builder internal constructor() {

        private var service: MarketService? = null
        private var params: MarketGetParams? = null
        private var response: MarketGetPageResponse? = null

        @JvmSynthetic
        internal fun from(marketGetPage: MarketGetPage) = apply {
            service = marketGetPage.service
            params = marketGetPage.params
            response = marketGetPage.response
        }

        fun service(service: MarketService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MarketGetParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MarketGetPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MarketGetPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarketGetPage =
            MarketGetPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarketGetPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "MarketGetPage{service=$service, params=$params, response=$response}"
}
