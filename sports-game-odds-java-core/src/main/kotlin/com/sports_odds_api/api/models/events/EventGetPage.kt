// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.models.events

import com.sports_odds_api.api.core.AutoPager
import com.sports_odds_api.api.core.Page
import com.sports_odds_api.api.core.checkRequired
import com.sports_odds_api.api.models.DataEnvelope
import com.sports_odds_api.api.services.blocking.EventService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see EventService.get */
class EventGetPage
private constructor(
    private val service: EventService,
    private val params: EventGetParams,
    private val response: DataEnvelope<Event>,
) : Page<Event> {

    /**
     * Delegates to [EventGetPageResponse], but gracefully handles missing data.
     *
     * @see EventGetPageResponse.data
     */
    fun data(): List<Event> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EventGetPageResponse], but gracefully handles missing data.
     *
     * @see EventGetPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("nextCursor")

    override fun items(): List<Event> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): EventGetParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): EventGetPage = service.get(nextPageParams())

    fun autoPager(): AutoPager<Event> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EventGetParams = params

    /** The response that this page was parsed from. */
    fun response(): DataEnvelope<Event> = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventGetPage].
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

    /** A builder for [EventGetPage]. */
    class Builder internal constructor() {

        private var service: EventService? = null
        private var params: EventGetParams? = null
        private var response: DataEnvelope<Event>? = null

        @JvmSynthetic
        internal fun from(eventGetPage: EventGetPage) = apply {
            service = eventGetPage.service
            params = eventGetPage.params
            response = eventGetPage.response
        }

        fun service(service: EventService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EventGetParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DataEnvelope<Event>) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EventGetPage].
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
        fun build(): EventGetPage =
            EventGetPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventGetPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "EventGetPage{service=$service, params=$params, response=$response}"
}
