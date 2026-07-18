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
import com.sportsgameodds.api.models.stream.StreamEventsParams
import com.sportsgameodds.api.models.stream.StreamEventsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Get info about Events (includes odds, results, teams, and other metadata) */
class StreamServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StreamServiceAsync {

    private val withRawResponse: StreamServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StreamServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamServiceAsync =
        StreamServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun events(
        params: StreamEventsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StreamEventsResponse> =
        // get /stream/events
        withRawResponse().events(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StreamServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StreamServiceAsync.WithRawResponse =
            StreamServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val eventsHandler: Handler<StreamEventsResponse> =
            jsonHandler<StreamEventsResponse>(clientOptions.jsonMapper)

        override fun events(
            params: StreamEventsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StreamEventsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("stream", "events")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
