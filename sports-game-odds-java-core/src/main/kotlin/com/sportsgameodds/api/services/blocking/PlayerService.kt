// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.sportsgameodds.api.core.ClientOptions
import com.sportsgameodds.api.core.RequestOptions
import com.sportsgameodds.api.core.http.HttpResponseFor
import com.sportsgameodds.api.models.players.PlayerGetPage
import com.sportsgameodds.api.models.players.PlayerGetParams
import java.util.function.Consumer

interface PlayerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlayerService

    /** Get a list of Players for a specific Team or Event */
    fun get(): PlayerGetPage = get(PlayerGetParams.none())

    /** @see get */
    fun get(
        params: PlayerGetParams = PlayerGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlayerGetPage

    /** @see get */
    fun get(params: PlayerGetParams = PlayerGetParams.none()): PlayerGetPage =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): PlayerGetPage =
        get(PlayerGetParams.none(), requestOptions)

    /** A view of [PlayerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlayerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /players/`, but is otherwise the same as
         * [PlayerService.get].
         */
        @MustBeClosed fun get(): HttpResponseFor<PlayerGetPage> = get(PlayerGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PlayerGetParams = PlayerGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlayerGetPage>

        /** @see get */
        @MustBeClosed
        fun get(params: PlayerGetParams = PlayerGetParams.none()): HttpResponseFor<PlayerGetPage> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(requestOptions: RequestOptions): HttpResponseFor<PlayerGetPage> =
            get(PlayerGetParams.none(), requestOptions)
    }
}
