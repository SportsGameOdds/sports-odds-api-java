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
import com.sportsgameodds.api.models.DataEnvelope
import com.sportsgameodds.api.models.teams.Team
import com.sportsgameodds.api.models.teams.TeamGetPage
import com.sportsgameodds.api.models.teams.TeamGetParams
import java.util.function.Consumer

class TeamServiceImpl internal constructor(private val clientOptions: ClientOptions) : TeamService {

    private val withRawResponse: TeamService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TeamService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamService =
        TeamServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(params: TeamGetParams, requestOptions: RequestOptions): TeamGetPage =
        // get /teams/
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TeamService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TeamService.WithRawResponse =
            TeamServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<DataEnvelope<Team>> =
            jsonHandler<DataEnvelope<Team>>(clientOptions.jsonMapper)

        override fun get(
            params: TeamGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamGetPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("teams", "")
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
                        TeamGetPage.builder()
                            .service(TeamServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
