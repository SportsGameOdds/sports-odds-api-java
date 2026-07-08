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
import com.sportsgameodds.api.models.stream.StreamEventsParams
import com.sportsgameodds.api.models.stream.StreamEventsResponse
import java.util.function.Consumer

/** Get info about Events (includes odds, results, teams, and other metadata) */
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
