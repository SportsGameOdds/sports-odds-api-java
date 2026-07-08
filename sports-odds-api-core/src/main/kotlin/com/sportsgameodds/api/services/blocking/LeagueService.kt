// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.sportsgameodds.api.core.ClientOptions
import com.sportsgameodds.api.core.RequestOptions
import com.sportsgameodds.api.core.http.HttpResponseFor
import com.sportsgameodds.api.models.leagues.League
import com.sportsgameodds.api.models.leagues.LeagueGetParams
import java.util.function.Consumer

/** Get League-related data */
interface LeagueService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LeagueService

    /** Get a list of Leagues */
    fun get(): List<League> = get(LeagueGetParams.none())

    /** @see get */
    fun get(
        params: LeagueGetParams = LeagueGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<League>

    /** @see get */
    fun get(params: LeagueGetParams = LeagueGetParams.none()): List<League> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): List<League> =
        get(LeagueGetParams.none(), requestOptions)

    /** A view of [LeagueService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LeagueService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /leagues/`, but is otherwise the same as
         * [LeagueService.get].
         */
        @MustBeClosed fun get(): HttpResponseFor<List<League>> = get(LeagueGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: LeagueGetParams = LeagueGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<League>>

        /** @see get */
        @MustBeClosed
        fun get(params: LeagueGetParams = LeagueGetParams.none()): HttpResponseFor<List<League>> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(requestOptions: RequestOptions): HttpResponseFor<List<League>> =
            get(LeagueGetParams.none(), requestOptions)
    }
}
