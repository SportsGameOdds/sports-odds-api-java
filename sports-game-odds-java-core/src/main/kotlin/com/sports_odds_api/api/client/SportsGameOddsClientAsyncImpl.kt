// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.client

import com.sports_odds_api.api.core.ClientOptions
import com.sports_odds_api.api.core.getPackageVersion
import com.sports_odds_api.api.services.async.AccountServiceAsync
import com.sports_odds_api.api.services.async.AccountServiceAsyncImpl
import com.sports_odds_api.api.services.async.EventServiceAsync
import com.sports_odds_api.api.services.async.EventServiceAsyncImpl
import com.sports_odds_api.api.services.async.LeagueServiceAsync
import com.sports_odds_api.api.services.async.LeagueServiceAsyncImpl
import com.sports_odds_api.api.services.async.PlayerServiceAsync
import com.sports_odds_api.api.services.async.PlayerServiceAsyncImpl
import com.sports_odds_api.api.services.async.SportServiceAsync
import com.sports_odds_api.api.services.async.SportServiceAsyncImpl
import com.sports_odds_api.api.services.async.StatServiceAsync
import com.sports_odds_api.api.services.async.StatServiceAsyncImpl
import com.sports_odds_api.api.services.async.StreamServiceAsync
import com.sports_odds_api.api.services.async.StreamServiceAsyncImpl
import com.sports_odds_api.api.services.async.TeamServiceAsync
import com.sports_odds_api.api.services.async.TeamServiceAsyncImpl
import java.util.function.Consumer

class SportsGameOddsClientAsyncImpl(private val clientOptions: ClientOptions) :
    SportsGameOddsClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: SportsGameOddsClient by lazy { SportsGameOddsClientImpl(clientOptions) }

    private val withRawResponse: SportsGameOddsClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val events: EventServiceAsync by lazy {
        EventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val teams: TeamServiceAsync by lazy { TeamServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val players: PlayerServiceAsync by lazy {
        PlayerServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val leagues: LeagueServiceAsync by lazy {
        LeagueServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sports: SportServiceAsync by lazy {
        SportServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val stats: StatServiceAsync by lazy { StatServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val account: AccountServiceAsync by lazy {
        AccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val stream: StreamServiceAsync by lazy {
        StreamServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): SportsGameOddsClient = sync

    override fun withRawResponse(): SportsGameOddsClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SportsGameOddsClientAsync =
        SportsGameOddsClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun events(): EventServiceAsync = events

    override fun teams(): TeamServiceAsync = teams

    override fun players(): PlayerServiceAsync = players

    override fun leagues(): LeagueServiceAsync = leagues

    override fun sports(): SportServiceAsync = sports

    override fun stats(): StatServiceAsync = stats

    override fun account(): AccountServiceAsync = account

    override fun stream(): StreamServiceAsync = stream

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SportsGameOddsClientAsync.WithRawResponse {

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val teams: TeamServiceAsync.WithRawResponse by lazy {
            TeamServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val players: PlayerServiceAsync.WithRawResponse by lazy {
            PlayerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val leagues: LeagueServiceAsync.WithRawResponse by lazy {
            LeagueServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sports: SportServiceAsync.WithRawResponse by lazy {
            SportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val stats: StatServiceAsync.WithRawResponse by lazy {
            StatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val account: AccountServiceAsync.WithRawResponse by lazy {
            AccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val stream: StreamServiceAsync.WithRawResponse by lazy {
            StreamServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SportsGameOddsClientAsync.WithRawResponse =
            SportsGameOddsClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun events(): EventServiceAsync.WithRawResponse = events

        override fun teams(): TeamServiceAsync.WithRawResponse = teams

        override fun players(): PlayerServiceAsync.WithRawResponse = players

        override fun leagues(): LeagueServiceAsync.WithRawResponse = leagues

        override fun sports(): SportServiceAsync.WithRawResponse = sports

        override fun stats(): StatServiceAsync.WithRawResponse = stats

        override fun account(): AccountServiceAsync.WithRawResponse = account

        override fun stream(): StreamServiceAsync.WithRawResponse = stream
    }
}
