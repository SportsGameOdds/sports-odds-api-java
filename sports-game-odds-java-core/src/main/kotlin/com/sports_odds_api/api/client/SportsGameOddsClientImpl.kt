// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.client

import com.sports_odds_api.api.core.ClientOptions
import com.sports_odds_api.api.core.getPackageVersion
import com.sports_odds_api.api.services.blocking.AccountService
import com.sports_odds_api.api.services.blocking.AccountServiceImpl
import com.sports_odds_api.api.services.blocking.EventService
import com.sports_odds_api.api.services.blocking.EventServiceImpl
import com.sports_odds_api.api.services.blocking.LeagueService
import com.sports_odds_api.api.services.blocking.LeagueServiceImpl
import com.sports_odds_api.api.services.blocking.PlayerService
import com.sports_odds_api.api.services.blocking.PlayerServiceImpl
import com.sports_odds_api.api.services.blocking.SportService
import com.sports_odds_api.api.services.blocking.SportServiceImpl
import com.sports_odds_api.api.services.blocking.StatService
import com.sports_odds_api.api.services.blocking.StatServiceImpl
import com.sports_odds_api.api.services.blocking.StreamService
import com.sports_odds_api.api.services.blocking.StreamServiceImpl
import com.sports_odds_api.api.services.blocking.TeamService
import com.sports_odds_api.api.services.blocking.TeamServiceImpl
import java.util.function.Consumer

class SportsGameOddsClientImpl(private val clientOptions: ClientOptions) : SportsGameOddsClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: SportsGameOddsClientAsync by lazy {
        SportsGameOddsClientAsyncImpl(clientOptions)
    }

    private val withRawResponse: SportsGameOddsClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val events: EventService by lazy { EventServiceImpl(clientOptionsWithUserAgent) }

    private val teams: TeamService by lazy { TeamServiceImpl(clientOptionsWithUserAgent) }

    private val players: PlayerService by lazy { PlayerServiceImpl(clientOptionsWithUserAgent) }

    private val leagues: LeagueService by lazy { LeagueServiceImpl(clientOptionsWithUserAgent) }

    private val sports: SportService by lazy { SportServiceImpl(clientOptionsWithUserAgent) }

    private val stats: StatService by lazy { StatServiceImpl(clientOptionsWithUserAgent) }

    private val account: AccountService by lazy { AccountServiceImpl(clientOptionsWithUserAgent) }

    private val stream: StreamService by lazy { StreamServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): SportsGameOddsClientAsync = async

    override fun withRawResponse(): SportsGameOddsClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SportsGameOddsClient =
        SportsGameOddsClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun events(): EventService = events

    override fun teams(): TeamService = teams

    override fun players(): PlayerService = players

    override fun leagues(): LeagueService = leagues

    override fun sports(): SportService = sports

    override fun stats(): StatService = stats

    override fun account(): AccountService = account

    override fun stream(): StreamService = stream

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SportsGameOddsClient.WithRawResponse {

        private val events: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val teams: TeamService.WithRawResponse by lazy {
            TeamServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val players: PlayerService.WithRawResponse by lazy {
            PlayerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val leagues: LeagueService.WithRawResponse by lazy {
            LeagueServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sports: SportService.WithRawResponse by lazy {
            SportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val stats: StatService.WithRawResponse by lazy {
            StatServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val account: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val stream: StreamService.WithRawResponse by lazy {
            StreamServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SportsGameOddsClient.WithRawResponse =
            SportsGameOddsClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun events(): EventService.WithRawResponse = events

        override fun teams(): TeamService.WithRawResponse = teams

        override fun players(): PlayerService.WithRawResponse = players

        override fun leagues(): LeagueService.WithRawResponse = leagues

        override fun sports(): SportService.WithRawResponse = sports

        override fun stats(): StatService.WithRawResponse = stats

        override fun account(): AccountService.WithRawResponse = account

        override fun stream(): StreamService.WithRawResponse = stream
    }
}
