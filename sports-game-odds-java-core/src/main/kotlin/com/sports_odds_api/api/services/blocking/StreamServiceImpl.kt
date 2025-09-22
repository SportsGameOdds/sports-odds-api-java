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
import com.sports_odds_api.api.models.stream.StreamEventsParams
import com.sports_odds_api.api.models.stream.StreamEventsResponse
import java.util.function.Consumer

class StreamServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StreamService {

    private val withRawResponse: StreamService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StreamService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamService =
        StreamServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun events(
        params: StreamEventsParams,
        requestOptions: RequestOptions,
    ): StreamEventsResponse =
        // get /stream/events
        withRawResponse().events(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StreamService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StreamService.WithRawResponse =
            StreamServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val eventsHandler: Handler<StreamEventsResponse> =
            jsonHandler<StreamEventsResponse>(clientOptions.jsonMapper)

        override fun events(
            params: StreamEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamEventsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("stream", "events")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { eventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
