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
import com.sportsgameodds.api.models.players.PlayerGetPage
import com.sportsgameodds.api.models.players.PlayerGetPageResponse
import com.sportsgameodds.api.models.players.PlayerGetParams
import java.util.function.Consumer

class PlayerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PlayerService {

    private val withRawResponse: PlayerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlayerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlayerService =
        PlayerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(params: PlayerGetParams, requestOptions: RequestOptions): PlayerGetPage =
        // get /players/
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlayerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlayerService.WithRawResponse =
            PlayerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<PlayerGetPageResponse> =
            jsonHandler<PlayerGetPageResponse>(clientOptions.jsonMapper)

        override fun get(
            params: PlayerGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlayerGetPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("players", "")
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
                        PlayerGetPage.builder()
                            .service(PlayerServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
