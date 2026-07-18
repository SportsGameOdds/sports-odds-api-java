// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.async

import com.sportsgameodds.api.core.ClientOptions
import com.sportsgameodds.api.core.RequestOptions
import com.sportsgameodds.api.core.http.HttpResponseFor
import com.sportsgameodds.api.models.stream.StreamEventsParams
import com.sportsgameodds.api.models.stream.StreamEventsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Get info about Events (includes odds, results, teams, and other metadata) */
interface StreamServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamServiceAsync

    /** Setup streamed (WebSocket) connection */
    fun events(): CompletableFuture<StreamEventsResponse> = events(StreamEventsParams.none())

    /** @see events */
    fun events(
        params: StreamEventsParams = StreamEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StreamEventsResponse>

    /** @see events */
    fun events(
        params: StreamEventsParams = StreamEventsParams.none()
    ): CompletableFuture<StreamEventsResponse> = events(params, RequestOptions.none())

    /** @see events */
    fun events(requestOptions: RequestOptions): CompletableFuture<StreamEventsResponse> =
        events(StreamEventsParams.none(), requestOptions)

    /**
     * A view of [StreamServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StreamServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /stream/events`, but is otherwise the same as
         * [StreamServiceAsync.events].
         */
        fun events(): CompletableFuture<HttpResponseFor<StreamEventsResponse>> =
            events(StreamEventsParams.none())

        /** @see events */
        fun events(
            params: StreamEventsParams = StreamEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamEventsResponse>>

        /** @see events */
        fun events(
            params: StreamEventsParams = StreamEventsParams.none()
        ): CompletableFuture<HttpResponseFor<StreamEventsResponse>> =
            events(params, RequestOptions.none())

        /** @see events */
        fun events(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StreamEventsResponse>> =
            events(StreamEventsParams.none(), requestOptions)
    }
}
