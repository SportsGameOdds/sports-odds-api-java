// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.sportsgameodds.api.core.ClientOptions
import com.sportsgameodds.api.core.RequestOptions
import com.sportsgameodds.api.core.http.HttpResponseFor
import com.sportsgameodds.api.models.account.AccountGetUsageParams
import com.sportsgameodds.api.models.account.AccountUsage
import java.util.function.Consumer

interface AccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService

    /** Get rate-limits and usage data about your API key */
    fun getUsage(): AccountUsage = getUsage(AccountGetUsageParams.none())

    /** @see getUsage */
    fun getUsage(
        params: AccountGetUsageParams = AccountGetUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountUsage

    /** @see getUsage */
    fun getUsage(params: AccountGetUsageParams = AccountGetUsageParams.none()): AccountUsage =
        getUsage(params, RequestOptions.none())

    /** @see getUsage */
    fun getUsage(requestOptions: RequestOptions): AccountUsage =
        getUsage(AccountGetUsageParams.none(), requestOptions)

    /** A view of [AccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /account/usage`, but is otherwise the same as
         * [AccountService.getUsage].
         */
        @MustBeClosed
        fun getUsage(): HttpResponseFor<AccountUsage> = getUsage(AccountGetUsageParams.none())

        /** @see getUsage */
        @MustBeClosed
        fun getUsage(
            params: AccountGetUsageParams = AccountGetUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountUsage>

        /** @see getUsage */
        @MustBeClosed
        fun getUsage(
            params: AccountGetUsageParams = AccountGetUsageParams.none()
        ): HttpResponseFor<AccountUsage> = getUsage(params, RequestOptions.none())

        /** @see getUsage */
        @MustBeClosed
        fun getUsage(requestOptions: RequestOptions): HttpResponseFor<AccountUsage> =
            getUsage(AccountGetUsageParams.none(), requestOptions)
    }
}
