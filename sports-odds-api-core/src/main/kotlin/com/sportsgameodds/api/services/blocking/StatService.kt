// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.sportsgameodds.api.core.ClientOptions
import com.sportsgameodds.api.core.RequestOptions
import com.sportsgameodds.api.core.http.HttpResponseFor
import com.sportsgameodds.api.models.stats.Stat
import com.sportsgameodds.api.models.stats.StatGetParams
import java.util.function.Consumer

/** Get data on specific Stats */
interface StatService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatService

    /** Get a list of StatIDs */
    fun get(): List<Stat> = get(StatGetParams.none())

    /** @see get */
    fun get(
        params: StatGetParams = StatGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Stat>

    /** @see get */
    fun get(params: StatGetParams = StatGetParams.none()): List<Stat> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): List<Stat> = get(StatGetParams.none(), requestOptions)

    /** A view of [StatService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /stats/`, but is otherwise the same as
         * [StatService.get].
         */
        @MustBeClosed fun get(): HttpResponseFor<List<Stat>> = get(StatGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: StatGetParams = StatGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Stat>>

        /** @see get */
        @MustBeClosed
        fun get(params: StatGetParams = StatGetParams.none()): HttpResponseFor<List<Stat>> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(requestOptions: RequestOptions): HttpResponseFor<List<Stat>> =
            get(StatGetParams.none(), requestOptions)
    }
}
