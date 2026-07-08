// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.async

import com.sportsgameodds.api.core.ClientOptions
import com.sportsgameodds.api.core.RequestOptions
import com.sportsgameodds.api.core.http.HttpResponseFor
import com.sportsgameodds.api.models.sports.Sport
import com.sportsgameodds.api.models.sports.SportGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Get Sport-related data */
interface SportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SportServiceAsync

    /** Get a list of sports */
    fun get(): CompletableFuture<List<Sport>> = get(SportGetParams.none())

    /** @see get */
    fun get(
        params: SportGetParams = SportGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Sport>>

    /** @see get */
    fun get(params: SportGetParams = SportGetParams.none()): CompletableFuture<List<Sport>> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): CompletableFuture<List<Sport>> =
        get(SportGetParams.none(), requestOptions)

    /** A view of [SportServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /sports/`, but is otherwise the same as
         * [SportServiceAsync.get].
         */
        fun get(): CompletableFuture<HttpResponseFor<List<Sport>>> = get(SportGetParams.none())

        /** @see get */
        fun get(
            params: SportGetParams = SportGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Sport>>>

        /** @see get */
        fun get(
            params: SportGetParams = SportGetParams.none()
        ): CompletableFuture<HttpResponseFor<List<Sport>>> = get(params, RequestOptions.none())

        /** @see get */
        fun get(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<Sport>>> =
            get(SportGetParams.none(), requestOptions)
    }
}
