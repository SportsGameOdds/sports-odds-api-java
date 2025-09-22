// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.sports_odds_api.api.core.ClientOptions
import com.sports_odds_api.api.core.RequestOptions
import com.sports_odds_api.api.core.http.HttpResponseFor
import com.sports_odds_api.api.models.sports.Sport
import com.sports_odds_api.api.models.sports.SportGetParams
import java.util.function.Consumer

interface SportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SportService

    /** Get a list of sports */
    fun get(): List<Sport> = get(SportGetParams.none())

    /** @see get */
    fun get(
        params: SportGetParams = SportGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Sport>

    /** @see get */
    fun get(params: SportGetParams = SportGetParams.none()): List<Sport> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): List<Sport> =
        get(SportGetParams.none(), requestOptions)

    /** A view of [SportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /sports/`, but is otherwise the same as
         * [SportService.get].
         */
        @MustBeClosed fun get(): HttpResponseFor<List<Sport>> = get(SportGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SportGetParams = SportGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Sport>>

        /** @see get */
        @MustBeClosed
        fun get(params: SportGetParams = SportGetParams.none()): HttpResponseFor<List<Sport>> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(requestOptions: RequestOptions): HttpResponseFor<List<Sport>> =
            get(SportGetParams.none(), requestOptions)
    }
}
