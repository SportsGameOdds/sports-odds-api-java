// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.events

import com.sportsgameodds.api.core.Params
import com.sportsgameodds.api.core.http.Headers
import com.sportsgameodds.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a list of Events */
class EventGetParams
private constructor(
    private val bookmakerId: String?,
    private val cancelled: Boolean?,
    private val cursor: String?,
    private val ended: Boolean?,
    private val eventId: String?,
    private val eventIds: String?,
    private val expandResults: Boolean?,
    private val finalized: Boolean?,
    private val includeAltLines: Boolean?,
    private val includeOpenCloseOdds: Boolean?,
    private val includeOpposingOdds: Boolean?,
    private val leagueId: String?,
    private val limit: Double?,
    private val live: Boolean?,
    private val oddId: String?,
    private val oddsAvailable: Boolean?,
    private val oddsPresent: Boolean?,
    private val playerId: String?,
    private val sportId: String?,
    private val started: Boolean?,
    private val startsAfter: OffsetDateTime?,
    private val startsBefore: OffsetDateTime?,
    private val teamId: String?,
    private val type: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A bookmakerID or comma-separated list of bookmakerIDs to include odds for */
    fun bookmakerId(): Optional<String> = Optional.ofNullable(bookmakerId)

    /**
     * Only include cancelled Events (true), only non-cancelled Events (false) or all Events (omit)
     */
    fun cancelled(): Optional<Boolean> = Optional.ofNullable(cancelled)

    /**
     * The cursor for the request. Used to get the next group of Events. This is an opaque token —
     * pass the nextCursor value from the prior response unchanged.
     */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /**
     * Only include Events which have have ended (true), only Events which have not ended (false) or
     * all Events (omit)
     */
    fun ended(): Optional<Boolean> = Optional.ofNullable(ended)

    /** An eventID to get Event data for */
    fun eventId(): Optional<String> = Optional.ofNullable(eventId)

    /** A comma separated list of eventIDs to get Event data for */
    fun eventIds(): Optional<String> = Optional.ofNullable(eventIds)

    /**
     * Whether to expand the results object to include all stat values rather than just the base set
     */
    fun expandResults(): Optional<Boolean> = Optional.ofNullable(expandResults)

    /**
     * Only include finalized Events (true), exclude unfinalized Events (false) or all Events (omit)
     */
    fun finalized(): Optional<Boolean> = Optional.ofNullable(finalized)

    /** Whether to include alternate lines in the odds byBookmaker data */
    fun includeAltLines(): Optional<Boolean> = Optional.ofNullable(includeAltLines)

    /**
     * Whether to include open and close odds values (openOdds, closeOdds, openSpread, closeSpread,
     * openOverUnder, closeOverUnder) in the odds byBookmaker data
     */
    fun includeOpenCloseOdds(): Optional<Boolean> = Optional.ofNullable(includeOpenCloseOdds)

    /** Whether to include opposing odds for each included oddID */
    fun includeOpposingOdds(): Optional<Boolean> = Optional.ofNullable(includeOpposingOdds)

    /** A leagueID or comma-separated list of leagueIDs to get Events for */
    fun leagueId(): Optional<String> = Optional.ofNullable(leagueId)

    /** The maximum number of Events to return */
    fun limit(): Optional<Double> = Optional.ofNullable(limit)

    /** Only include live Events (true), only non-live Events (false) or all Events (omit) */
    fun live(): Optional<Boolean> = Optional.ofNullable(live)

    /** An oddID or comma-separated list of oddIDs to include odds for */
    fun oddId(): Optional<String> = Optional.ofNullable(oddId)

    /**
     * Whether you want only Events which do (true) or do not (false) have odds markets which are
     * currently available (open for wagering)
     */
    fun oddsAvailable(): Optional<Boolean> = Optional.ofNullable(oddsAvailable)

    /**
     * Whether you want only Events which do (true) or do not (false) have any associated odds
     * markets regardless of whether those odds markets are currently available (open for wagering)
     */
    fun oddsPresent(): Optional<Boolean> = Optional.ofNullable(oddsPresent)

    /**
     * A playerID or comma-separated list of playerIDs to include Events (and associated odds) for
     */
    fun playerId(): Optional<String> = Optional.ofNullable(playerId)

    /** A sportID or comma-separated list of sportIDs to get Events for */
    fun sportId(): Optional<String> = Optional.ofNullable(sportId)

    /**
     * Only include Events which have have previously started (true), only Events which have not
     * previously started (false) or all Events (omit)
     */
    fun started(): Optional<Boolean> = Optional.ofNullable(started)

    /** Get Events that start after this date */
    fun startsAfter(): Optional<OffsetDateTime> = Optional.ofNullable(startsAfter)

    /** Get Events that start before this date */
    fun startsBefore(): Optional<OffsetDateTime> = Optional.ofNullable(startsBefore)

    /** A teamID or comma-separated list of teamIDs to include Events for */
    fun teamId(): Optional<String> = Optional.ofNullable(teamId)

    /** Only include Events of the specified type */
    fun type(): Optional<String> = Optional.ofNullable(type)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EventGetParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EventGetParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventGetParams]. */
    class Builder internal constructor() {

        private var bookmakerId: String? = null
        private var cancelled: Boolean? = null
        private var cursor: String? = null
        private var ended: Boolean? = null
        private var eventId: String? = null
        private var eventIds: String? = null
        private var expandResults: Boolean? = null
        private var finalized: Boolean? = null
        private var includeAltLines: Boolean? = null
        private var includeOpenCloseOdds: Boolean? = null
        private var includeOpposingOdds: Boolean? = null
        private var leagueId: String? = null
        private var limit: Double? = null
        private var live: Boolean? = null
        private var oddId: String? = null
        private var oddsAvailable: Boolean? = null
        private var oddsPresent: Boolean? = null
        private var playerId: String? = null
        private var sportId: String? = null
        private var started: Boolean? = null
        private var startsAfter: OffsetDateTime? = null
        private var startsBefore: OffsetDateTime? = null
        private var teamId: String? = null
        private var type: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(eventGetParams: EventGetParams) = apply {
            bookmakerId = eventGetParams.bookmakerId
            cancelled = eventGetParams.cancelled
            cursor = eventGetParams.cursor
            ended = eventGetParams.ended
            eventId = eventGetParams.eventId
            eventIds = eventGetParams.eventIds
            expandResults = eventGetParams.expandResults
            finalized = eventGetParams.finalized
            includeAltLines = eventGetParams.includeAltLines
            includeOpenCloseOdds = eventGetParams.includeOpenCloseOdds
            includeOpposingOdds = eventGetParams.includeOpposingOdds
            leagueId = eventGetParams.leagueId
            limit = eventGetParams.limit
            live = eventGetParams.live
            oddId = eventGetParams.oddId
            oddsAvailable = eventGetParams.oddsAvailable
            oddsPresent = eventGetParams.oddsPresent
            playerId = eventGetParams.playerId
            sportId = eventGetParams.sportId
            started = eventGetParams.started
            startsAfter = eventGetParams.startsAfter
            startsBefore = eventGetParams.startsBefore
            teamId = eventGetParams.teamId
            type = eventGetParams.type
            additionalHeaders = eventGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventGetParams.additionalQueryParams.toBuilder()
        }

        /** A bookmakerID or comma-separated list of bookmakerIDs to include odds for */
        fun bookmakerId(bookmakerId: String?) = apply { this.bookmakerId = bookmakerId }

        /** Alias for calling [Builder.bookmakerId] with `bookmakerId.orElse(null)`. */
        fun bookmakerId(bookmakerId: Optional<String>) = bookmakerId(bookmakerId.getOrNull())

        /**
         * Only include cancelled Events (true), only non-cancelled Events (false) or all Events
         * (omit)
         */
        fun cancelled(cancelled: Boolean?) = apply { this.cancelled = cancelled }

        /**
         * Alias for [Builder.cancelled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun cancelled(cancelled: Boolean) = cancelled(cancelled as Boolean?)

        /** Alias for calling [Builder.cancelled] with `cancelled.orElse(null)`. */
        fun cancelled(cancelled: Optional<Boolean>) = cancelled(cancelled.getOrNull())

        /**
         * The cursor for the request. Used to get the next group of Events. This is an opaque token
         * — pass the nextCursor value from the prior response unchanged.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /**
         * Only include Events which have have ended (true), only Events which have not ended
         * (false) or all Events (omit)
         */
        fun ended(ended: Boolean?) = apply { this.ended = ended }

        /**
         * Alias for [Builder.ended].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun ended(ended: Boolean) = ended(ended as Boolean?)

        /** Alias for calling [Builder.ended] with `ended.orElse(null)`. */
        fun ended(ended: Optional<Boolean>) = ended(ended.getOrNull())

        /** An eventID to get Event data for */
        fun eventId(eventId: String?) = apply { this.eventId = eventId }

        /** Alias for calling [Builder.eventId] with `eventId.orElse(null)`. */
        fun eventId(eventId: Optional<String>) = eventId(eventId.getOrNull())

        /** A comma separated list of eventIDs to get Event data for */
        fun eventIds(eventIds: String?) = apply { this.eventIds = eventIds }

        /** Alias for calling [Builder.eventIds] with `eventIds.orElse(null)`. */
        fun eventIds(eventIds: Optional<String>) = eventIds(eventIds.getOrNull())

        /**
         * Whether to expand the results object to include all stat values rather than just the base
         * set
         */
        fun expandResults(expandResults: Boolean?) = apply { this.expandResults = expandResults }

        /**
         * Alias for [Builder.expandResults].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun expandResults(expandResults: Boolean) = expandResults(expandResults as Boolean?)

        /** Alias for calling [Builder.expandResults] with `expandResults.orElse(null)`. */
        fun expandResults(expandResults: Optional<Boolean>) =
            expandResults(expandResults.getOrNull())

        /**
         * Only include finalized Events (true), exclude unfinalized Events (false) or all Events
         * (omit)
         */
        fun finalized(finalized: Boolean?) = apply { this.finalized = finalized }

        /**
         * Alias for [Builder.finalized].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun finalized(finalized: Boolean) = finalized(finalized as Boolean?)

        /** Alias for calling [Builder.finalized] with `finalized.orElse(null)`. */
        fun finalized(finalized: Optional<Boolean>) = finalized(finalized.getOrNull())

        /** Whether to include alternate lines in the odds byBookmaker data */
        fun includeAltLines(includeAltLines: Boolean?) = apply {
            this.includeAltLines = includeAltLines
        }

        /**
         * Alias for [Builder.includeAltLines].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeAltLines(includeAltLines: Boolean) = includeAltLines(includeAltLines as Boolean?)

        /** Alias for calling [Builder.includeAltLines] with `includeAltLines.orElse(null)`. */
        fun includeAltLines(includeAltLines: Optional<Boolean>) =
            includeAltLines(includeAltLines.getOrNull())

        /**
         * Whether to include open and close odds values (openOdds, closeOdds, openSpread,
         * closeSpread, openOverUnder, closeOverUnder) in the odds byBookmaker data
         */
        fun includeOpenCloseOdds(includeOpenCloseOdds: Boolean?) = apply {
            this.includeOpenCloseOdds = includeOpenCloseOdds
        }

        /**
         * Alias for [Builder.includeOpenCloseOdds].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeOpenCloseOdds(includeOpenCloseOdds: Boolean) =
            includeOpenCloseOdds(includeOpenCloseOdds as Boolean?)

        /**
         * Alias for calling [Builder.includeOpenCloseOdds] with
         * `includeOpenCloseOdds.orElse(null)`.
         */
        fun includeOpenCloseOdds(includeOpenCloseOdds: Optional<Boolean>) =
            includeOpenCloseOdds(includeOpenCloseOdds.getOrNull())

        /** Whether to include opposing odds for each included oddID */
        fun includeOpposingOdds(includeOpposingOdds: Boolean?) = apply {
            this.includeOpposingOdds = includeOpposingOdds
        }

        /**
         * Alias for [Builder.includeOpposingOdds].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeOpposingOdds(includeOpposingOdds: Boolean) =
            includeOpposingOdds(includeOpposingOdds as Boolean?)

        /**
         * Alias for calling [Builder.includeOpposingOdds] with `includeOpposingOdds.orElse(null)`.
         */
        fun includeOpposingOdds(includeOpposingOdds: Optional<Boolean>) =
            includeOpposingOdds(includeOpposingOdds.getOrNull())

        /** A leagueID or comma-separated list of leagueIDs to get Events for */
        fun leagueId(leagueId: String?) = apply { this.leagueId = leagueId }

        /** Alias for calling [Builder.leagueId] with `leagueId.orElse(null)`. */
        fun leagueId(leagueId: Optional<String>) = leagueId(leagueId.getOrNull())

        /** The maximum number of Events to return */
        fun limit(limit: Double?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Double) = limit(limit as Double?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Double>) = limit(limit.getOrNull())

        /** Only include live Events (true), only non-live Events (false) or all Events (omit) */
        fun live(live: Boolean?) = apply { this.live = live }

        /**
         * Alias for [Builder.live].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun live(live: Boolean) = live(live as Boolean?)

        /** Alias for calling [Builder.live] with `live.orElse(null)`. */
        fun live(live: Optional<Boolean>) = live(live.getOrNull())

        /** An oddID or comma-separated list of oddIDs to include odds for */
        fun oddId(oddId: String?) = apply { this.oddId = oddId }

        /** Alias for calling [Builder.oddId] with `oddId.orElse(null)`. */
        fun oddId(oddId: Optional<String>) = oddId(oddId.getOrNull())

        /**
         * Whether you want only Events which do (true) or do not (false) have odds markets which
         * are currently available (open for wagering)
         */
        fun oddsAvailable(oddsAvailable: Boolean?) = apply { this.oddsAvailable = oddsAvailable }

        /**
         * Alias for [Builder.oddsAvailable].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun oddsAvailable(oddsAvailable: Boolean) = oddsAvailable(oddsAvailable as Boolean?)

        /** Alias for calling [Builder.oddsAvailable] with `oddsAvailable.orElse(null)`. */
        fun oddsAvailable(oddsAvailable: Optional<Boolean>) =
            oddsAvailable(oddsAvailable.getOrNull())

        /**
         * Whether you want only Events which do (true) or do not (false) have any associated odds
         * markets regardless of whether those odds markets are currently available (open for
         * wagering)
         */
        fun oddsPresent(oddsPresent: Boolean?) = apply { this.oddsPresent = oddsPresent }

        /**
         * Alias for [Builder.oddsPresent].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun oddsPresent(oddsPresent: Boolean) = oddsPresent(oddsPresent as Boolean?)

        /** Alias for calling [Builder.oddsPresent] with `oddsPresent.orElse(null)`. */
        fun oddsPresent(oddsPresent: Optional<Boolean>) = oddsPresent(oddsPresent.getOrNull())

        /**
         * A playerID or comma-separated list of playerIDs to include Events (and associated odds)
         * for
         */
        fun playerId(playerId: String?) = apply { this.playerId = playerId }

        /** Alias for calling [Builder.playerId] with `playerId.orElse(null)`. */
        fun playerId(playerId: Optional<String>) = playerId(playerId.getOrNull())

        /** A sportID or comma-separated list of sportIDs to get Events for */
        fun sportId(sportId: String?) = apply { this.sportId = sportId }

        /** Alias for calling [Builder.sportId] with `sportId.orElse(null)`. */
        fun sportId(sportId: Optional<String>) = sportId(sportId.getOrNull())

        /**
         * Only include Events which have have previously started (true), only Events which have not
         * previously started (false) or all Events (omit)
         */
        fun started(started: Boolean?) = apply { this.started = started }

        /**
         * Alias for [Builder.started].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun started(started: Boolean) = started(started as Boolean?)

        /** Alias for calling [Builder.started] with `started.orElse(null)`. */
        fun started(started: Optional<Boolean>) = started(started.getOrNull())

        /** Get Events that start after this date */
        fun startsAfter(startsAfter: OffsetDateTime?) = apply { this.startsAfter = startsAfter }

        /** Alias for calling [Builder.startsAfter] with `startsAfter.orElse(null)`. */
        fun startsAfter(startsAfter: Optional<OffsetDateTime>) =
            startsAfter(startsAfter.getOrNull())

        /** Get Events that start before this date */
        fun startsBefore(startsBefore: OffsetDateTime?) = apply { this.startsBefore = startsBefore }

        /** Alias for calling [Builder.startsBefore] with `startsBefore.orElse(null)`. */
        fun startsBefore(startsBefore: Optional<OffsetDateTime>) =
            startsBefore(startsBefore.getOrNull())

        /** A teamID or comma-separated list of teamIDs to include Events for */
        fun teamId(teamId: String?) = apply { this.teamId = teamId }

        /** Alias for calling [Builder.teamId] with `teamId.orElse(null)`. */
        fun teamId(teamId: Optional<String>) = teamId(teamId.getOrNull())

        /** Only include Events of the specified type */
        fun type(type: String?) = apply { this.type = type }

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<String>) = type(type.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [EventGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EventGetParams =
            EventGetParams(
                bookmakerId,
                cancelled,
                cursor,
                ended,
                eventId,
                eventIds,
                expandResults,
                finalized,
                includeAltLines,
                includeOpenCloseOdds,
                includeOpposingOdds,
                leagueId,
                limit,
                live,
                oddId,
                oddsAvailable,
                oddsPresent,
                playerId,
                sportId,
                started,
                startsAfter,
                startsBefore,
                teamId,
                type,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                bookmakerId?.let { put("bookmakerID", it) }
                cancelled?.let { put("cancelled", it.toString()) }
                cursor?.let { put("cursor", it) }
                ended?.let { put("ended", it.toString()) }
                eventId?.let { put("eventID", it) }
                eventIds?.let { put("eventIDs", it) }
                expandResults?.let { put("expandResults", it.toString()) }
                finalized?.let { put("finalized", it.toString()) }
                includeAltLines?.let { put("includeAltLines", it.toString()) }
                includeOpenCloseOdds?.let { put("includeOpenCloseOdds", it.toString()) }
                includeOpposingOdds?.let { put("includeOpposingOdds", it.toString()) }
                leagueId?.let { put("leagueID", it) }
                limit?.let { put("limit", it.toString()) }
                live?.let { put("live", it.toString()) }
                oddId?.let { put("oddID", it) }
                oddsAvailable?.let { put("oddsAvailable", it.toString()) }
                oddsPresent?.let { put("oddsPresent", it.toString()) }
                playerId?.let { put("playerID", it) }
                sportId?.let { put("sportID", it) }
                started?.let { put("started", it.toString()) }
                startsAfter?.let {
                    put("startsAfter", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                startsBefore?.let {
                    put("startsBefore", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                teamId?.let { put("teamID", it) }
                type?.let { put("type", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventGetParams &&
            bookmakerId == other.bookmakerId &&
            cancelled == other.cancelled &&
            cursor == other.cursor &&
            ended == other.ended &&
            eventId == other.eventId &&
            eventIds == other.eventIds &&
            expandResults == other.expandResults &&
            finalized == other.finalized &&
            includeAltLines == other.includeAltLines &&
            includeOpenCloseOdds == other.includeOpenCloseOdds &&
            includeOpposingOdds == other.includeOpposingOdds &&
            leagueId == other.leagueId &&
            limit == other.limit &&
            live == other.live &&
            oddId == other.oddId &&
            oddsAvailable == other.oddsAvailable &&
            oddsPresent == other.oddsPresent &&
            playerId == other.playerId &&
            sportId == other.sportId &&
            started == other.started &&
            startsAfter == other.startsAfter &&
            startsBefore == other.startsBefore &&
            teamId == other.teamId &&
            type == other.type &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            bookmakerId,
            cancelled,
            cursor,
            ended,
            eventId,
            eventIds,
            expandResults,
            finalized,
            includeAltLines,
            includeOpenCloseOdds,
            includeOpposingOdds,
            leagueId,
            limit,
            live,
            oddId,
            oddsAvailable,
            oddsPresent,
            playerId,
            sportId,
            started,
            startsAfter,
            startsBefore,
            teamId,
            type,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EventGetParams{bookmakerId=$bookmakerId, cancelled=$cancelled, cursor=$cursor, ended=$ended, eventId=$eventId, eventIds=$eventIds, expandResults=$expandResults, finalized=$finalized, includeAltLines=$includeAltLines, includeOpenCloseOdds=$includeOpenCloseOdds, includeOpposingOdds=$includeOpposingOdds, leagueId=$leagueId, limit=$limit, live=$live, oddId=$oddId, oddsAvailable=$oddsAvailable, oddsPresent=$oddsPresent, playerId=$playerId, sportId=$sportId, started=$started, startsAfter=$startsAfter, startsBefore=$startsBefore, teamId=$teamId, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
