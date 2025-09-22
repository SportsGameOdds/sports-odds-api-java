// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.models.teams

import com.sports_odds_api.api.core.AutoPager
import com.sports_odds_api.api.core.Page
import com.sports_odds_api.api.core.checkRequired
import com.sports_odds_api.api.models.DataEnvelope
import com.sports_odds_api.api.services.blocking.TeamService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see TeamService.get */
class TeamGetPage
private constructor(
    private val service: TeamService,
    private val params: TeamGetParams,
    private val response: DataEnvelope<Team>,
) : Page<Team> {

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

    override fun nextPage(): TeamGetPage = service.get(nextPageParams())

    fun autoPager(): AutoPager<Team> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TeamGetParams = params

    /** The response that this page was parsed from. */
    fun response(): DataEnvelope<Team> = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TeamGetPage].
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

    /** A builder for [TeamGetPage]. */
    class Builder internal constructor() {

        private var service: TeamService? = null
        private var params: TeamGetParams? = null
        private var response: DataEnvelope<Team>? = null

        @JvmSynthetic
        internal fun from(teamGetPage: TeamGetPage) = apply {
            service = teamGetPage.service
            params = teamGetPage.params
            response = teamGetPage.response
        }

        fun service(service: TeamService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TeamGetParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DataEnvelope<Team>) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TeamGetPage].
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
        fun build(): TeamGetPage =
            TeamGetPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamGetPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "TeamGetPage{service=$service, params=$params, response=$response}"
}
