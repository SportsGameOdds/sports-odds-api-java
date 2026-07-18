// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.services.blocking

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
import com.sportsgameodds.api.core.prepare
import com.sportsgameodds.api.models.markets.MarketGetPage
import com.sportsgameodds.api.models.markets.MarketGetPageResponse
import com.sportsgameodds.api.models.markets.MarketGetParams
import java.util.function.Consumer

/** Get metadata on supported Markets */
class MarketServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MarketService {

    private val withRawResponse: MarketService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MarketService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketService =
        MarketServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(params: MarketGetParams, requestOptions: RequestOptions): MarketGetPage =
        // get /markets/
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MarketService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketService.WithRawResponse =
            MarketServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<MarketGetPageResponse> =
            jsonHandler<MarketGetPageResponse>(clientOptions.jsonMapper)

        override fun get(
            params: MarketGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketGetPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("markets", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        MarketGetPage.builder()
                            .service(MarketServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
