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
import com.sports_odds_api.api.models.teams.TeamGetPageResponse
import com.sports_odds_api.api.models.teams.Team
import com.sports_odds_api.api.models.teams.TeamGetPageAsync
import com.sports_odds_api.api.models.teams.TeamGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class TeamServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TeamServiceAsync {

    private val withRawResponse: TeamServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TeamServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamServiceAsync =
        TeamServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(
        params: TeamGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamGetPageAsync> =
        // get /teams/
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TeamServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TeamServiceAsync.WithRawResponse =
            TeamServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<TeamGetPageResponse> =
            jsonHandler<TeamGetPageResponse>(clientOptions.jsonMapper)

        override fun get(
            params: TeamGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamGetPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("teams", "")
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
                                TeamGetPageAsync.builder()
                                    .service(TeamServiceAsyncImpl(clientOptions))
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
