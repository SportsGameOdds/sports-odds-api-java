// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.services.blocking

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
import com.sports_odds_api.api.core.prepare
import com.sports_odds_api.api.models.DataEnvelope
import com.sports_odds_api.api.models.account.AccountGetUsageParams
import com.sports_odds_api.api.models.account.AccountUsage
import java.util.function.Consumer

class AccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountService {

    private val withRawResponse: AccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService =
        AccountServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getUsage(
        params: AccountGetUsageParams,
        requestOptions: RequestOptions,
    ): AccountUsage =
        // get /account/usage
        withRawResponse().getUsage(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountService.WithRawResponse =
            AccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getUsageHandler: Handler<DataEnvelope<AccountUsage>> =
            jsonHandler<DataEnvelope<AccountUsage>>(clientOptions.jsonMapper)

        override fun getUsage(
            params: AccountGetUsageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountUsage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account", "usage")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
