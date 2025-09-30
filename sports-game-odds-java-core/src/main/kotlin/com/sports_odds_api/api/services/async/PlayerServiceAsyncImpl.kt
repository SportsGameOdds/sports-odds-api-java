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
import com.sports_odds_api.api.models.players.PlayerGetPageResponse
import com.sports_odds_api.api.models.players.Player
import com.sports_odds_api.api.models.players.PlayerGetPageAsync
import com.sports_odds_api.api.models.players.PlayerGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class PlayerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PlayerServiceAsync {

    private val withRawResponse: PlayerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlayerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlayerServiceAsync =
        PlayerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(
        params: PlayerGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlayerGetPageAsync> =
        // get /players/
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlayerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlayerServiceAsync.WithRawResponse =
            PlayerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<PlayerGetPageResponse> =
            jsonHandler<PlayerGetPageResponse>(clientOptions.jsonMapper)

        override fun get(
            params: PlayerGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlayerGetPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("players", "")
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
                                PlayerGetPageAsync.builder()
                                    .service(PlayerServiceAsyncImpl(clientOptions))
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
