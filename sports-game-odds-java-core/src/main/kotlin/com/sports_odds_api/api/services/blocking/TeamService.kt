// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.sports_odds_api.api.core.ClientOptions
import com.sports_odds_api.api.core.RequestOptions
import com.sports_odds_api.api.core.http.HttpResponseFor
import com.sports_odds_api.api.models.teams.TeamGetPage
import com.sports_odds_api.api.models.teams.TeamGetParams
import java.util.function.Consumer

interface TeamService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamService

    /** Get a list of Teams by ID or league */
    fun get(): TeamGetPage = get(TeamGetParams.none())

    /** @see get */
    fun get(
        params: TeamGetParams = TeamGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamGetPage

    /** @see get */
    fun get(params: TeamGetParams = TeamGetParams.none()): TeamGetPage =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): TeamGetPage = get(TeamGetParams.none(), requestOptions)

    /** A view of [TeamService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /teams/`, but is otherwise the same as
         * [TeamService.get].
         */
        @MustBeClosed fun get(): HttpResponseFor<TeamGetPage> = get(TeamGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: TeamGetParams = TeamGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamGetPage>

        /** @see get */
        @MustBeClosed
        fun get(params: TeamGetParams = TeamGetParams.none()): HttpResponseFor<TeamGetPage> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(requestOptions: RequestOptions): HttpResponseFor<TeamGetPage> =
            get(TeamGetParams.none(), requestOptions)
    }
}
