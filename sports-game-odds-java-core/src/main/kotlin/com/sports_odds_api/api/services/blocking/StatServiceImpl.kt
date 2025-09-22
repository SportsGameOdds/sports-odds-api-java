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
import com.sports_odds_api.api.models.stats.Stat
import com.sports_odds_api.api.models.stats.StatGetParams
import java.util.function.Consumer

class StatServiceImpl internal constructor(private val clientOptions: ClientOptions) : StatService {

    private val withRawResponse: StatService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StatService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatService =
        StatServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(params: StatGetParams, requestOptions: RequestOptions): List<Stat> =
        // get /stats/
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatService.WithRawResponse =
            StatServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<DataEnvelope<List<Stat>>> =
            jsonHandler<DataEnvelope<List<Stat>>>(clientOptions.jsonMapper)

        override fun get(
            params: StatGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Stat>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("stats", "")
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
                    .data()
            }
        }
    }
}
