// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.players

import com.sportsgameodds.api.core.AutoPager
import com.sportsgameodds.api.core.Page
import com.sportsgameodds.api.core.checkRequired
import com.sportsgameodds.api.services.blocking.PlayerService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PlayerService.get */
class PlayerGetPage
private constructor(
    private val service: PlayerService,
    private val params: PlayerGetParams,
    private val response: PlayerGetPageResponse,
) : Page<Player> {

    /**
     * Delegates to [PlayerGetPageResponse], but gracefully handles missing data.
     *
     * @see PlayerGetPageResponse.data
     */
    fun data(): List<Player> = response.data().getOrNull() ?: emptyList()

    /**
     * Delegates to [PlayerGetPageResponse], but gracefully handles missing data.
     *
     * @see PlayerGetPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response.nextCursor()

    override fun items(): List<Player> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): PlayerGetParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): PlayerGetPage = service.get(nextPageParams())

    fun autoPager(): AutoPager<Player> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PlayerGetParams = params

    /** The response that this page was parsed from. */
    fun response(): PlayerGetPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlayerGetPage].
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

    /** A builder for [PlayerGetPage]. */
    class Builder internal constructor() {

        private var service: PlayerService? = null
        private var params: PlayerGetParams? = null
        private var response: PlayerGetPageResponse? = null

        @JvmSynthetic
        internal fun from(playerGetPage: PlayerGetPage) = apply {
            service = playerGetPage.service
            params = playerGetPage.params
            response = playerGetPage.response
        }

        fun service(service: PlayerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlayerGetParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlayerGetPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlayerGetPage].
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
        fun build(): PlayerGetPage =
            PlayerGetPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlayerGetPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "PlayerGetPage{service=$service, params=$params, response=$response}"
}
