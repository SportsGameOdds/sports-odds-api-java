// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.services.async

import com.sports_odds_api.api.core.ClientOptions
import com.sports_odds_api.api.core.RequestOptions
import com.sports_odds_api.api.core.http.HttpResponseFor
import com.sports_odds_api.api.models.account.AccountGetUsageParams
import com.sports_odds_api.api.models.account.AccountUsage
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync

    /** Get rate-limits and usage data about your API key */
    fun getUsage(): CompletableFuture<AccountUsage> = getUsage(AccountGetUsageParams.none())

    /** @see getUsage */
    fun getUsage(
        params: AccountGetUsageParams = AccountGetUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountUsage>

    /** @see getUsage */
    fun getUsage(
        params: AccountGetUsageParams = AccountGetUsageParams.none()
    ): CompletableFuture<AccountUsage> = getUsage(params, RequestOptions.none())

    /** @see getUsage */
    fun getUsage(requestOptions: RequestOptions): CompletableFuture<AccountUsage> =
        getUsage(AccountGetUsageParams.none(), requestOptions)

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /account/usage`, but is otherwise the same as
         * [AccountServiceAsync.getUsage].
         */
        fun getUsage(): CompletableFuture<HttpResponseFor<AccountUsage>> =
            getUsage(AccountGetUsageParams.none())

        /** @see getUsage */
        fun getUsage(
            params: AccountGetUsageParams = AccountGetUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountUsage>>

        /** @see getUsage */
        fun getUsage(
            params: AccountGetUsageParams = AccountGetUsageParams.none()
        ): CompletableFuture<HttpResponseFor<AccountUsage>> =
            getUsage(params, RequestOptions.none())

        /** @see getUsage */
        fun getUsage(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountUsage>> =
            getUsage(AccountGetUsageParams.none(), requestOptions)
    }
}
