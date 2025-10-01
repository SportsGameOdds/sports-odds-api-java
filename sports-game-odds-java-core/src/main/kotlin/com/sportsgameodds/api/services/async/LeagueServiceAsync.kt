// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.async

import com.sportsgameodds.api.core.ClientOptions
import com.sportsgameodds.api.core.RequestOptions
import com.sportsgameodds.api.core.http.HttpResponseFor
import com.sportsgameodds.api.models.leagues.League
import com.sportsgameodds.api.models.leagues.LeagueGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LeagueServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LeagueServiceAsync

    /** Get a list of Leagues */
    fun get(): CompletableFuture<List<League>> = get(LeagueGetParams.none())

    /** @see get */
    fun get(
        params: LeagueGetParams = LeagueGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<League>>

    /** @see get */
    fun get(params: LeagueGetParams = LeagueGetParams.none()): CompletableFuture<List<League>> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): CompletableFuture<List<League>> =
        get(LeagueGetParams.none(), requestOptions)

    /**
     * A view of [LeagueServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LeagueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /leagues/`, but is otherwise the same as
         * [LeagueServiceAsync.get].
         */
        fun get(): CompletableFuture<HttpResponseFor<List<League>>> = get(LeagueGetParams.none())

        /** @see get */
        fun get(
            params: LeagueGetParams = LeagueGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<League>>>

        /** @see get */
        fun get(
            params: LeagueGetParams = LeagueGetParams.none()
        ): CompletableFuture<HttpResponseFor<List<League>>> = get(params, RequestOptions.none())

        /** @see get */
        fun get(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<League>>> =
            get(LeagueGetParams.none(), requestOptions)
    }
}
