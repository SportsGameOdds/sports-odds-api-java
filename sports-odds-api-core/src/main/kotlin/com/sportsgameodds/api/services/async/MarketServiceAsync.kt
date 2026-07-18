// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.async

import com.sportsgameodds.api.core.ClientOptions
import com.sportsgameodds.api.core.RequestOptions
import com.sportsgameodds.api.core.http.HttpResponseFor
import com.sportsgameodds.api.models.markets.MarketGetPageAsync
import com.sportsgameodds.api.models.markets.MarketGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Get metadata on supported Markets */
interface MarketServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketServiceAsync

    /** Get a list of Markets */
    fun get(): CompletableFuture<MarketGetPageAsync> = get(MarketGetParams.none())

    /** @see get */
    fun get(
        params: MarketGetParams = MarketGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketGetPageAsync>

    /** @see get */
    fun get(
        params: MarketGetParams = MarketGetParams.none()
    ): CompletableFuture<MarketGetPageAsync> = get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): CompletableFuture<MarketGetPageAsync> =
        get(MarketGetParams.none(), requestOptions)

    /**
     * A view of [MarketServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /markets/`, but is otherwise the same as
         * [MarketServiceAsync.get].
         */
        fun get(): CompletableFuture<HttpResponseFor<MarketGetPageAsync>> =
            get(MarketGetParams.none())

        /** @see get */
        fun get(
            params: MarketGetParams = MarketGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketGetPageAsync>>

        /** @see get */
        fun get(
            params: MarketGetParams = MarketGetParams.none()
        ): CompletableFuture<HttpResponseFor<MarketGetPageAsync>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MarketGetPageAsync>> =
            get(MarketGetParams.none(), requestOptions)
    }
}
