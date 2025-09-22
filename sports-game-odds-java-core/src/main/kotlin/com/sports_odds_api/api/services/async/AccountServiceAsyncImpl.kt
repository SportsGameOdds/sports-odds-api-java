// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.services.async

import com.sports_odds_api.api.core.ClientOptions
import com.sports_odds_api.api.core.RequestOptions
import com.sports_odds_api.api.core.handlers.errorBodyHandler
import com.sports_odds_api.api.core.handlers.errorHandler
import com.sports_odds_api.api.core.handlers.jsonHandler
import com.sports_odds_api.api.core.http.HttpMethod
import com.sports_odds_api.api.core.http.HttpRequest
import com.sports_odds_api.api.core.http.HttpResponse
import com.sports_odds_api.api.core.http.HttpResponse.Handler
import com.sports_odds_api.api.core.http.HttpResponseFor
import com.sports_odds_api.api.core.http.parseable
import com.sports_odds_api.api.core.prepareAsync
import com.sports_odds_api.api.models.DataEnvelope
import com.sports_odds_api.api.models.account.AccountGetUsageParams
import com.sports_odds_api.api.models.account.AccountUsage
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AccountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountServiceAsync {

    private val withRawResponse: AccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync =
        AccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getUsage(
        params: AccountGetUsageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountUsage> =
        // get /account/usage
        withRawResponse().getUsage(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse =
            AccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getUsageHandler: Handler<DataEnvelope<AccountUsage>> =
            jsonHandler<DataEnvelope<AccountUsage>>(clientOptions.jsonMapper)

        override fun getUsage(
            params: AccountGetUsageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountUsage>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account", "usage")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getUsageHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .data()
                    }
                }
        }
    }
}
