// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.async

import com.sportsgameodds.api.core.ClientOptions
import com.sportsgameodds.api.core.RequestOptions
import com.sportsgameodds.api.core.http.HttpResponseFor
import com.sportsgameodds.api.models.players.PlayerGetPageAsync
import com.sportsgameodds.api.models.players.PlayerGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PlayerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlayerServiceAsync

    /** Get a list of Players for a specific Team or Event */
    fun get(): CompletableFuture<PlayerGetPageAsync> = get(PlayerGetParams.none())

    /** @see get */
    fun get(
        params: PlayerGetParams = PlayerGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlayerGetPageAsync>

    /** @see get */
    fun get(
        params: PlayerGetParams = PlayerGetParams.none()
    ): CompletableFuture<PlayerGetPageAsync> = get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): CompletableFuture<PlayerGetPageAsync> =
        get(PlayerGetParams.none(), requestOptions)

    /**
     * A view of [PlayerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlayerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /players/`, but is otherwise the same as
         * [PlayerServiceAsync.get].
         */
        fun get(): CompletableFuture<HttpResponseFor<PlayerGetPageAsync>> =
            get(PlayerGetParams.none())

        /** @see get */
        fun get(
            params: PlayerGetParams = PlayerGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlayerGetPageAsync>>

        /** @see get */
        fun get(
            params: PlayerGetParams = PlayerGetParams.none()
        ): CompletableFuture<HttpResponseFor<PlayerGetPageAsync>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PlayerGetPageAsync>> =
            get(PlayerGetParams.none(), requestOptions)
    }
}
