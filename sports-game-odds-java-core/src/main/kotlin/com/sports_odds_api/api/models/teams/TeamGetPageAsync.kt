// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.models.teams

import com.sports_odds_api.api.core.AutoPagerAsync
import com.sports_odds_api.api.core.PageAsync
import com.sports_odds_api.api.core.checkRequired
import com.sports_odds_api.api.models.DataEnvelope
import com.sports_odds_api.api.services.async.TeamServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see TeamServiceAsync.get */
class TeamGetPageAsync
private constructor(
    private val service: TeamServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TeamGetParams,
    private val response: DataEnvelope<Team>,
) : PageAsync<Team> {

    /**
     * Delegates to [TeamGetPageResponse], but gracefully handles missing data.
     *
     * @see TeamGetPageResponse.data
     */
    fun data(): List<Team> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TeamGetPageResponse], but gracefully handles missing data.
     *
     * @see TeamGetPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("nextCursor")

    override fun items(): List<Team> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): TeamGetParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<TeamGetPageAsync> = service.get(nextPageParams())

    fun autoPager(): AutoPagerAsync<Team> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TeamGetParams = params

    /** The response that this page was parsed from. */
    fun response(): DataEnvelope<Team> = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TeamGetPageAsync].
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

    /** A builder for [TeamGetPageAsync]. */
    class Builder internal constructor() {

        private var service: TeamServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TeamGetParams? = null
        private var response: DataEnvelope<Team>? = null

        @JvmSynthetic
        internal fun from(teamGetPageAsync: TeamGetPageAsync) = apply {
            service = teamGetPageAsync.service
            streamHandlerExecutor = teamGetPageAsync.streamHandlerExecutor
            params = teamGetPageAsync.params
            response = teamGetPageAsync.response
        }

        fun service(service: TeamServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TeamGetParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DataEnvelope<Team>) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TeamGetPageAsync].
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
        fun build(): TeamGetPageAsync =
            TeamGetPageAsync(
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

        return other is TeamGetPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TeamGetPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
