// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.async

import com.sportsgameodds.api.core.ClientOptions
import com.sportsgameodds.api.core.RequestOptions
import com.sportsgameodds.api.core.http.HttpResponseFor
import com.sportsgameodds.api.models.events.EventGetPageAsync
import com.sportsgameodds.api.models.events.EventGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Get info about Events (includes odds, results, teams, and other metadata) */
interface EventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventServiceAsync

    /** Get a list of Events */
    fun get(): CompletableFuture<EventGetPageAsync> = get(EventGetParams.none())

    /** @see get */
    fun get(
        params: EventGetParams = EventGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventGetPageAsync>

    /** @see get */
    fun get(params: EventGetParams = EventGetParams.none()): CompletableFuture<EventGetPageAsync> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): CompletableFuture<EventGetPageAsync> =
        get(EventGetParams.none(), requestOptions)

    /** A view of [EventServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /events/`, but is otherwise the same as
         * [EventServiceAsync.get].
         */
        fun get(): CompletableFuture<HttpResponseFor<EventGetPageAsync>> =
            get(EventGetParams.none())

        /** @see get */
        fun get(
            params: EventGetParams = EventGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventGetPageAsync>>

        /** @see get */
        fun get(
            params: EventGetParams = EventGetParams.none()
        ): CompletableFuture<HttpResponseFor<EventGetPageAsync>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EventGetPageAsync>> =
            get(EventGetParams.none(), requestOptions)
    }
}
