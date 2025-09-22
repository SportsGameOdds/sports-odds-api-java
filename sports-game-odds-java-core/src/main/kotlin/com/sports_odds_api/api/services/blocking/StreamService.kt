// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.sports_odds_api.api.core.ClientOptions
import com.sports_odds_api.api.core.RequestOptions
import com.sports_odds_api.api.core.http.HttpResponseFor
import com.sports_odds_api.api.models.stream.StreamEventsParams
import com.sports_odds_api.api.models.stream.StreamEventsResponse
import java.util.function.Consumer

interface StreamService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamService

    /** Setup streamed (WebSocket) connection */
    fun events(): StreamEventsResponse = events(StreamEventsParams.none())

    /** @see events */
    fun events(
        params: StreamEventsParams = StreamEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamEventsResponse

    /** @see events */
    fun events(params: StreamEventsParams = StreamEventsParams.none()): StreamEventsResponse =
        events(params, RequestOptions.none())

    /** @see events */
    fun events(requestOptions: RequestOptions): StreamEventsResponse =
        events(StreamEventsParams.none(), requestOptions)

    /** A view of [StreamService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /stream/events`, but is otherwise the same as
         * [StreamService.events].
         */
        @MustBeClosed
        fun events(): HttpResponseFor<StreamEventsResponse> = events(StreamEventsParams.none())

        /** @see events */
        @MustBeClosed
        fun events(
            params: StreamEventsParams = StreamEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamEventsResponse>

        /** @see events */
        @MustBeClosed
        fun events(
            params: StreamEventsParams = StreamEventsParams.none()
        ): HttpResponseFor<StreamEventsResponse> = events(params, RequestOptions.none())

        /** @see events */
        @MustBeClosed
        fun events(requestOptions: RequestOptions): HttpResponseFor<StreamEventsResponse> =
            events(StreamEventsParams.none(), requestOptions)
    }
}
