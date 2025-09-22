// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.sports_odds_api.api.core.ClientOptions
import com.sports_odds_api.api.core.RequestOptions
import com.sports_odds_api.api.core.http.HttpResponseFor
import com.sports_odds_api.api.models.events.EventGetPage
import com.sports_odds_api.api.models.events.EventGetParams
import java.util.function.Consumer

interface EventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService

    /** Get a list of Events */
    fun get(): EventGetPage = get(EventGetParams.none())

    /** @see get */
    fun get(
        params: EventGetParams = EventGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventGetPage

    /** @see get */
    fun get(params: EventGetParams = EventGetParams.none()): EventGetPage =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): EventGetPage =
        get(EventGetParams.none(), requestOptions)

    /** A view of [EventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /events/`, but is otherwise the same as
         * [EventService.get].
         */
        @MustBeClosed fun get(): HttpResponseFor<EventGetPage> = get(EventGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: EventGetParams = EventGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventGetPage>

        /** @see get */
        @MustBeClosed
        fun get(params: EventGetParams = EventGetParams.none()): HttpResponseFor<EventGetPage> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(requestOptions: RequestOptions): HttpResponseFor<EventGetPage> =
            get(EventGetParams.none(), requestOptions)
    }
}
