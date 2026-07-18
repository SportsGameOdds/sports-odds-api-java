// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.sportsgameodds.api.core.ClientOptions
import com.sportsgameodds.api.core.RequestOptions
import com.sportsgameodds.api.core.http.HttpResponseFor
import com.sportsgameodds.api.models.markets.MarketGetPage
import com.sportsgameodds.api.models.markets.MarketGetParams
import java.util.function.Consumer

/** Get metadata on supported Markets */
interface MarketService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketService

    /** Get a list of Markets */
    fun get(): MarketGetPage = get(MarketGetParams.none())

    /** @see get */
    fun get(
        params: MarketGetParams = MarketGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketGetPage

    /** @see get */
    fun get(params: MarketGetParams = MarketGetParams.none()): MarketGetPage =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): MarketGetPage =
        get(MarketGetParams.none(), requestOptions)

    /** A view of [MarketService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /markets/`, but is otherwise the same as
         * [MarketService.get].
         */
        @MustBeClosed fun get(): HttpResponseFor<MarketGetPage> = get(MarketGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: MarketGetParams = MarketGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketGetPage>

        /** @see get */
        @MustBeClosed
        fun get(params: MarketGetParams = MarketGetParams.none()): HttpResponseFor<MarketGetPage> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(requestOptions: RequestOptions): HttpResponseFor<MarketGetPage> =
            get(MarketGetParams.none(), requestOptions)
    }
}
