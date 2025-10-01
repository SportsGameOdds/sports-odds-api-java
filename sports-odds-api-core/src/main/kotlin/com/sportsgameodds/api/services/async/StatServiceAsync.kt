// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.async

import com.sportsgameodds.api.core.ClientOptions
import com.sportsgameodds.api.core.RequestOptions
import com.sportsgameodds.api.core.http.HttpResponseFor
import com.sportsgameodds.api.models.stats.Stat
import com.sportsgameodds.api.models.stats.StatGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface StatServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatServiceAsync

    /** Get a list of StatIDs */
    fun get(): CompletableFuture<List<Stat>> = get(StatGetParams.none())

    /** @see get */
    fun get(
        params: StatGetParams = StatGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Stat>>

    /** @see get */
    fun get(params: StatGetParams = StatGetParams.none()): CompletableFuture<List<Stat>> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): CompletableFuture<List<Stat>> =
        get(StatGetParams.none(), requestOptions)

    /** A view of [StatServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /stats/`, but is otherwise the same as
         * [StatServiceAsync.get].
         */
        fun get(): CompletableFuture<HttpResponseFor<List<Stat>>> = get(StatGetParams.none())

        /** @see get */
        fun get(
            params: StatGetParams = StatGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Stat>>>

        /** @see get */
        fun get(
            params: StatGetParams = StatGetParams.none()
        ): CompletableFuture<HttpResponseFor<List<Stat>>> = get(params, RequestOptions.none())

        /** @see get */
        fun get(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<Stat>>> =
            get(StatGetParams.none(), requestOptions)
    }
}
