// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.async

import com.sportsgameodds.api.core.ClientOptions
import com.sportsgameodds.api.core.RequestOptions
import com.sportsgameodds.api.core.handlers.errorBodyHandler
import com.sportsgameodds.api.core.handlers.errorHandler
import com.sportsgameodds.api.core.handlers.jsonHandler
import com.sportsgameodds.api.core.http.HttpMethod
import com.sportsgameodds.api.core.http.HttpRequest
import com.sportsgameodds.api.core.http.HttpResponse
import com.sportsgameodds.api.core.http.HttpResponse.Handler
import com.sportsgameodds.api.core.http.HttpResponseFor
import com.sportsgameodds.api.core.http.parseable
import com.sportsgameodds.api.core.prepareAsync
import com.sportsgameodds.api.models.markets.MarketGetPageAsync
import com.sportsgameodds.api.models.markets.MarketGetPageResponse
import com.sportsgameodds.api.models.markets.MarketGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Get metadata on supported Markets */
class MarketServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MarketServiceAsync {

    private val withRawResponse: MarketServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MarketServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketServiceAsync =
        MarketServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(
        params: MarketGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MarketGetPageAsync> =
        // get /markets/
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MarketServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketServiceAsync.WithRawResponse =
            MarketServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<MarketGetPageResponse> =
            jsonHandler<MarketGetPageResponse>(clientOptions.jsonMapper)

        override fun get(
            params: MarketGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MarketGetPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("markets", "")
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
                            .let {
                                MarketGetPageAsync.builder()
                                    .service(MarketServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
