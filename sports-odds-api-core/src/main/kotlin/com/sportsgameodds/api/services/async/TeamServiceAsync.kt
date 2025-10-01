// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.async

import com.sportsgameodds.api.core.ClientOptions
import com.sportsgameodds.api.core.RequestOptions
import com.sportsgameodds.api.core.http.HttpResponseFor
import com.sportsgameodds.api.models.teams.TeamGetPageAsync
import com.sportsgameodds.api.models.teams.TeamGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TeamServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamServiceAsync

    /** Get a list of Teams by ID or league */
    fun get(): CompletableFuture<TeamGetPageAsync> = get(TeamGetParams.none())

    /** @see get */
    fun get(
        params: TeamGetParams = TeamGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamGetPageAsync>

    /** @see get */
    fun get(params: TeamGetParams = TeamGetParams.none()): CompletableFuture<TeamGetPageAsync> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): CompletableFuture<TeamGetPageAsync> =
        get(TeamGetParams.none(), requestOptions)

    /** A view of [TeamServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /teams/`, but is otherwise the same as
         * [TeamServiceAsync.get].
         */
        fun get(): CompletableFuture<HttpResponseFor<TeamGetPageAsync>> = get(TeamGetParams.none())

        /** @see get */
        fun get(
            params: TeamGetParams = TeamGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamGetPageAsync>>

        /** @see get */
        fun get(
            params: TeamGetParams = TeamGetParams.none()
        ): CompletableFuture<HttpResponseFor<TeamGetPageAsync>> = get(params, RequestOptions.none())

        /** @see get */
        fun get(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TeamGetPageAsync>> =
            get(TeamGetParams.none(), requestOptions)
    }
}
