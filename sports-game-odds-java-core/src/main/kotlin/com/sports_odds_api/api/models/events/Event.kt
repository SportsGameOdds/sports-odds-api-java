// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.models.events

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.sports_odds_api.api.core.ExcludeMissing
import com.sports_odds_api.api.core.JsonField
import com.sports_odds_api.api.core.JsonMissing
import com.sports_odds_api.api.core.JsonValue
import com.sports_odds_api.api.core.checkKnown
import com.sports_odds_api.api.core.toImmutable
import com.sports_odds_api.api.errors.SportsGameOddsInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Event
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val activity: JsonField<Activity>,
    private val eventId: JsonField<String>,
    private val info: JsonField<Info>,
    private val leagueId: JsonField<String>,
    private val manual: JsonField<Boolean>,
    private val odds: JsonField<Odds>,
    private val players: JsonField<Players>,
    private val results: JsonField<Results>,
    private val sportId: JsonField<String>,
    private val status: JsonField<Status>,
    private val teams: JsonField<Teams>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("activity") @ExcludeMissing activity: JsonField<Activity> = JsonMissing.of(),
        @JsonProperty("eventID") @ExcludeMissing eventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("info") @ExcludeMissing info: JsonField<Info> = JsonMissing.of(),
        @JsonProperty("leagueID") @ExcludeMissing leagueId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("manual") @ExcludeMissing manual: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("odds") @ExcludeMissing odds: JsonField<Odds> = JsonMissing.of(),
        @JsonProperty("players") @ExcludeMissing players: JsonField<Players> = JsonMissing.of(),
        @JsonProperty("results") @ExcludeMissing results: JsonField<Results> = JsonMissing.of(),
        @JsonProperty("sportID") @ExcludeMissing sportId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("teams") @ExcludeMissing teams: JsonField<Teams> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(
        activity,
        eventId,
        info,
        leagueId,
        manual,
        odds,
        players,
        results,
        sportId,
        status,
        teams,
        type,
        mutableMapOf(),
    )

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun activity(): Optional<Activity> = activity.getOptional("activity")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun eventId(): Optional<String> = eventId.getOptional("eventID")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun info(): Optional<Info> = info.getOptional("info")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun leagueId(): Optional<String> = leagueId.getOptional("leagueID")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun manual(): Optional<Boolean> = manual.getOptional("manual")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun odds(): Optional<Odds> = odds.getOptional("odds")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun players(): Optional<Players> = players.getOptional("players")

    /**
     * Nested results in the format `<periodID>.<statEntityID>.<statID> → number`.
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun results(): Optional<Results> = results.getOptional("results")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sportId(): Optional<String> = sportId.getOptional("sportID")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun teams(): Optional<Teams> = teams.getOptional("teams")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [activity].
     *
     * Unlike [activity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activity") @ExcludeMissing fun _activity(): JsonField<Activity> = activity

    /**
     * Returns the raw JSON value of [eventId].
     *
     * Unlike [eventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventID") @ExcludeMissing fun _eventId(): JsonField<String> = eventId

    /**
     * Returns the raw JSON value of [info].
     *
     * Unlike [info], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("info") @ExcludeMissing fun _info(): JsonField<Info> = info

    /**
     * Returns the raw JSON value of [leagueId].
     *
     * Unlike [leagueId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("leagueID") @ExcludeMissing fun _leagueId(): JsonField<String> = leagueId

    /**
     * Returns the raw JSON value of [manual].
     *
     * Unlike [manual], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("manual") @ExcludeMissing fun _manual(): JsonField<Boolean> = manual

    /**
     * Returns the raw JSON value of [odds].
     *
     * Unlike [odds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("odds") @ExcludeMissing fun _odds(): JsonField<Odds> = odds

    /**
     * Returns the raw JSON value of [players].
     *
     * Unlike [players], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("players") @ExcludeMissing fun _players(): JsonField<Players> = players

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<Results> = results

    /**
     * Returns the raw JSON value of [sportId].
     *
     * Unlike [sportId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sportID") @ExcludeMissing fun _sportId(): JsonField<String> = sportId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [teams].
     *
     * Unlike [teams], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("teams") @ExcludeMissing fun _teams(): JsonField<Teams> = teams

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [Event]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Event]. */
    class Builder internal constructor() {

        private var activity: JsonField<Activity> = JsonMissing.of()
        private var eventId: JsonField<String> = JsonMissing.of()
        private var info: JsonField<Info> = JsonMissing.of()
        private var leagueId: JsonField<String> = JsonMissing.of()
        private var manual: JsonField<Boolean> = JsonMissing.of()
        private var odds: JsonField<Odds> = JsonMissing.of()
        private var players: JsonField<Players> = JsonMissing.of()
        private var results: JsonField<Results> = JsonMissing.of()
        private var sportId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var teams: JsonField<Teams> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(event: Event) = apply {
            activity = event.activity
            eventId = event.eventId
            info = event.info
            leagueId = event.leagueId
            manual = event.manual
            odds = event.odds
            players = event.players
            results = event.results
            sportId = event.sportId
            status = event.status
            teams = event.teams
            type = event.type
            additionalProperties = event.additionalProperties.toMutableMap()
        }

        fun activity(activity: Activity) = activity(JsonField.of(activity))

        /**
         * Sets [Builder.activity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activity] with a well-typed [Activity] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun activity(activity: JsonField<Activity>) = apply { this.activity = activity }

        fun eventId(eventId: String) = eventId(JsonField.of(eventId))

        /**
         * Sets [Builder.eventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eventId(eventId: JsonField<String>) = apply { this.eventId = eventId }

        fun info(info: Info) = info(JsonField.of(info))

        /**
         * Sets [Builder.info] to an arbitrary JSON value.
         *
         * You should usually call [Builder.info] with a well-typed [Info] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun info(info: JsonField<Info>) = apply { this.info = info }

        fun leagueId(leagueId: String) = leagueId(JsonField.of(leagueId))

        /**
         * Sets [Builder.leagueId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.leagueId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun leagueId(leagueId: JsonField<String>) = apply { this.leagueId = leagueId }

        fun manual(manual: Boolean) = manual(JsonField.of(manual))

        /**
         * Sets [Builder.manual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manual] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun manual(manual: JsonField<Boolean>) = apply { this.manual = manual }

        fun odds(odds: Odds) = odds(JsonField.of(odds))

        /**
         * Sets [Builder.odds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.odds] with a well-typed [Odds] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun odds(odds: JsonField<Odds>) = apply { this.odds = odds }

        fun players(players: Players) = players(JsonField.of(players))

        /**
         * Sets [Builder.players] to an arbitrary JSON value.
         *
         * You should usually call [Builder.players] with a well-typed [Players] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun players(players: JsonField<Players>) = apply { this.players = players }

        /** Nested results in the format `<periodID>.<statEntityID>.<statID> → number`. */
        fun results(results: Results) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed [Results] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun results(results: JsonField<Results>) = apply { this.results = results }

        fun sportId(sportId: String) = sportId(JsonField.of(sportId))

        /**
         * Sets [Builder.sportId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sportId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sportId(sportId: JsonField<String>) = apply { this.sportId = sportId }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun teams(teams: Teams) = teams(JsonField.of(teams))

        /**
         * Sets [Builder.teams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teams] with a well-typed [Teams] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun teams(teams: JsonField<Teams>) = apply { this.teams = teams }

        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [Event].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Event =
            Event(
                activity,
                eventId,
                info,
                leagueId,
                manual,
                odds,
                players,
                results,
                sportId,
                status,
                teams,
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Event = apply {
        if (validated) {
            return@apply
        }

        activity().ifPresent { it.validate() }
        eventId()
        info().ifPresent { it.validate() }
        leagueId()
        manual()
        odds().ifPresent { it.validate() }
        players().ifPresent { it.validate() }
        results().ifPresent { it.validate() }
        sportId()
        status().ifPresent { it.validate() }
        teams().ifPresent { it.validate() }
        type()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: SportsGameOddsInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (activity.asKnown().getOrNull()?.validity() ?: 0) +
            (if (eventId.asKnown().isPresent) 1 else 0) +
            (info.asKnown().getOrNull()?.validity() ?: 0) +
            (if (leagueId.asKnown().isPresent) 1 else 0) +
            (if (manual.asKnown().isPresent) 1 else 0) +
            (odds.asKnown().getOrNull()?.validity() ?: 0) +
            (players.asKnown().getOrNull()?.validity() ?: 0) +
            (results.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sportId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (teams.asKnown().getOrNull()?.validity() ?: 0) +
            (if (type.asKnown().isPresent) 1 else 0)

    class Activity
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val count: JsonField<Double>,
        private val score: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Double> = JsonMissing.of(),
        ) : this(count, score, mutableMapOf())

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun count(): Optional<Double> = count.getOptional("count")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun score(): Optional<Double> = score.getOptional("score")

        /**
         * Returns the raw JSON value of [count].
         *
         * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

        /**
         * Returns the raw JSON value of [score].
         *
         * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Activity]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Activity]. */
        class Builder internal constructor() {

            private var count: JsonField<Double> = JsonMissing.of()
            private var score: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(activity: Activity) = apply {
                count = activity.count
                score = activity.score
                additionalProperties = activity.additionalProperties.toMutableMap()
            }

            fun count(count: Double) = count(JsonField.of(count))

            /**
             * Sets [Builder.count] to an arbitrary JSON value.
             *
             * You should usually call [Builder.count] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun count(count: JsonField<Double>) = apply { this.count = count }

            fun score(score: Double) = score(JsonField.of(score))

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun score(score: JsonField<Double>) = apply { this.score = score }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Activity].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Activity = Activity(count, score, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Activity = apply {
            if (validated) {
                return@apply
            }

            count()
            score()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: SportsGameOddsInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (count.asKnown().isPresent) 1 else 0) + (if (score.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Activity &&
                count == other.count &&
                score == other.score &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(count, score, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Activity{count=$count, score=$score, additionalProperties=$additionalProperties}"
    }

    class Info
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val seasonWeek: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("seasonWeek")
            @ExcludeMissing
            seasonWeek: JsonField<String> = JsonMissing.of()
        ) : this(seasonWeek, mutableMapOf())

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun seasonWeek(): Optional<String> = seasonWeek.getOptional("seasonWeek")

        /**
         * Returns the raw JSON value of [seasonWeek].
         *
         * Unlike [seasonWeek], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("seasonWeek")
        @ExcludeMissing
        fun _seasonWeek(): JsonField<String> = seasonWeek

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Info]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Info]. */
        class Builder internal constructor() {

            private var seasonWeek: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(info: Info) = apply {
                seasonWeek = info.seasonWeek
                additionalProperties = info.additionalProperties.toMutableMap()
            }

            fun seasonWeek(seasonWeek: String) = seasonWeek(JsonField.of(seasonWeek))

            /**
             * Sets [Builder.seasonWeek] to an arbitrary JSON value.
             *
             * You should usually call [Builder.seasonWeek] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun seasonWeek(seasonWeek: JsonField<String>) = apply { this.seasonWeek = seasonWeek }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Info].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Info = Info(seasonWeek, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Info = apply {
            if (validated) {
                return@apply
            }

            seasonWeek()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: SportsGameOddsInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = (if (seasonWeek.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Info &&
                seasonWeek == other.seasonWeek &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(seasonWeek, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Info{seasonWeek=$seasonWeek, additionalProperties=$additionalProperties}"
    }

    class Odds
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Odds]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Odds]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(odds: Odds) = apply {
                additionalProperties = odds.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Odds].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Odds = Odds(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Odds = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: SportsGameOddsInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Odds && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Odds{additionalProperties=$additionalProperties}"
    }

    class Players
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Players]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Players]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(players: Players) = apply {
                additionalProperties = players.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Players].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Players = Players(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Players = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: SportsGameOddsInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Players && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Players{additionalProperties=$additionalProperties}"
    }

    /** Nested results in the format `<periodID>.<statEntityID>.<statID> → number`. */
    class Results
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Results]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Results]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(results: Results) = apply {
                additionalProperties = results.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Results].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Results = Results(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Results = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: SportsGameOddsInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Results && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Results{additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cancelled: JsonField<Boolean>,
        private val completed: JsonField<Boolean>,
        private val currentPeriodId: JsonField<String>,
        private val delayed: JsonField<Boolean>,
        private val displayLong: JsonField<String>,
        private val displayShort: JsonField<String>,
        private val ended: JsonField<Boolean>,
        private val finalized: JsonField<Boolean>,
        private val hardStart: JsonField<Boolean>,
        private val live: JsonField<Boolean>,
        private val oddsAvailable: JsonField<Boolean>,
        private val oddsPresent: JsonField<Boolean>,
        private val periods: JsonField<Periods>,
        private val previousPeriodId: JsonField<String>,
        private val reGrade: JsonField<Boolean>,
        private val started: JsonField<Boolean>,
        private val startsAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cancelled")
            @ExcludeMissing
            cancelled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("completed")
            @ExcludeMissing
            completed: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("currentPeriodID")
            @ExcludeMissing
            currentPeriodId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("delayed") @ExcludeMissing delayed: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("displayLong")
            @ExcludeMissing
            displayLong: JsonField<String> = JsonMissing.of(),
            @JsonProperty("displayShort")
            @ExcludeMissing
            displayShort: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ended") @ExcludeMissing ended: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("finalized")
            @ExcludeMissing
            finalized: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("hardStart")
            @ExcludeMissing
            hardStart: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("live") @ExcludeMissing live: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("oddsAvailable")
            @ExcludeMissing
            oddsAvailable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("oddsPresent")
            @ExcludeMissing
            oddsPresent: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("periods") @ExcludeMissing periods: JsonField<Periods> = JsonMissing.of(),
            @JsonProperty("previousPeriodID")
            @ExcludeMissing
            previousPeriodId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reGrade") @ExcludeMissing reGrade: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("started") @ExcludeMissing started: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("startsAt")
            @ExcludeMissing
            startsAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            cancelled,
            completed,
            currentPeriodId,
            delayed,
            displayLong,
            displayShort,
            ended,
            finalized,
            hardStart,
            live,
            oddsAvailable,
            oddsPresent,
            periods,
            previousPeriodId,
            reGrade,
            started,
            startsAt,
            mutableMapOf(),
        )

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun cancelled(): Optional<Boolean> = cancelled.getOptional("cancelled")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun completed(): Optional<Boolean> = completed.getOptional("completed")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currentPeriodId(): Optional<String> = currentPeriodId.getOptional("currentPeriodID")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun delayed(): Optional<Boolean> = delayed.getOptional("delayed")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun displayLong(): Optional<String> = displayLong.getOptional("displayLong")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun displayShort(): Optional<String> = displayShort.getOptional("displayShort")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ended(): Optional<Boolean> = ended.getOptional("ended")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun finalized(): Optional<Boolean> = finalized.getOptional("finalized")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun hardStart(): Optional<Boolean> = hardStart.getOptional("hardStart")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun live(): Optional<Boolean> = live.getOptional("live")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun oddsAvailable(): Optional<Boolean> = oddsAvailable.getOptional("oddsAvailable")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun oddsPresent(): Optional<Boolean> = oddsPresent.getOptional("oddsPresent")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun periods(): Optional<Periods> = periods.getOptional("periods")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun previousPeriodId(): Optional<String> = previousPeriodId.getOptional("previousPeriodID")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun reGrade(): Optional<Boolean> = reGrade.getOptional("reGrade")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun started(): Optional<Boolean> = started.getOptional("started")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun startsAt(): Optional<OffsetDateTime> = startsAt.getOptional("startsAt")

        /**
         * Returns the raw JSON value of [cancelled].
         *
         * Unlike [cancelled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cancelled") @ExcludeMissing fun _cancelled(): JsonField<Boolean> = cancelled

        /**
         * Returns the raw JSON value of [completed].
         *
         * Unlike [completed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("completed") @ExcludeMissing fun _completed(): JsonField<Boolean> = completed

        /**
         * Returns the raw JSON value of [currentPeriodId].
         *
         * Unlike [currentPeriodId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("currentPeriodID")
        @ExcludeMissing
        fun _currentPeriodId(): JsonField<String> = currentPeriodId

        /**
         * Returns the raw JSON value of [delayed].
         *
         * Unlike [delayed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("delayed") @ExcludeMissing fun _delayed(): JsonField<Boolean> = delayed

        /**
         * Returns the raw JSON value of [displayLong].
         *
         * Unlike [displayLong], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("displayLong")
        @ExcludeMissing
        fun _displayLong(): JsonField<String> = displayLong

        /**
         * Returns the raw JSON value of [displayShort].
         *
         * Unlike [displayShort], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("displayShort")
        @ExcludeMissing
        fun _displayShort(): JsonField<String> = displayShort

        /**
         * Returns the raw JSON value of [ended].
         *
         * Unlike [ended], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ended") @ExcludeMissing fun _ended(): JsonField<Boolean> = ended

        /**
         * Returns the raw JSON value of [finalized].
         *
         * Unlike [finalized], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("finalized") @ExcludeMissing fun _finalized(): JsonField<Boolean> = finalized

        /**
         * Returns the raw JSON value of [hardStart].
         *
         * Unlike [hardStart], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hardStart") @ExcludeMissing fun _hardStart(): JsonField<Boolean> = hardStart

        /**
         * Returns the raw JSON value of [live].
         *
         * Unlike [live], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("live") @ExcludeMissing fun _live(): JsonField<Boolean> = live

        /**
         * Returns the raw JSON value of [oddsAvailable].
         *
         * Unlike [oddsAvailable], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("oddsAvailable")
        @ExcludeMissing
        fun _oddsAvailable(): JsonField<Boolean> = oddsAvailable

        /**
         * Returns the raw JSON value of [oddsPresent].
         *
         * Unlike [oddsPresent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("oddsPresent")
        @ExcludeMissing
        fun _oddsPresent(): JsonField<Boolean> = oddsPresent

        /**
         * Returns the raw JSON value of [periods].
         *
         * Unlike [periods], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("periods") @ExcludeMissing fun _periods(): JsonField<Periods> = periods

        /**
         * Returns the raw JSON value of [previousPeriodId].
         *
         * Unlike [previousPeriodId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("previousPeriodID")
        @ExcludeMissing
        fun _previousPeriodId(): JsonField<String> = previousPeriodId

        /**
         * Returns the raw JSON value of [reGrade].
         *
         * Unlike [reGrade], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reGrade") @ExcludeMissing fun _reGrade(): JsonField<Boolean> = reGrade

        /**
         * Returns the raw JSON value of [started].
         *
         * Unlike [started], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("started") @ExcludeMissing fun _started(): JsonField<Boolean> = started

        /**
         * Returns the raw JSON value of [startsAt].
         *
         * Unlike [startsAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("startsAt")
        @ExcludeMissing
        fun _startsAt(): JsonField<OffsetDateTime> = startsAt

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Status]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Status]. */
        class Builder internal constructor() {

            private var cancelled: JsonField<Boolean> = JsonMissing.of()
            private var completed: JsonField<Boolean> = JsonMissing.of()
            private var currentPeriodId: JsonField<String> = JsonMissing.of()
            private var delayed: JsonField<Boolean> = JsonMissing.of()
            private var displayLong: JsonField<String> = JsonMissing.of()
            private var displayShort: JsonField<String> = JsonMissing.of()
            private var ended: JsonField<Boolean> = JsonMissing.of()
            private var finalized: JsonField<Boolean> = JsonMissing.of()
            private var hardStart: JsonField<Boolean> = JsonMissing.of()
            private var live: JsonField<Boolean> = JsonMissing.of()
            private var oddsAvailable: JsonField<Boolean> = JsonMissing.of()
            private var oddsPresent: JsonField<Boolean> = JsonMissing.of()
            private var periods: JsonField<Periods> = JsonMissing.of()
            private var previousPeriodId: JsonField<String> = JsonMissing.of()
            private var reGrade: JsonField<Boolean> = JsonMissing.of()
            private var started: JsonField<Boolean> = JsonMissing.of()
            private var startsAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(status: Status) = apply {
                cancelled = status.cancelled
                completed = status.completed
                currentPeriodId = status.currentPeriodId
                delayed = status.delayed
                displayLong = status.displayLong
                displayShort = status.displayShort
                ended = status.ended
                finalized = status.finalized
                hardStart = status.hardStart
                live = status.live
                oddsAvailable = status.oddsAvailable
                oddsPresent = status.oddsPresent
                periods = status.periods
                previousPeriodId = status.previousPeriodId
                reGrade = status.reGrade
                started = status.started
                startsAt = status.startsAt
                additionalProperties = status.additionalProperties.toMutableMap()
            }

            fun cancelled(cancelled: Boolean) = cancelled(JsonField.of(cancelled))

            /**
             * Sets [Builder.cancelled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancelled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cancelled(cancelled: JsonField<Boolean>) = apply { this.cancelled = cancelled }

            fun completed(completed: Boolean) = completed(JsonField.of(completed))

            /**
             * Sets [Builder.completed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completed] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun completed(completed: JsonField<Boolean>) = apply { this.completed = completed }

            fun currentPeriodId(currentPeriodId: String) =
                currentPeriodId(JsonField.of(currentPeriodId))

            /**
             * Sets [Builder.currentPeriodId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentPeriodId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currentPeriodId(currentPeriodId: JsonField<String>) = apply {
                this.currentPeriodId = currentPeriodId
            }

            fun delayed(delayed: Boolean) = delayed(JsonField.of(delayed))

            /**
             * Sets [Builder.delayed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.delayed] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun delayed(delayed: JsonField<Boolean>) = apply { this.delayed = delayed }

            fun displayLong(displayLong: String) = displayLong(JsonField.of(displayLong))

            /**
             * Sets [Builder.displayLong] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayLong] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayLong(displayLong: JsonField<String>) = apply {
                this.displayLong = displayLong
            }

            fun displayShort(displayShort: String) = displayShort(JsonField.of(displayShort))

            /**
             * Sets [Builder.displayShort] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayShort] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayShort(displayShort: JsonField<String>) = apply {
                this.displayShort = displayShort
            }

            fun ended(ended: Boolean) = ended(JsonField.of(ended))

            /**
             * Sets [Builder.ended] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ended] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ended(ended: JsonField<Boolean>) = apply { this.ended = ended }

            fun finalized(finalized: Boolean) = finalized(JsonField.of(finalized))

            /**
             * Sets [Builder.finalized] to an arbitrary JSON value.
             *
             * You should usually call [Builder.finalized] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun finalized(finalized: JsonField<Boolean>) = apply { this.finalized = finalized }

            fun hardStart(hardStart: Boolean) = hardStart(JsonField.of(hardStart))

            /**
             * Sets [Builder.hardStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hardStart] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hardStart(hardStart: JsonField<Boolean>) = apply { this.hardStart = hardStart }

            fun live(live: Boolean) = live(JsonField.of(live))

            /**
             * Sets [Builder.live] to an arbitrary JSON value.
             *
             * You should usually call [Builder.live] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun live(live: JsonField<Boolean>) = apply { this.live = live }

            fun oddsAvailable(oddsAvailable: Boolean) = oddsAvailable(JsonField.of(oddsAvailable))

            /**
             * Sets [Builder.oddsAvailable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.oddsAvailable] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun oddsAvailable(oddsAvailable: JsonField<Boolean>) = apply {
                this.oddsAvailable = oddsAvailable
            }

            fun oddsPresent(oddsPresent: Boolean) = oddsPresent(JsonField.of(oddsPresent))

            /**
             * Sets [Builder.oddsPresent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.oddsPresent] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun oddsPresent(oddsPresent: JsonField<Boolean>) = apply {
                this.oddsPresent = oddsPresent
            }

            fun periods(periods: Periods) = periods(JsonField.of(periods))

            /**
             * Sets [Builder.periods] to an arbitrary JSON value.
             *
             * You should usually call [Builder.periods] with a well-typed [Periods] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun periods(periods: JsonField<Periods>) = apply { this.periods = periods }

            fun previousPeriodId(previousPeriodId: String) =
                previousPeriodId(JsonField.of(previousPeriodId))

            /**
             * Sets [Builder.previousPeriodId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previousPeriodId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun previousPeriodId(previousPeriodId: JsonField<String>) = apply {
                this.previousPeriodId = previousPeriodId
            }

            fun reGrade(reGrade: Boolean) = reGrade(JsonField.of(reGrade))

            /**
             * Sets [Builder.reGrade] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reGrade] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reGrade(reGrade: JsonField<Boolean>) = apply { this.reGrade = reGrade }

            fun started(started: Boolean) = started(JsonField.of(started))

            /**
             * Sets [Builder.started] to an arbitrary JSON value.
             *
             * You should usually call [Builder.started] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun started(started: JsonField<Boolean>) = apply { this.started = started }

            fun startsAt(startsAt: OffsetDateTime) = startsAt(JsonField.of(startsAt))

            /**
             * Sets [Builder.startsAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startsAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startsAt(startsAt: JsonField<OffsetDateTime>) = apply { this.startsAt = startsAt }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Status].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Status =
                Status(
                    cancelled,
                    completed,
                    currentPeriodId,
                    delayed,
                    displayLong,
                    displayShort,
                    ended,
                    finalized,
                    hardStart,
                    live,
                    oddsAvailable,
                    oddsPresent,
                    periods,
                    previousPeriodId,
                    reGrade,
                    started,
                    startsAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            cancelled()
            completed()
            currentPeriodId()
            delayed()
            displayLong()
            displayShort()
            ended()
            finalized()
            hardStart()
            live()
            oddsAvailable()
            oddsPresent()
            periods().ifPresent { it.validate() }
            previousPeriodId()
            reGrade()
            started()
            startsAt()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: SportsGameOddsInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (cancelled.asKnown().isPresent) 1 else 0) +
                (if (completed.asKnown().isPresent) 1 else 0) +
                (if (currentPeriodId.asKnown().isPresent) 1 else 0) +
                (if (delayed.asKnown().isPresent) 1 else 0) +
                (if (displayLong.asKnown().isPresent) 1 else 0) +
                (if (displayShort.asKnown().isPresent) 1 else 0) +
                (if (ended.asKnown().isPresent) 1 else 0) +
                (if (finalized.asKnown().isPresent) 1 else 0) +
                (if (hardStart.asKnown().isPresent) 1 else 0) +
                (if (live.asKnown().isPresent) 1 else 0) +
                (if (oddsAvailable.asKnown().isPresent) 1 else 0) +
                (if (oddsPresent.asKnown().isPresent) 1 else 0) +
                (periods.asKnown().getOrNull()?.validity() ?: 0) +
                (if (previousPeriodId.asKnown().isPresent) 1 else 0) +
                (if (reGrade.asKnown().isPresent) 1 else 0) +
                (if (started.asKnown().isPresent) 1 else 0) +
                (if (startsAt.asKnown().isPresent) 1 else 0)

        class Periods
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val ended: JsonField<List<String>>,
            private val started: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("ended")
                @ExcludeMissing
                ended: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("started")
                @ExcludeMissing
                started: JsonField<List<String>> = JsonMissing.of(),
            ) : this(ended, started, mutableMapOf())

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ended(): Optional<List<String>> = ended.getOptional("ended")

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun started(): Optional<List<String>> = started.getOptional("started")

            /**
             * Returns the raw JSON value of [ended].
             *
             * Unlike [ended], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ended") @ExcludeMissing fun _ended(): JsonField<List<String>> = ended

            /**
             * Returns the raw JSON value of [started].
             *
             * Unlike [started], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("started")
            @ExcludeMissing
            fun _started(): JsonField<List<String>> = started

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Periods]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Periods]. */
            class Builder internal constructor() {

                private var ended: JsonField<MutableList<String>>? = null
                private var started: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(periods: Periods) = apply {
                    ended = periods.ended.map { it.toMutableList() }
                    started = periods.started.map { it.toMutableList() }
                    additionalProperties = periods.additionalProperties.toMutableMap()
                }

                fun ended(ended: List<String>) = ended(JsonField.of(ended))

                /**
                 * Sets [Builder.ended] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ended] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ended(ended: JsonField<List<String>>) = apply {
                    this.ended = ended.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.ended].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addEnded(ended: String) = apply {
                    this.ended =
                        (this.ended ?: JsonField.of(mutableListOf())).also {
                            checkKnown("ended", it).add(ended)
                        }
                }

                fun started(started: List<String>) = started(JsonField.of(started))

                /**
                 * Sets [Builder.started] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.started] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun started(started: JsonField<List<String>>) = apply {
                    this.started = started.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.started].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addStarted(started: String) = apply {
                    this.started =
                        (this.started ?: JsonField.of(mutableListOf())).also {
                            checkKnown("started", it).add(started)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Periods].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Periods =
                    Periods(
                        (ended ?: JsonMissing.of()).map { it.toImmutable() },
                        (started ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Periods = apply {
                if (validated) {
                    return@apply
                }

                ended()
                started()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: SportsGameOddsInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (ended.asKnown().getOrNull()?.size ?: 0) +
                    (started.asKnown().getOrNull()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Periods &&
                    ended == other.ended &&
                    started == other.started &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(ended, started, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Periods{ended=$ended, started=$started, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status &&
                cancelled == other.cancelled &&
                completed == other.completed &&
                currentPeriodId == other.currentPeriodId &&
                delayed == other.delayed &&
                displayLong == other.displayLong &&
                displayShort == other.displayShort &&
                ended == other.ended &&
                finalized == other.finalized &&
                hardStart == other.hardStart &&
                live == other.live &&
                oddsAvailable == other.oddsAvailable &&
                oddsPresent == other.oddsPresent &&
                periods == other.periods &&
                previousPeriodId == other.previousPeriodId &&
                reGrade == other.reGrade &&
                started == other.started &&
                startsAt == other.startsAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cancelled,
                completed,
                currentPeriodId,
                delayed,
                displayLong,
                displayShort,
                ended,
                finalized,
                hardStart,
                live,
                oddsAvailable,
                oddsPresent,
                periods,
                previousPeriodId,
                reGrade,
                started,
                startsAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Status{cancelled=$cancelled, completed=$completed, currentPeriodId=$currentPeriodId, delayed=$delayed, displayLong=$displayLong, displayShort=$displayShort, ended=$ended, finalized=$finalized, hardStart=$hardStart, live=$live, oddsAvailable=$oddsAvailable, oddsPresent=$oddsPresent, periods=$periods, previousPeriodId=$previousPeriodId, reGrade=$reGrade, started=$started, startsAt=$startsAt, additionalProperties=$additionalProperties}"
    }

    class Teams
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val away: JsonField<Away>,
        private val home: JsonField<Home>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("away") @ExcludeMissing away: JsonField<Away> = JsonMissing.of(),
            @JsonProperty("home") @ExcludeMissing home: JsonField<Home> = JsonMissing.of(),
        ) : this(away, home, mutableMapOf())

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun away(): Optional<Away> = away.getOptional("away")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun home(): Optional<Home> = home.getOptional("home")

        /**
         * Returns the raw JSON value of [away].
         *
         * Unlike [away], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("away") @ExcludeMissing fun _away(): JsonField<Away> = away

        /**
         * Returns the raw JSON value of [home].
         *
         * Unlike [home], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("home") @ExcludeMissing fun _home(): JsonField<Home> = home

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Teams]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Teams]. */
        class Builder internal constructor() {

            private var away: JsonField<Away> = JsonMissing.of()
            private var home: JsonField<Home> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(teams: Teams) = apply {
                away = teams.away
                home = teams.home
                additionalProperties = teams.additionalProperties.toMutableMap()
            }

            fun away(away: Away) = away(JsonField.of(away))

            /**
             * Sets [Builder.away] to an arbitrary JSON value.
             *
             * You should usually call [Builder.away] with a well-typed [Away] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun away(away: JsonField<Away>) = apply { this.away = away }

            fun home(home: Home) = home(JsonField.of(home))

            /**
             * Sets [Builder.home] to an arbitrary JSON value.
             *
             * You should usually call [Builder.home] with a well-typed [Home] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun home(home: JsonField<Home>) = apply { this.home = home }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Teams].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Teams = Teams(away, home, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Teams = apply {
            if (validated) {
                return@apply
            }

            away().ifPresent { it.validate() }
            home().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: SportsGameOddsInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (away.asKnown().getOrNull()?.validity() ?: 0) +
                (home.asKnown().getOrNull()?.validity() ?: 0)

        class Away
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val colors: JsonField<Colors>,
            private val logo: JsonField<String>,
            private val names: JsonField<Names>,
            private val score: JsonField<Double>,
            private val statEntityId: JsonField<String>,
            private val teamId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("colors")
                @ExcludeMissing
                colors: JsonField<Colors> = JsonMissing.of(),
                @JsonProperty("logo") @ExcludeMissing logo: JsonField<String> = JsonMissing.of(),
                @JsonProperty("names") @ExcludeMissing names: JsonField<Names> = JsonMissing.of(),
                @JsonProperty("score") @ExcludeMissing score: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("statEntityID")
                @ExcludeMissing
                statEntityId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("teamID") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
            ) : this(colors, logo, names, score, statEntityId, teamId, mutableMapOf())

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun colors(): Optional<Colors> = colors.getOptional("colors")

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun logo(): Optional<String> = logo.getOptional("logo")

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun names(): Optional<Names> = names.getOptional("names")

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun score(): Optional<Double> = score.getOptional("score")

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun statEntityId(): Optional<String> = statEntityId.getOptional("statEntityID")

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun teamId(): Optional<String> = teamId.getOptional("teamID")

            /**
             * Returns the raw JSON value of [colors].
             *
             * Unlike [colors], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("colors") @ExcludeMissing fun _colors(): JsonField<Colors> = colors

            /**
             * Returns the raw JSON value of [logo].
             *
             * Unlike [logo], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("logo") @ExcludeMissing fun _logo(): JsonField<String> = logo

            /**
             * Returns the raw JSON value of [names].
             *
             * Unlike [names], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("names") @ExcludeMissing fun _names(): JsonField<Names> = names

            /**
             * Returns the raw JSON value of [score].
             *
             * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

            /**
             * Returns the raw JSON value of [statEntityId].
             *
             * Unlike [statEntityId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("statEntityID")
            @ExcludeMissing
            fun _statEntityId(): JsonField<String> = statEntityId

            /**
             * Returns the raw JSON value of [teamId].
             *
             * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("teamID") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Away]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Away]. */
            class Builder internal constructor() {

                private var colors: JsonField<Colors> = JsonMissing.of()
                private var logo: JsonField<String> = JsonMissing.of()
                private var names: JsonField<Names> = JsonMissing.of()
                private var score: JsonField<Double> = JsonMissing.of()
                private var statEntityId: JsonField<String> = JsonMissing.of()
                private var teamId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(away: Away) = apply {
                    colors = away.colors
                    logo = away.logo
                    names = away.names
                    score = away.score
                    statEntityId = away.statEntityId
                    teamId = away.teamId
                    additionalProperties = away.additionalProperties.toMutableMap()
                }

                fun colors(colors: Colors) = colors(JsonField.of(colors))

                /**
                 * Sets [Builder.colors] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.colors] with a well-typed [Colors] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun colors(colors: JsonField<Colors>) = apply { this.colors = colors }

                fun logo(logo: String) = logo(JsonField.of(logo))

                /**
                 * Sets [Builder.logo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.logo] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun logo(logo: JsonField<String>) = apply { this.logo = logo }

                fun names(names: Names) = names(JsonField.of(names))

                /**
                 * Sets [Builder.names] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.names] with a well-typed [Names] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun names(names: JsonField<Names>) = apply { this.names = names }

                fun score(score: Double) = score(JsonField.of(score))

                /**
                 * Sets [Builder.score] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.score] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun score(score: JsonField<Double>) = apply { this.score = score }

                fun statEntityId(statEntityId: String) = statEntityId(JsonField.of(statEntityId))

                /**
                 * Sets [Builder.statEntityId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statEntityId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun statEntityId(statEntityId: JsonField<String>) = apply {
                    this.statEntityId = statEntityId
                }

                fun teamId(teamId: String) = teamId(JsonField.of(teamId))

                /**
                 * Sets [Builder.teamId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Away].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Away =
                    Away(
                        colors,
                        logo,
                        names,
                        score,
                        statEntityId,
                        teamId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Away = apply {
                if (validated) {
                    return@apply
                }

                colors().ifPresent { it.validate() }
                logo()
                names().ifPresent { it.validate() }
                score()
                statEntityId()
                teamId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: SportsGameOddsInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (colors.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (logo.asKnown().isPresent) 1 else 0) +
                    (names.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (score.asKnown().isPresent) 1 else 0) +
                    (if (statEntityId.asKnown().isPresent) 1 else 0) +
                    (if (teamId.asKnown().isPresent) 1 else 0)

            class Colors
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val primary: JsonField<String>,
                private val primaryContrast: JsonField<String>,
                private val secondary: JsonField<String>,
                private val secondaryContrast: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("primary")
                    @ExcludeMissing
                    primary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("primaryContrast")
                    @ExcludeMissing
                    primaryContrast: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("secondary")
                    @ExcludeMissing
                    secondary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("secondaryContrast")
                    @ExcludeMissing
                    secondaryContrast: JsonField<String> = JsonMissing.of(),
                ) : this(primary, primaryContrast, secondary, secondaryContrast, mutableMapOf())

                /**
                 * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun primary(): Optional<String> = primary.getOptional("primary")

                /**
                 * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun primaryContrast(): Optional<String> =
                    primaryContrast.getOptional("primaryContrast")

                /**
                 * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun secondary(): Optional<String> = secondary.getOptional("secondary")

                /**
                 * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun secondaryContrast(): Optional<String> =
                    secondaryContrast.getOptional("secondaryContrast")

                /**
                 * Returns the raw JSON value of [primary].
                 *
                 * Unlike [primary], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("primary") @ExcludeMissing fun _primary(): JsonField<String> = primary

                /**
                 * Returns the raw JSON value of [primaryContrast].
                 *
                 * Unlike [primaryContrast], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("primaryContrast")
                @ExcludeMissing
                fun _primaryContrast(): JsonField<String> = primaryContrast

                /**
                 * Returns the raw JSON value of [secondary].
                 *
                 * Unlike [secondary], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("secondary")
                @ExcludeMissing
                fun _secondary(): JsonField<String> = secondary

                /**
                 * Returns the raw JSON value of [secondaryContrast].
                 *
                 * Unlike [secondaryContrast], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("secondaryContrast")
                @ExcludeMissing
                fun _secondaryContrast(): JsonField<String> = secondaryContrast

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Colors]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Colors]. */
                class Builder internal constructor() {

                    private var primary: JsonField<String> = JsonMissing.of()
                    private var primaryContrast: JsonField<String> = JsonMissing.of()
                    private var secondary: JsonField<String> = JsonMissing.of()
                    private var secondaryContrast: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(colors: Colors) = apply {
                        primary = colors.primary
                        primaryContrast = colors.primaryContrast
                        secondary = colors.secondary
                        secondaryContrast = colors.secondaryContrast
                        additionalProperties = colors.additionalProperties.toMutableMap()
                    }

                    fun primary(primary: String) = primary(JsonField.of(primary))

                    /**
                     * Sets [Builder.primary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.primary] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun primary(primary: JsonField<String>) = apply { this.primary = primary }

                    fun primaryContrast(primaryContrast: String) =
                        primaryContrast(JsonField.of(primaryContrast))

                    /**
                     * Sets [Builder.primaryContrast] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.primaryContrast] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun primaryContrast(primaryContrast: JsonField<String>) = apply {
                        this.primaryContrast = primaryContrast
                    }

                    fun secondary(secondary: String) = secondary(JsonField.of(secondary))

                    /**
                     * Sets [Builder.secondary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.secondary] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun secondary(secondary: JsonField<String>) = apply {
                        this.secondary = secondary
                    }

                    fun secondaryContrast(secondaryContrast: String) =
                        secondaryContrast(JsonField.of(secondaryContrast))

                    /**
                     * Sets [Builder.secondaryContrast] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.secondaryContrast] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun secondaryContrast(secondaryContrast: JsonField<String>) = apply {
                        this.secondaryContrast = secondaryContrast
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Colors].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Colors =
                        Colors(
                            primary,
                            primaryContrast,
                            secondary,
                            secondaryContrast,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Colors = apply {
                    if (validated) {
                        return@apply
                    }

                    primary()
                    primaryContrast()
                    secondary()
                    secondaryContrast()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: SportsGameOddsInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (primary.asKnown().isPresent) 1 else 0) +
                        (if (primaryContrast.asKnown().isPresent) 1 else 0) +
                        (if (secondary.asKnown().isPresent) 1 else 0) +
                        (if (secondaryContrast.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Colors &&
                        primary == other.primary &&
                        primaryContrast == other.primaryContrast &&
                        secondary == other.secondary &&
                        secondaryContrast == other.secondaryContrast &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        primary,
                        primaryContrast,
                        secondary,
                        secondaryContrast,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Colors{primary=$primary, primaryContrast=$primaryContrast, secondary=$secondary, secondaryContrast=$secondaryContrast, additionalProperties=$additionalProperties}"
            }

            class Names
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val long_: JsonField<String>,
                private val medium: JsonField<String>,
                private val short_: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("long")
                    @ExcludeMissing
                    long_: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("medium")
                    @ExcludeMissing
                    medium: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("short")
                    @ExcludeMissing
                    short_: JsonField<String> = JsonMissing.of(),
                ) : this(long_, medium, short_, mutableMapOf())

                /**
                 * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun long_(): Optional<String> = long_.getOptional("long")

                /**
                 * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun medium(): Optional<String> = medium.getOptional("medium")

                /**
                 * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun short_(): Optional<String> = short_.getOptional("short")

                /**
                 * Returns the raw JSON value of [long_].
                 *
                 * Unlike [long_], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("long") @ExcludeMissing fun _long_(): JsonField<String> = long_

                /**
                 * Returns the raw JSON value of [medium].
                 *
                 * Unlike [medium], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("medium") @ExcludeMissing fun _medium(): JsonField<String> = medium

                /**
                 * Returns the raw JSON value of [short_].
                 *
                 * Unlike [short_], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("short") @ExcludeMissing fun _short_(): JsonField<String> = short_

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Names]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Names]. */
                class Builder internal constructor() {

                    private var long_: JsonField<String> = JsonMissing.of()
                    private var medium: JsonField<String> = JsonMissing.of()
                    private var short_: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(names: Names) = apply {
                        long_ = names.long_
                        medium = names.medium
                        short_ = names.short_
                        additionalProperties = names.additionalProperties.toMutableMap()
                    }

                    fun long_(long_: String) = long_(JsonField.of(long_))

                    /**
                     * Sets [Builder.long_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.long_] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun long_(long_: JsonField<String>) = apply { this.long_ = long_ }

                    fun medium(medium: String) = medium(JsonField.of(medium))

                    /**
                     * Sets [Builder.medium] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.medium] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun medium(medium: JsonField<String>) = apply { this.medium = medium }

                    fun short_(short_: String) = short_(JsonField.of(short_))

                    /**
                     * Sets [Builder.short_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.short_] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun short_(short_: JsonField<String>) = apply { this.short_ = short_ }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Names].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Names =
                        Names(long_, medium, short_, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Names = apply {
                    if (validated) {
                        return@apply
                    }

                    long_()
                    medium()
                    short_()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: SportsGameOddsInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (long_.asKnown().isPresent) 1 else 0) +
                        (if (medium.asKnown().isPresent) 1 else 0) +
                        (if (short_.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Names &&
                        long_ == other.long_ &&
                        medium == other.medium &&
                        short_ == other.short_ &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(long_, medium, short_, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Names{long_=$long_, medium=$medium, short_=$short_, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Away &&
                    colors == other.colors &&
                    logo == other.logo &&
                    names == other.names &&
                    score == other.score &&
                    statEntityId == other.statEntityId &&
                    teamId == other.teamId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(colors, logo, names, score, statEntityId, teamId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Away{colors=$colors, logo=$logo, names=$names, score=$score, statEntityId=$statEntityId, teamId=$teamId, additionalProperties=$additionalProperties}"
        }

        class Home
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val colors: JsonField<Colors>,
            private val logo: JsonField<String>,
            private val names: JsonField<Names>,
            private val score: JsonField<Double>,
            private val statEntityId: JsonField<String>,
            private val teamId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("colors")
                @ExcludeMissing
                colors: JsonField<Colors> = JsonMissing.of(),
                @JsonProperty("logo") @ExcludeMissing logo: JsonField<String> = JsonMissing.of(),
                @JsonProperty("names") @ExcludeMissing names: JsonField<Names> = JsonMissing.of(),
                @JsonProperty("score") @ExcludeMissing score: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("statEntityID")
                @ExcludeMissing
                statEntityId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("teamID") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
            ) : this(colors, logo, names, score, statEntityId, teamId, mutableMapOf())

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun colors(): Optional<Colors> = colors.getOptional("colors")

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun logo(): Optional<String> = logo.getOptional("logo")

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun names(): Optional<Names> = names.getOptional("names")

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun score(): Optional<Double> = score.getOptional("score")

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun statEntityId(): Optional<String> = statEntityId.getOptional("statEntityID")

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun teamId(): Optional<String> = teamId.getOptional("teamID")

            /**
             * Returns the raw JSON value of [colors].
             *
             * Unlike [colors], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("colors") @ExcludeMissing fun _colors(): JsonField<Colors> = colors

            /**
             * Returns the raw JSON value of [logo].
             *
             * Unlike [logo], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("logo") @ExcludeMissing fun _logo(): JsonField<String> = logo

            /**
             * Returns the raw JSON value of [names].
             *
             * Unlike [names], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("names") @ExcludeMissing fun _names(): JsonField<Names> = names

            /**
             * Returns the raw JSON value of [score].
             *
             * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

            /**
             * Returns the raw JSON value of [statEntityId].
             *
             * Unlike [statEntityId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("statEntityID")
            @ExcludeMissing
            fun _statEntityId(): JsonField<String> = statEntityId

            /**
             * Returns the raw JSON value of [teamId].
             *
             * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("teamID") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Home]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Home]. */
            class Builder internal constructor() {

                private var colors: JsonField<Colors> = JsonMissing.of()
                private var logo: JsonField<String> = JsonMissing.of()
                private var names: JsonField<Names> = JsonMissing.of()
                private var score: JsonField<Double> = JsonMissing.of()
                private var statEntityId: JsonField<String> = JsonMissing.of()
                private var teamId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(home: Home) = apply {
                    colors = home.colors
                    logo = home.logo
                    names = home.names
                    score = home.score
                    statEntityId = home.statEntityId
                    teamId = home.teamId
                    additionalProperties = home.additionalProperties.toMutableMap()
                }

                fun colors(colors: Colors) = colors(JsonField.of(colors))

                /**
                 * Sets [Builder.colors] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.colors] with a well-typed [Colors] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun colors(colors: JsonField<Colors>) = apply { this.colors = colors }

                fun logo(logo: String) = logo(JsonField.of(logo))

                /**
                 * Sets [Builder.logo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.logo] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun logo(logo: JsonField<String>) = apply { this.logo = logo }

                fun names(names: Names) = names(JsonField.of(names))

                /**
                 * Sets [Builder.names] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.names] with a well-typed [Names] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun names(names: JsonField<Names>) = apply { this.names = names }

                fun score(score: Double) = score(JsonField.of(score))

                /**
                 * Sets [Builder.score] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.score] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun score(score: JsonField<Double>) = apply { this.score = score }

                fun statEntityId(statEntityId: String) = statEntityId(JsonField.of(statEntityId))

                /**
                 * Sets [Builder.statEntityId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statEntityId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun statEntityId(statEntityId: JsonField<String>) = apply {
                    this.statEntityId = statEntityId
                }

                fun teamId(teamId: String) = teamId(JsonField.of(teamId))

                /**
                 * Sets [Builder.teamId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Home].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Home =
                    Home(
                        colors,
                        logo,
                        names,
                        score,
                        statEntityId,
                        teamId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Home = apply {
                if (validated) {
                    return@apply
                }

                colors().ifPresent { it.validate() }
                logo()
                names().ifPresent { it.validate() }
                score()
                statEntityId()
                teamId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: SportsGameOddsInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (colors.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (logo.asKnown().isPresent) 1 else 0) +
                    (names.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (score.asKnown().isPresent) 1 else 0) +
                    (if (statEntityId.asKnown().isPresent) 1 else 0) +
                    (if (teamId.asKnown().isPresent) 1 else 0)

            class Colors
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val primary: JsonField<String>,
                private val primaryContrast: JsonField<String>,
                private val secondary: JsonField<String>,
                private val secondaryContrast: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("primary")
                    @ExcludeMissing
                    primary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("primaryContrast")
                    @ExcludeMissing
                    primaryContrast: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("secondary")
                    @ExcludeMissing
                    secondary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("secondaryContrast")
                    @ExcludeMissing
                    secondaryContrast: JsonField<String> = JsonMissing.of(),
                ) : this(primary, primaryContrast, secondary, secondaryContrast, mutableMapOf())

                /**
                 * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun primary(): Optional<String> = primary.getOptional("primary")

                /**
                 * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun primaryContrast(): Optional<String> =
                    primaryContrast.getOptional("primaryContrast")

                /**
                 * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun secondary(): Optional<String> = secondary.getOptional("secondary")

                /**
                 * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun secondaryContrast(): Optional<String> =
                    secondaryContrast.getOptional("secondaryContrast")

                /**
                 * Returns the raw JSON value of [primary].
                 *
                 * Unlike [primary], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("primary") @ExcludeMissing fun _primary(): JsonField<String> = primary

                /**
                 * Returns the raw JSON value of [primaryContrast].
                 *
                 * Unlike [primaryContrast], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("primaryContrast")
                @ExcludeMissing
                fun _primaryContrast(): JsonField<String> = primaryContrast

                /**
                 * Returns the raw JSON value of [secondary].
                 *
                 * Unlike [secondary], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("secondary")
                @ExcludeMissing
                fun _secondary(): JsonField<String> = secondary

                /**
                 * Returns the raw JSON value of [secondaryContrast].
                 *
                 * Unlike [secondaryContrast], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("secondaryContrast")
                @ExcludeMissing
                fun _secondaryContrast(): JsonField<String> = secondaryContrast

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Colors]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Colors]. */
                class Builder internal constructor() {

                    private var primary: JsonField<String> = JsonMissing.of()
                    private var primaryContrast: JsonField<String> = JsonMissing.of()
                    private var secondary: JsonField<String> = JsonMissing.of()
                    private var secondaryContrast: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(colors: Colors) = apply {
                        primary = colors.primary
                        primaryContrast = colors.primaryContrast
                        secondary = colors.secondary
                        secondaryContrast = colors.secondaryContrast
                        additionalProperties = colors.additionalProperties.toMutableMap()
                    }

                    fun primary(primary: String) = primary(JsonField.of(primary))

                    /**
                     * Sets [Builder.primary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.primary] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun primary(primary: JsonField<String>) = apply { this.primary = primary }

                    fun primaryContrast(primaryContrast: String) =
                        primaryContrast(JsonField.of(primaryContrast))

                    /**
                     * Sets [Builder.primaryContrast] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.primaryContrast] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun primaryContrast(primaryContrast: JsonField<String>) = apply {
                        this.primaryContrast = primaryContrast
                    }

                    fun secondary(secondary: String) = secondary(JsonField.of(secondary))

                    /**
                     * Sets [Builder.secondary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.secondary] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun secondary(secondary: JsonField<String>) = apply {
                        this.secondary = secondary
                    }

                    fun secondaryContrast(secondaryContrast: String) =
                        secondaryContrast(JsonField.of(secondaryContrast))

                    /**
                     * Sets [Builder.secondaryContrast] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.secondaryContrast] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun secondaryContrast(secondaryContrast: JsonField<String>) = apply {
                        this.secondaryContrast = secondaryContrast
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Colors].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Colors =
                        Colors(
                            primary,
                            primaryContrast,
                            secondary,
                            secondaryContrast,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Colors = apply {
                    if (validated) {
                        return@apply
                    }

                    primary()
                    primaryContrast()
                    secondary()
                    secondaryContrast()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: SportsGameOddsInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (primary.asKnown().isPresent) 1 else 0) +
                        (if (primaryContrast.asKnown().isPresent) 1 else 0) +
                        (if (secondary.asKnown().isPresent) 1 else 0) +
                        (if (secondaryContrast.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Colors &&
                        primary == other.primary &&
                        primaryContrast == other.primaryContrast &&
                        secondary == other.secondary &&
                        secondaryContrast == other.secondaryContrast &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        primary,
                        primaryContrast,
                        secondary,
                        secondaryContrast,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Colors{primary=$primary, primaryContrast=$primaryContrast, secondary=$secondary, secondaryContrast=$secondaryContrast, additionalProperties=$additionalProperties}"
            }

            class Names
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val long_: JsonField<String>,
                private val medium: JsonField<String>,
                private val short_: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("long")
                    @ExcludeMissing
                    long_: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("medium")
                    @ExcludeMissing
                    medium: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("short")
                    @ExcludeMissing
                    short_: JsonField<String> = JsonMissing.of(),
                ) : this(long_, medium, short_, mutableMapOf())

                /**
                 * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun long_(): Optional<String> = long_.getOptional("long")

                /**
                 * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun medium(): Optional<String> = medium.getOptional("medium")

                /**
                 * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun short_(): Optional<String> = short_.getOptional("short")

                /**
                 * Returns the raw JSON value of [long_].
                 *
                 * Unlike [long_], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("long") @ExcludeMissing fun _long_(): JsonField<String> = long_

                /**
                 * Returns the raw JSON value of [medium].
                 *
                 * Unlike [medium], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("medium") @ExcludeMissing fun _medium(): JsonField<String> = medium

                /**
                 * Returns the raw JSON value of [short_].
                 *
                 * Unlike [short_], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("short") @ExcludeMissing fun _short_(): JsonField<String> = short_

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Names]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Names]. */
                class Builder internal constructor() {

                    private var long_: JsonField<String> = JsonMissing.of()
                    private var medium: JsonField<String> = JsonMissing.of()
                    private var short_: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(names: Names) = apply {
                        long_ = names.long_
                        medium = names.medium
                        short_ = names.short_
                        additionalProperties = names.additionalProperties.toMutableMap()
                    }

                    fun long_(long_: String) = long_(JsonField.of(long_))

                    /**
                     * Sets [Builder.long_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.long_] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun long_(long_: JsonField<String>) = apply { this.long_ = long_ }

                    fun medium(medium: String) = medium(JsonField.of(medium))

                    /**
                     * Sets [Builder.medium] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.medium] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun medium(medium: JsonField<String>) = apply { this.medium = medium }

                    fun short_(short_: String) = short_(JsonField.of(short_))

                    /**
                     * Sets [Builder.short_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.short_] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun short_(short_: JsonField<String>) = apply { this.short_ = short_ }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Names].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Names =
                        Names(long_, medium, short_, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Names = apply {
                    if (validated) {
                        return@apply
                    }

                    long_()
                    medium()
                    short_()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: SportsGameOddsInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (long_.asKnown().isPresent) 1 else 0) +
                        (if (medium.asKnown().isPresent) 1 else 0) +
                        (if (short_.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Names &&
                        long_ == other.long_ &&
                        medium == other.medium &&
                        short_ == other.short_ &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(long_, medium, short_, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Names{long_=$long_, medium=$medium, short_=$short_, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Home &&
                    colors == other.colors &&
                    logo == other.logo &&
                    names == other.names &&
                    score == other.score &&
                    statEntityId == other.statEntityId &&
                    teamId == other.teamId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(colors, logo, names, score, statEntityId, teamId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Home{colors=$colors, logo=$logo, names=$names, score=$score, statEntityId=$statEntityId, teamId=$teamId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Teams &&
                away == other.away &&
                home == other.home &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(away, home, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Teams{away=$away, home=$home, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Event &&
            activity == other.activity &&
            eventId == other.eventId &&
            info == other.info &&
            leagueId == other.leagueId &&
            manual == other.manual &&
            odds == other.odds &&
            players == other.players &&
            results == other.results &&
            sportId == other.sportId &&
            status == other.status &&
            teams == other.teams &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            activity,
            eventId,
            info,
            leagueId,
            manual,
            odds,
            players,
            results,
            sportId,
            status,
            teams,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Event{activity=$activity, eventId=$eventId, info=$info, leagueId=$leagueId, manual=$manual, odds=$odds, players=$players, results=$results, sportId=$sportId, status=$status, teams=$teams, type=$type, additionalProperties=$additionalProperties}"
}
