// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.client

import com.sportsgameodds.api.core.ClientOptions
import com.sportsgameodds.api.core.getPackageVersion
import com.sportsgameodds.api.services.blocking.AccountService
import com.sportsgameodds.api.services.blocking.AccountServiceImpl
import com.sportsgameodds.api.services.blocking.EventService
import com.sportsgameodds.api.services.blocking.EventServiceImpl
import com.sportsgameodds.api.services.blocking.LeagueService
import com.sportsgameodds.api.services.blocking.LeagueServiceImpl
import com.sportsgameodds.api.services.blocking.PlayerService
import com.sportsgameodds.api.services.blocking.PlayerServiceImpl
import com.sportsgameodds.api.services.blocking.SportService
import com.sportsgameodds.api.services.blocking.SportServiceImpl
import com.sportsgameodds.api.services.blocking.StatService
import com.sportsgameodds.api.services.blocking.StatServiceImpl
import com.sportsgameodds.api.services.blocking.StreamService
import com.sportsgameodds.api.services.blocking.StreamServiceImpl
import com.sportsgameodds.api.services.blocking.TeamService
import com.sportsgameodds.api.services.blocking.TeamServiceImpl
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

    /** Get info about Events (includes odds, results, teams, and other metadata) */
    override fun events(): EventService = events

    /** Get Team-related data */
    override fun teams(): TeamService = teams

    /** Get Player-related data */
    override fun players(): PlayerService = players

    /** Get League-related data */
    override fun leagues(): LeagueService = leagues

    /** Get Sport-related data */
    override fun sports(): SportService = sports

    /** Get data on specific Stats */
    override fun stats(): StatService = stats

    /** Get data related to your Account & API key */
    override fun account(): AccountService = account

    /** Get info about Events (includes odds, results, teams, and other metadata) */
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

        /** Get info about Events (includes odds, results, teams, and other metadata) */
        override fun events(): EventService.WithRawResponse = events

        /** Get Team-related data */
        override fun teams(): TeamService.WithRawResponse = teams

        /** Get Player-related data */
        override fun players(): PlayerService.WithRawResponse = players

        /** Get League-related data */
        override fun leagues(): LeagueService.WithRawResponse = leagues

        /** Get Sport-related data */
        override fun sports(): SportService.WithRawResponse = sports

        /** Get data on specific Stats */
        override fun stats(): StatService.WithRawResponse = stats

        /** Get data related to your Account & API key */
        override fun account(): AccountService.WithRawResponse = account

        /** Get info about Events (includes odds, results, teams, and other metadata) */
        override fun stream(): StreamService.WithRawResponse = stream
    }
}
