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
import com.sports_odds_api.api.models.sports.Sport
import com.sports_odds_api.api.models.sports.SportGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SportServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SportServiceAsync {

    private val withRawResponse: SportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SportServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SportServiceAsync =
        SportServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(
        params: SportGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Sport>> =
        // get /sports/
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SportServiceAsync.WithRawResponse =
            SportServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<DataEnvelope<List<Sport>>> =
            jsonHandler<DataEnvelope<List<Sport>>>(clientOptions.jsonMapper)

        override fun get(
            params: SportGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Sport>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sports", "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
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
