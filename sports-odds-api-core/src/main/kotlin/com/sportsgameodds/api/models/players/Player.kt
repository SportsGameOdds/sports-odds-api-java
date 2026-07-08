// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.players

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.sportsgameodds.api.core.ExcludeMissing
import com.sportsgameodds.api.core.JsonField
import com.sportsgameodds.api.core.JsonMissing
import com.sportsgameodds.api.core.JsonValue
import com.sportsgameodds.api.core.checkKnown
import com.sportsgameodds.api.core.toImmutable
import com.sportsgameodds.api.errors.SportsGameOddsInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Player
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val aliases: JsonField<List<String>>,
    private val jerseyNumber: JsonField<Double>,
    private val leagueId: JsonField<String>,
    private val lookups: JsonField<Lookups>,
    private val names: JsonField<Names>,
    private val playerId: JsonField<String>,
    private val playerTeams: JsonField<PlayerTeams>,
    private val position: JsonField<String>,
    private val sportId: JsonField<String>,
    private val teamId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("aliases")
        @ExcludeMissing
        aliases: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("jerseyNumber")
        @ExcludeMissing
        jerseyNumber: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("leagueID") @ExcludeMissing leagueId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lookups") @ExcludeMissing lookups: JsonField<Lookups> = JsonMissing.of(),
        @JsonProperty("names") @ExcludeMissing names: JsonField<Names> = JsonMissing.of(),
        @JsonProperty("playerID") @ExcludeMissing playerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("playerTeams")
        @ExcludeMissing
        playerTeams: JsonField<PlayerTeams> = JsonMissing.of(),
        @JsonProperty("position") @ExcludeMissing position: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sportID") @ExcludeMissing sportId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("teamID") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
    ) : this(
        aliases,
        jerseyNumber,
        leagueId,
        lookups,
        names,
        playerId,
        playerTeams,
        position,
        sportId,
        teamId,
        mutableMapOf(),
    )

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun aliases(): Optional<List<String>> = aliases.getOptional("aliases")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun jerseyNumber(): Optional<Double> = jerseyNumber.getOptional("jerseyNumber")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun leagueId(): Optional<String> = leagueId.getOptional("leagueID")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lookups(): Optional<Lookups> = lookups.getOptional("lookups")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun names(): Optional<Names> = names.getOptional("names")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun playerId(): Optional<String> = playerId.getOptional("playerID")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun playerTeams(): Optional<PlayerTeams> = playerTeams.getOptional("playerTeams")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun position(): Optional<String> = position.getOptional("position")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sportId(): Optional<String> = sportId.getOptional("sportID")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun teamId(): Optional<String> = teamId.getOptional("teamID")

    /**
     * Returns the raw JSON value of [aliases].
     *
     * Unlike [aliases], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aliases") @ExcludeMissing fun _aliases(): JsonField<List<String>> = aliases

    /**
     * Returns the raw JSON value of [jerseyNumber].
     *
     * Unlike [jerseyNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jerseyNumber")
    @ExcludeMissing
    fun _jerseyNumber(): JsonField<Double> = jerseyNumber

    /**
     * Returns the raw JSON value of [leagueId].
     *
     * Unlike [leagueId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("leagueID") @ExcludeMissing fun _leagueId(): JsonField<String> = leagueId

    /**
     * Returns the raw JSON value of [lookups].
     *
     * Unlike [lookups], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lookups") @ExcludeMissing fun _lookups(): JsonField<Lookups> = lookups

    /**
     * Returns the raw JSON value of [names].
     *
     * Unlike [names], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("names") @ExcludeMissing fun _names(): JsonField<Names> = names

    /**
     * Returns the raw JSON value of [playerId].
     *
     * Unlike [playerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("playerID") @ExcludeMissing fun _playerId(): JsonField<String> = playerId

    /**
     * Returns the raw JSON value of [playerTeams].
     *
     * Unlike [playerTeams], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("playerTeams")
    @ExcludeMissing
    fun _playerTeams(): JsonField<PlayerTeams> = playerTeams

    /**
     * Returns the raw JSON value of [position].
     *
     * Unlike [position], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("position") @ExcludeMissing fun _position(): JsonField<String> = position

    /**
     * Returns the raw JSON value of [sportId].
     *
     * Unlike [sportId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sportID") @ExcludeMissing fun _sportId(): JsonField<String> = sportId

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

        /** Returns a mutable builder for constructing an instance of [Player]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Player]. */
    class Builder internal constructor() {

        private var aliases: JsonField<MutableList<String>>? = null
        private var jerseyNumber: JsonField<Double> = JsonMissing.of()
        private var leagueId: JsonField<String> = JsonMissing.of()
        private var lookups: JsonField<Lookups> = JsonMissing.of()
        private var names: JsonField<Names> = JsonMissing.of()
        private var playerId: JsonField<String> = JsonMissing.of()
        private var playerTeams: JsonField<PlayerTeams> = JsonMissing.of()
        private var position: JsonField<String> = JsonMissing.of()
        private var sportId: JsonField<String> = JsonMissing.of()
        private var teamId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(player: Player) = apply {
            aliases = player.aliases.map { it.toMutableList() }
            jerseyNumber = player.jerseyNumber
            leagueId = player.leagueId
            lookups = player.lookups
            names = player.names
            playerId = player.playerId
            playerTeams = player.playerTeams
            position = player.position
            sportId = player.sportId
            teamId = player.teamId
            additionalProperties = player.additionalProperties.toMutableMap()
        }

        fun aliases(aliases: List<String>) = aliases(JsonField.of(aliases))

        /**
         * Sets [Builder.aliases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aliases] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun aliases(aliases: JsonField<List<String>>) = apply {
            this.aliases = aliases.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [aliases].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAlias(alias: String) = apply {
            aliases =
                (aliases ?: JsonField.of(mutableListOf())).also {
                    checkKnown("aliases", it).add(alias)
                }
        }

        fun jerseyNumber(jerseyNumber: Double) = jerseyNumber(JsonField.of(jerseyNumber))

        /**
         * Sets [Builder.jerseyNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jerseyNumber] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun jerseyNumber(jerseyNumber: JsonField<Double>) = apply {
            this.jerseyNumber = jerseyNumber
        }

        fun leagueId(leagueId: String) = leagueId(JsonField.of(leagueId))

        /**
         * Sets [Builder.leagueId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.leagueId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun leagueId(leagueId: JsonField<String>) = apply { this.leagueId = leagueId }

        fun lookups(lookups: Lookups) = lookups(JsonField.of(lookups))

        /**
         * Sets [Builder.lookups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lookups] with a well-typed [Lookups] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lookups(lookups: JsonField<Lookups>) = apply { this.lookups = lookups }

        fun names(names: Names) = names(JsonField.of(names))

        /**
         * Sets [Builder.names] to an arbitrary JSON value.
         *
         * You should usually call [Builder.names] with a well-typed [Names] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun names(names: JsonField<Names>) = apply { this.names = names }

        fun playerId(playerId: String) = playerId(JsonField.of(playerId))

        /**
         * Sets [Builder.playerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.playerId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun playerId(playerId: JsonField<String>) = apply { this.playerId = playerId }

        fun playerTeams(playerTeams: PlayerTeams) = playerTeams(JsonField.of(playerTeams))

        /**
         * Sets [Builder.playerTeams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.playerTeams] with a well-typed [PlayerTeams] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun playerTeams(playerTeams: JsonField<PlayerTeams>) = apply {
            this.playerTeams = playerTeams
        }

        fun position(position: String) = position(JsonField.of(position))

        /**
         * Sets [Builder.position] to an arbitrary JSON value.
         *
         * You should usually call [Builder.position] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun position(position: JsonField<String>) = apply { this.position = position }

        fun sportId(sportId: String) = sportId(JsonField.of(sportId))

        /**
         * Sets [Builder.sportId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sportId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sportId(sportId: JsonField<String>) = apply { this.sportId = sportId }

        fun teamId(teamId: String) = teamId(JsonField.of(teamId))

        /**
         * Sets [Builder.teamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

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
         * Returns an immutable instance of [Player].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Player =
            Player(
                (aliases ?: JsonMissing.of()).map { it.toImmutable() },
                jerseyNumber,
                leagueId,
                lookups,
                names,
                playerId,
                playerTeams,
                position,
                sportId,
                teamId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws SportsGameOddsInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): Player = apply {
        if (validated) {
            return@apply
        }

        aliases()
        jerseyNumber()
        leagueId()
        lookups().ifPresent { it.validate() }
        names().ifPresent { it.validate() }
        playerId()
        playerTeams().ifPresent { it.validate() }
        position()
        sportId()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (aliases.asKnown().getOrNull()?.size ?: 0) +
            (if (jerseyNumber.asKnown().isPresent) 1 else 0) +
            (if (leagueId.asKnown().isPresent) 1 else 0) +
            (lookups.asKnown().getOrNull()?.validity() ?: 0) +
            (names.asKnown().getOrNull()?.validity() ?: 0) +
            (if (playerId.asKnown().isPresent) 1 else 0) +
            (playerTeams.asKnown().getOrNull()?.validity() ?: 0) +
            (if (position.asKnown().isPresent) 1 else 0) +
            (if (sportId.asKnown().isPresent) 1 else 0) +
            (if (teamId.asKnown().isPresent) 1 else 0)

    class Lookups
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val anyName: JsonField<List<String>>,
        private val fullName: JsonField<List<String>>,
        private val initials: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("anyName")
            @ExcludeMissing
            anyName: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("fullName")
            @ExcludeMissing
            fullName: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("initials")
            @ExcludeMissing
            initials: JsonField<List<String>> = JsonMissing.of(),
        ) : this(anyName, fullName, initials, mutableMapOf())

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun anyName(): Optional<List<String>> = anyName.getOptional("anyName")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun fullName(): Optional<List<String>> = fullName.getOptional("fullName")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun initials(): Optional<List<String>> = initials.getOptional("initials")

        /**
         * Returns the raw JSON value of [anyName].
         *
         * Unlike [anyName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("anyName") @ExcludeMissing fun _anyName(): JsonField<List<String>> = anyName

        /**
         * Returns the raw JSON value of [fullName].
         *
         * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fullName")
        @ExcludeMissing
        fun _fullName(): JsonField<List<String>> = fullName

        /**
         * Returns the raw JSON value of [initials].
         *
         * Unlike [initials], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("initials")
        @ExcludeMissing
        fun _initials(): JsonField<List<String>> = initials

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

            /** Returns a mutable builder for constructing an instance of [Lookups]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Lookups]. */
        class Builder internal constructor() {

            private var anyName: JsonField<MutableList<String>>? = null
            private var fullName: JsonField<MutableList<String>>? = null
            private var initials: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lookups: Lookups) = apply {
                anyName = lookups.anyName.map { it.toMutableList() }
                fullName = lookups.fullName.map { it.toMutableList() }
                initials = lookups.initials.map { it.toMutableList() }
                additionalProperties = lookups.additionalProperties.toMutableMap()
            }

            fun anyName(anyName: List<String>) = anyName(JsonField.of(anyName))

            /**
             * Sets [Builder.anyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.anyName] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun anyName(anyName: JsonField<List<String>>) = apply {
                this.anyName = anyName.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.anyName].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAnyName(anyName: String) = apply {
                this.anyName =
                    (this.anyName ?: JsonField.of(mutableListOf())).also {
                        checkKnown("anyName", it).add(anyName)
                    }
            }

            fun fullName(fullName: List<String>) = fullName(JsonField.of(fullName))

            /**
             * Sets [Builder.fullName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fullName] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fullName(fullName: JsonField<List<String>>) = apply {
                this.fullName = fullName.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.fullName].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFullName(fullName: String) = apply {
                this.fullName =
                    (this.fullName ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fullName", it).add(fullName)
                    }
            }

            fun initials(initials: List<String>) = initials(JsonField.of(initials))

            /**
             * Sets [Builder.initials] to an arbitrary JSON value.
             *
             * You should usually call [Builder.initials] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun initials(initials: JsonField<List<String>>) = apply {
                this.initials = initials.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [initials].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addInitial(initial: String) = apply {
                initials =
                    (initials ?: JsonField.of(mutableListOf())).also {
                        checkKnown("initials", it).add(initial)
                    }
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
             * Returns an immutable instance of [Lookups].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Lookups =
                Lookups(
                    (anyName ?: JsonMissing.of()).map { it.toImmutable() },
                    (fullName ?: JsonMissing.of()).map { it.toImmutable() },
                    (initials ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws SportsGameOddsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Lookups = apply {
            if (validated) {
                return@apply
            }

            anyName()
            fullName()
            initials()
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
            (anyName.asKnown().getOrNull()?.size ?: 0) +
                (fullName.asKnown().getOrNull()?.size ?: 0) +
                (initials.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Lookups &&
                anyName == other.anyName &&
                fullName == other.fullName &&
                initials == other.initials &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(anyName, fullName, initials, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Lookups{anyName=$anyName, fullName=$fullName, initials=$initials, additionalProperties=$additionalProperties}"
    }

    class Names
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val display: JsonField<String>,
        private val firstName: JsonField<String>,
        private val lastName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("display") @ExcludeMissing display: JsonField<String> = JsonMissing.of(),
            @JsonProperty("firstName")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        ) : this(display, firstName, lastName, mutableMapOf())

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun display(): Optional<String> = display.getOptional("display")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun firstName(): Optional<String> = firstName.getOptional("firstName")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lastName(): Optional<String> = lastName.getOptional("lastName")

        /**
         * Returns the raw JSON value of [display].
         *
         * Unlike [display], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("display") @ExcludeMissing fun _display(): JsonField<String> = display

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

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

            private var display: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(names: Names) = apply {
                display = names.display
                firstName = names.firstName
                lastName = names.lastName
                additionalProperties = names.additionalProperties.toMutableMap()
            }

            fun display(display: String) = display(JsonField.of(display))

            /**
             * Sets [Builder.display] to an arbitrary JSON value.
             *
             * You should usually call [Builder.display] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun display(display: JsonField<String>) = apply { this.display = display }

            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

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
             * Returns an immutable instance of [Names].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Names =
                Names(display, firstName, lastName, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws SportsGameOddsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Names = apply {
            if (validated) {
                return@apply
            }

            display()
            firstName()
            lastName()
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
            (if (display.asKnown().isPresent) 1 else 0) +
                (if (firstName.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Names &&
                display == other.display &&
                firstName == other.firstName &&
                lastName == other.lastName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(display, firstName, lastName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Names{display=$display, firstName=$firstName, lastName=$lastName, additionalProperties=$additionalProperties}"
    }

    class PlayerTeams
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

            /** Returns a mutable builder for constructing an instance of [PlayerTeams]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PlayerTeams]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(playerTeams: PlayerTeams) = apply {
                additionalProperties = playerTeams.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [PlayerTeams].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PlayerTeams = PlayerTeams(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws SportsGameOddsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): PlayerTeams = apply {
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

            return other is PlayerTeams && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "PlayerTeams{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Player &&
            aliases == other.aliases &&
            jerseyNumber == other.jerseyNumber &&
            leagueId == other.leagueId &&
            lookups == other.lookups &&
            names == other.names &&
            playerId == other.playerId &&
            playerTeams == other.playerTeams &&
            position == other.position &&
            sportId == other.sportId &&
            teamId == other.teamId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            aliases,
            jerseyNumber,
            leagueId,
            lookups,
            names,
            playerId,
            playerTeams,
            position,
            sportId,
            teamId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Player{aliases=$aliases, jerseyNumber=$jerseyNumber, leagueId=$leagueId, lookups=$lookups, names=$names, playerId=$playerId, playerTeams=$playerTeams, position=$position, sportId=$sportId, teamId=$teamId, additionalProperties=$additionalProperties}"
}
