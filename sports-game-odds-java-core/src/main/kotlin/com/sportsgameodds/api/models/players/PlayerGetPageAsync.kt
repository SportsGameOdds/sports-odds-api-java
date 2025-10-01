// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.players

import com.sportsgameodds.api.core.AutoPagerAsync
import com.sportsgameodds.api.core.PageAsync
import com.sportsgameodds.api.core.checkRequired
import com.sportsgameodds.api.models.DataEnvelope
import com.sportsgameodds.api.services.async.PlayerServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PlayerServiceAsync.get */
class PlayerGetPageAsync
private constructor(
    private val service: PlayerServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PlayerGetParams,
    private val response: DataEnvelope<Player>,
) : PageAsync<Player> {

    /**
     * Delegates to [PlayerGetPageResponse], but gracefully handles missing data.
     *
     * @see PlayerGetPageResponse.data
     */
    fun data(): List<Player> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlayerGetPageResponse], but gracefully handles missing data.
     *
     * @see PlayerGetPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("nextCursor")

    override fun items(): List<Player> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): PlayerGetParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PlayerGetPageAsync> = service.get(nextPageParams())

    fun autoPager(): AutoPagerAsync<Player> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PlayerGetParams = params

    /** The response that this page was parsed from. */
    fun response(): DataEnvelope<Player> = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlayerGetPageAsync].
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

    /** A builder for [PlayerGetPageAsync]. */
    class Builder internal constructor() {

        private var service: PlayerServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PlayerGetParams? = null
        private var response: DataEnvelope<Player>? = null

        @JvmSynthetic
        internal fun from(playerGetPageAsync: PlayerGetPageAsync) = apply {
            service = playerGetPageAsync.service
            streamHandlerExecutor = playerGetPageAsync.streamHandlerExecutor
            params = playerGetPageAsync.params
            response = playerGetPageAsync.response
        }

        fun service(service: PlayerServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PlayerGetParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DataEnvelope<Player>) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlayerGetPageAsync].
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
        fun build(): PlayerGetPageAsync =
            PlayerGetPageAsync(
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

        return other is PlayerGetPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PlayerGetPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
