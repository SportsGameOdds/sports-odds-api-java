// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.teams

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

class Team
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val coach: JsonField<Coach>,
    private val colors: JsonField<Colors>,
    private val leagueId: JsonField<String>,
    private val logo: JsonField<String>,
    private val lookups: JsonField<Lookups>,
    private val names: JsonField<Names>,
    private val owner: JsonField<Owner>,
    private val sportId: JsonField<String>,
    private val standings: JsonField<Standings>,
    private val teamId: JsonField<String>,
    private val venue: JsonField<Venue>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("coach") @ExcludeMissing coach: JsonField<Coach> = JsonMissing.of(),
        @JsonProperty("colors") @ExcludeMissing colors: JsonField<Colors> = JsonMissing.of(),
        @JsonProperty("leagueID") @ExcludeMissing leagueId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logo") @ExcludeMissing logo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lookups") @ExcludeMissing lookups: JsonField<Lookups> = JsonMissing.of(),
        @JsonProperty("names") @ExcludeMissing names: JsonField<Names> = JsonMissing.of(),
        @JsonProperty("owner") @ExcludeMissing owner: JsonField<Owner> = JsonMissing.of(),
        @JsonProperty("sportID") @ExcludeMissing sportId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("standings")
        @ExcludeMissing
        standings: JsonField<Standings> = JsonMissing.of(),
        @JsonProperty("teamID") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("venue") @ExcludeMissing venue: JsonField<Venue> = JsonMissing.of(),
    ) : this(
        coach,
        colors,
        leagueId,
        logo,
        lookups,
        names,
        owner,
        sportId,
        standings,
        teamId,
        venue,
        mutableMapOf(),
    )

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun coach(): Optional<Coach> = coach.getOptional("coach")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun colors(): Optional<Colors> = colors.getOptional("colors")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun leagueId(): Optional<String> = leagueId.getOptional("leagueID")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun logo(): Optional<String> = logo.getOptional("logo")

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
    fun owner(): Optional<Owner> = owner.getOptional("owner")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sportId(): Optional<String> = sportId.getOptional("sportID")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun standings(): Optional<Standings> = standings.getOptional("standings")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun teamId(): Optional<String> = teamId.getOptional("teamID")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun venue(): Optional<Venue> = venue.getOptional("venue")

    /**
     * Returns the raw JSON value of [coach].
     *
     * Unlike [coach], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coach") @ExcludeMissing fun _coach(): JsonField<Coach> = coach

    /**
     * Returns the raw JSON value of [colors].
     *
     * Unlike [colors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("colors") @ExcludeMissing fun _colors(): JsonField<Colors> = colors

    /**
     * Returns the raw JSON value of [leagueId].
     *
     * Unlike [leagueId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("leagueID") @ExcludeMissing fun _leagueId(): JsonField<String> = leagueId

    /**
     * Returns the raw JSON value of [logo].
     *
     * Unlike [logo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logo") @ExcludeMissing fun _logo(): JsonField<String> = logo

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
     * Returns the raw JSON value of [owner].
     *
     * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<Owner> = owner

    /**
     * Returns the raw JSON value of [sportId].
     *
     * Unlike [sportId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sportID") @ExcludeMissing fun _sportId(): JsonField<String> = sportId

    /**
     * Returns the raw JSON value of [standings].
     *
     * Unlike [standings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("standings") @ExcludeMissing fun _standings(): JsonField<Standings> = standings

    /**
     * Returns the raw JSON value of [teamId].
     *
     * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("teamID") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

    /**
     * Returns the raw JSON value of [venue].
     *
     * Unlike [venue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("venue") @ExcludeMissing fun _venue(): JsonField<Venue> = venue

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

        /** Returns a mutable builder for constructing an instance of [Team]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Team]. */
    class Builder internal constructor() {

        private var coach: JsonField<Coach> = JsonMissing.of()
        private var colors: JsonField<Colors> = JsonMissing.of()
        private var leagueId: JsonField<String> = JsonMissing.of()
        private var logo: JsonField<String> = JsonMissing.of()
        private var lookups: JsonField<Lookups> = JsonMissing.of()
        private var names: JsonField<Names> = JsonMissing.of()
        private var owner: JsonField<Owner> = JsonMissing.of()
        private var sportId: JsonField<String> = JsonMissing.of()
        private var standings: JsonField<Standings> = JsonMissing.of()
        private var teamId: JsonField<String> = JsonMissing.of()
        private var venue: JsonField<Venue> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(team: Team) = apply {
            coach = team.coach
            colors = team.colors
            leagueId = team.leagueId
            logo = team.logo
            lookups = team.lookups
            names = team.names
            owner = team.owner
            sportId = team.sportId
            standings = team.standings
            teamId = team.teamId
            venue = team.venue
            additionalProperties = team.additionalProperties.toMutableMap()
        }

        fun coach(coach: Coach) = coach(JsonField.of(coach))

        /**
         * Sets [Builder.coach] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coach] with a well-typed [Coach] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun coach(coach: JsonField<Coach>) = apply { this.coach = coach }

        fun colors(colors: Colors) = colors(JsonField.of(colors))

        /**
         * Sets [Builder.colors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.colors] with a well-typed [Colors] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun colors(colors: JsonField<Colors>) = apply { this.colors = colors }

        fun leagueId(leagueId: String) = leagueId(JsonField.of(leagueId))

        /**
         * Sets [Builder.leagueId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.leagueId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun leagueId(leagueId: JsonField<String>) = apply { this.leagueId = leagueId }

        fun logo(logo: String) = logo(JsonField.of(logo))

        /**
         * Sets [Builder.logo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logo(logo: JsonField<String>) = apply { this.logo = logo }

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

        fun owner(owner: Owner) = owner(JsonField.of(owner))

        /**
         * Sets [Builder.owner] to an arbitrary JSON value.
         *
         * You should usually call [Builder.owner] with a well-typed [Owner] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun owner(owner: JsonField<Owner>) = apply { this.owner = owner }

        fun sportId(sportId: String) = sportId(JsonField.of(sportId))

        /**
         * Sets [Builder.sportId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sportId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sportId(sportId: JsonField<String>) = apply { this.sportId = sportId }

        fun standings(standings: Standings) = standings(JsonField.of(standings))

        /**
         * Sets [Builder.standings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.standings] with a well-typed [Standings] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun standings(standings: JsonField<Standings>) = apply { this.standings = standings }

        fun teamId(teamId: String) = teamId(JsonField.of(teamId))

        /**
         * Sets [Builder.teamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

        fun venue(venue: Venue) = venue(JsonField.of(venue))

        /**
         * Sets [Builder.venue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.venue] with a well-typed [Venue] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun venue(venue: JsonField<Venue>) = apply { this.venue = venue }

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
         * Returns an immutable instance of [Team].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Team =
            Team(
                coach,
                colors,
                leagueId,
                logo,
                lookups,
                names,
                owner,
                sportId,
                standings,
                teamId,
                venue,
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
    fun validate(): Team = apply {
        if (validated) {
            return@apply
        }

        coach().ifPresent { it.validate() }
        colors().ifPresent { it.validate() }
        leagueId()
        logo()
        lookups().ifPresent { it.validate() }
        names().ifPresent { it.validate() }
        owner().ifPresent { it.validate() }
        sportId()
        standings().ifPresent { it.validate() }
        teamId()
        venue().ifPresent { it.validate() }
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
        (coach.asKnown().getOrNull()?.validity() ?: 0) +
            (colors.asKnown().getOrNull()?.validity() ?: 0) +
            (if (leagueId.asKnown().isPresent) 1 else 0) +
            (if (logo.asKnown().isPresent) 1 else 0) +
            (lookups.asKnown().getOrNull()?.validity() ?: 0) +
            (names.asKnown().getOrNull()?.validity() ?: 0) +
            (owner.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sportId.asKnown().isPresent) 1 else 0) +
            (standings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (teamId.asKnown().isPresent) 1 else 0) +
            (venue.asKnown().getOrNull()?.validity() ?: 0)

    class Coach
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of()
        ) : this(name, mutableMapOf())

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

            /** Returns a mutable builder for constructing an instance of [Coach]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Coach]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(coach: Coach) = apply {
                name = coach.name
                additionalProperties = coach.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Coach].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Coach = Coach(name, additionalProperties.toMutableMap())
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
        fun validate(): Coach = apply {
            if (validated) {
                return@apply
            }

            name()
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
        @JvmSynthetic internal fun validity(): Int = (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Coach &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Coach{name=$name, additionalProperties=$additionalProperties}"
    }

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
            @JsonProperty("primary") @ExcludeMissing primary: JsonField<String> = JsonMissing.of(),
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
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun primary(): Optional<String> = primary.getOptional("primary")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun primaryContrast(): Optional<String> = primaryContrast.getOptional("primaryContrast")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun secondary(): Optional<String> = secondary.getOptional("secondary")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun secondaryContrast(): Optional<String> =
            secondaryContrast.getOptional("secondaryContrast")

        /**
         * Returns the raw JSON value of [primary].
         *
         * Unlike [primary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("primary") @ExcludeMissing fun _primary(): JsonField<String> = primary

        /**
         * Returns the raw JSON value of [primaryContrast].
         *
         * Unlike [primaryContrast], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("primaryContrast")
        @ExcludeMissing
        fun _primaryContrast(): JsonField<String> = primaryContrast

        /**
         * Returns the raw JSON value of [secondary].
         *
         * Unlike [secondary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("secondary") @ExcludeMissing fun _secondary(): JsonField<String> = secondary

        /**
         * Returns the raw JSON value of [secondaryContrast].
         *
         * Unlike [secondaryContrast], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * You should usually call [Builder.primary] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun primary(primary: JsonField<String>) = apply { this.primary = primary }

            fun primaryContrast(primaryContrast: String) =
                primaryContrast(JsonField.of(primaryContrast))

            /**
             * Sets [Builder.primaryContrast] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryContrast] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun primaryContrast(primaryContrast: JsonField<String>) = apply {
                this.primaryContrast = primaryContrast
            }

            fun secondary(secondary: String) = secondary(JsonField.of(secondary))

            /**
             * Sets [Builder.secondary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secondary] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secondary(secondary: JsonField<String>) = apply { this.secondary = secondary }

            fun secondaryContrast(secondaryContrast: String) =
                secondaryContrast(JsonField.of(secondaryContrast))

            /**
             * Sets [Builder.secondaryContrast] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secondaryContrast] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws SportsGameOddsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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

    class Lookups
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val teamName: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("teamName")
            @ExcludeMissing
            teamName: JsonField<List<String>> = JsonMissing.of()
        ) : this(teamName, mutableMapOf())

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun teamName(): Optional<List<String>> = teamName.getOptional("teamName")

        /**
         * Returns the raw JSON value of [teamName].
         *
         * Unlike [teamName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("teamName")
        @ExcludeMissing
        fun _teamName(): JsonField<List<String>> = teamName

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

            private var teamName: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lookups: Lookups) = apply {
                teamName = lookups.teamName.map { it.toMutableList() }
                additionalProperties = lookups.additionalProperties.toMutableMap()
            }

            fun teamName(teamName: List<String>) = teamName(JsonField.of(teamName))

            /**
             * Sets [Builder.teamName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamName] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teamName(teamName: JsonField<List<String>>) = apply {
                this.teamName = teamName.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.teamName].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTeamName(teamName: String) = apply {
                this.teamName =
                    (this.teamName ?: JsonField.of(mutableListOf())).also {
                        checkKnown("teamName", it).add(teamName)
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
                    (teamName ?: JsonMissing.of()).map { it.toImmutable() },
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

            teamName()
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
        @JvmSynthetic internal fun validity(): Int = (teamName.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Lookups &&
                teamName == other.teamName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(teamName, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Lookups{teamName=$teamName, additionalProperties=$additionalProperties}"
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
            @JsonProperty("long") @ExcludeMissing long_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("medium") @ExcludeMissing medium: JsonField<String> = JsonMissing.of(),
            @JsonProperty("short") @ExcludeMissing short_: JsonField<String> = JsonMissing.of(),
        ) : this(long_, medium, short_, mutableMapOf())

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun long_(): Optional<String> = long_.getOptional("long")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun medium(): Optional<String> = medium.getOptional("medium")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun short_(): Optional<String> = short_.getOptional("short")

        /**
         * Returns the raw JSON value of [long_].
         *
         * Unlike [long_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("long") @ExcludeMissing fun _long_(): JsonField<String> = long_

        /**
         * Returns the raw JSON value of [medium].
         *
         * Unlike [medium], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("medium") @ExcludeMissing fun _medium(): JsonField<String> = medium

        /**
         * Returns the raw JSON value of [short_].
         *
         * Unlike [short_], this method doesn't throw if the JSON field has an unexpected type.
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
             * You should usually call [Builder.long_] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun long_(long_: JsonField<String>) = apply { this.long_ = long_ }

            fun medium(medium: String) = medium(JsonField.of(medium))

            /**
             * Sets [Builder.medium] to an arbitrary JSON value.
             *
             * You should usually call [Builder.medium] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun medium(medium: JsonField<String>) = apply { this.medium = medium }

            fun short_(short_: String) = short_(JsonField.of(short_))

            /**
             * Sets [Builder.short_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.short_] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun short_(short_: JsonField<String>) = apply { this.short_ = short_ }

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
            fun build(): Names = Names(long_, medium, short_, additionalProperties.toMutableMap())
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

    class Owner
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of()
        ) : this(name, mutableMapOf())

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

            /** Returns a mutable builder for constructing an instance of [Owner]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Owner]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(owner: Owner) = apply {
                name = owner.name
                additionalProperties = owner.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Owner].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Owner = Owner(name, additionalProperties.toMutableMap())
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
        fun validate(): Owner = apply {
            if (validated) {
                return@apply
            }

            name()
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
        @JvmSynthetic internal fun validity(): Int = (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Owner &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Owner{name=$name, additionalProperties=$additionalProperties}"
    }

    class Standings
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val last5: JsonField<String>,
        private val losses: JsonField<Double>,
        private val played: JsonField<Double>,
        private val position: JsonField<String>,
        private val record: JsonField<String>,
        private val streak: JsonField<Double>,
        private val ties: JsonField<Double>,
        private val wins: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("last5") @ExcludeMissing last5: JsonField<String> = JsonMissing.of(),
            @JsonProperty("losses") @ExcludeMissing losses: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("played") @ExcludeMissing played: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("position")
            @ExcludeMissing
            position: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record") @ExcludeMissing record: JsonField<String> = JsonMissing.of(),
            @JsonProperty("streak") @ExcludeMissing streak: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("ties") @ExcludeMissing ties: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("wins") @ExcludeMissing wins: JsonField<Double> = JsonMissing.of(),
        ) : this(last5, losses, played, position, record, streak, ties, wins, mutableMapOf())

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun last5(): Optional<String> = last5.getOptional("last5")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun losses(): Optional<Double> = losses.getOptional("losses")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun played(): Optional<Double> = played.getOptional("played")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun position(): Optional<String> = position.getOptional("position")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun record(): Optional<String> = record.getOptional("record")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun streak(): Optional<Double> = streak.getOptional("streak")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ties(): Optional<Double> = ties.getOptional("ties")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun wins(): Optional<Double> = wins.getOptional("wins")

        /**
         * Returns the raw JSON value of [last5].
         *
         * Unlike [last5], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last5") @ExcludeMissing fun _last5(): JsonField<String> = last5

        /**
         * Returns the raw JSON value of [losses].
         *
         * Unlike [losses], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("losses") @ExcludeMissing fun _losses(): JsonField<Double> = losses

        /**
         * Returns the raw JSON value of [played].
         *
         * Unlike [played], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("played") @ExcludeMissing fun _played(): JsonField<Double> = played

        /**
         * Returns the raw JSON value of [position].
         *
         * Unlike [position], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("position") @ExcludeMissing fun _position(): JsonField<String> = position

        /**
         * Returns the raw JSON value of [record].
         *
         * Unlike [record], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record") @ExcludeMissing fun _record(): JsonField<String> = record

        /**
         * Returns the raw JSON value of [streak].
         *
         * Unlike [streak], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("streak") @ExcludeMissing fun _streak(): JsonField<Double> = streak

        /**
         * Returns the raw JSON value of [ties].
         *
         * Unlike [ties], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ties") @ExcludeMissing fun _ties(): JsonField<Double> = ties

        /**
         * Returns the raw JSON value of [wins].
         *
         * Unlike [wins], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("wins") @ExcludeMissing fun _wins(): JsonField<Double> = wins

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

            /** Returns a mutable builder for constructing an instance of [Standings]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Standings]. */
        class Builder internal constructor() {

            private var last5: JsonField<String> = JsonMissing.of()
            private var losses: JsonField<Double> = JsonMissing.of()
            private var played: JsonField<Double> = JsonMissing.of()
            private var position: JsonField<String> = JsonMissing.of()
            private var record: JsonField<String> = JsonMissing.of()
            private var streak: JsonField<Double> = JsonMissing.of()
            private var ties: JsonField<Double> = JsonMissing.of()
            private var wins: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(standings: Standings) = apply {
                last5 = standings.last5
                losses = standings.losses
                played = standings.played
                position = standings.position
                record = standings.record
                streak = standings.streak
                ties = standings.ties
                wins = standings.wins
                additionalProperties = standings.additionalProperties.toMutableMap()
            }

            fun last5(last5: String) = last5(JsonField.of(last5))

            /**
             * Sets [Builder.last5] to an arbitrary JSON value.
             *
             * You should usually call [Builder.last5] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun last5(last5: JsonField<String>) = apply { this.last5 = last5 }

            fun losses(losses: Double) = losses(JsonField.of(losses))

            /**
             * Sets [Builder.losses] to an arbitrary JSON value.
             *
             * You should usually call [Builder.losses] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun losses(losses: JsonField<Double>) = apply { this.losses = losses }

            fun played(played: Double) = played(JsonField.of(played))

            /**
             * Sets [Builder.played] to an arbitrary JSON value.
             *
             * You should usually call [Builder.played] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun played(played: JsonField<Double>) = apply { this.played = played }

            fun position(position: String) = position(JsonField.of(position))

            /**
             * Sets [Builder.position] to an arbitrary JSON value.
             *
             * You should usually call [Builder.position] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun position(position: JsonField<String>) = apply { this.position = position }

            fun record(record: String) = record(JsonField.of(record))

            /**
             * Sets [Builder.record] to an arbitrary JSON value.
             *
             * You should usually call [Builder.record] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun record(record: JsonField<String>) = apply { this.record = record }

            fun streak(streak: Double) = streak(JsonField.of(streak))

            /**
             * Sets [Builder.streak] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streak] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun streak(streak: JsonField<Double>) = apply { this.streak = streak }

            fun ties(ties: Double) = ties(JsonField.of(ties))

            /**
             * Sets [Builder.ties] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ties] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ties(ties: JsonField<Double>) = apply { this.ties = ties }

            fun wins(wins: Double) = wins(JsonField.of(wins))

            /**
             * Sets [Builder.wins] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wins] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun wins(wins: JsonField<Double>) = apply { this.wins = wins }

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
             * Returns an immutable instance of [Standings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Standings =
                Standings(
                    last5,
                    losses,
                    played,
                    position,
                    record,
                    streak,
                    ties,
                    wins,
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
        fun validate(): Standings = apply {
            if (validated) {
                return@apply
            }

            last5()
            losses()
            played()
            position()
            record()
            streak()
            ties()
            wins()
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
            (if (last5.asKnown().isPresent) 1 else 0) +
                (if (losses.asKnown().isPresent) 1 else 0) +
                (if (played.asKnown().isPresent) 1 else 0) +
                (if (position.asKnown().isPresent) 1 else 0) +
                (if (record.asKnown().isPresent) 1 else 0) +
                (if (streak.asKnown().isPresent) 1 else 0) +
                (if (ties.asKnown().isPresent) 1 else 0) +
                (if (wins.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Standings &&
                last5 == other.last5 &&
                losses == other.losses &&
                played == other.played &&
                position == other.position &&
                record == other.record &&
                streak == other.streak &&
                ties == other.ties &&
                wins == other.wins &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                last5,
                losses,
                played,
                position,
                record,
                streak,
                ties,
                wins,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Standings{last5=$last5, losses=$losses, played=$played, position=$position, record=$record, streak=$streak, ties=$ties, wins=$wins, additionalProperties=$additionalProperties}"
    }

    class Venue
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<String>,
        private val capacity: JsonField<Double>,
        private val city: JsonField<String>,
        private val countryCode: JsonField<String>,
        private val countryName: JsonField<String>,
        private val name: JsonField<String>,
        private val regionCode: JsonField<String>,
        private val regionName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
            @JsonProperty("capacity")
            @ExcludeMissing
            capacity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("countryCode")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("countryName")
            @ExcludeMissing
            countryName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("regionCode")
            @ExcludeMissing
            regionCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("regionName")
            @ExcludeMissing
            regionName: JsonField<String> = JsonMissing.of(),
        ) : this(
            address,
            capacity,
            city,
            countryCode,
            countryName,
            name,
            regionCode,
            regionName,
            mutableMapOf(),
        )

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun address(): Optional<String> = address.getOptional("address")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun capacity(): Optional<Double> = capacity.getOptional("capacity")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun city(): Optional<String> = city.getOptional("city")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun countryName(): Optional<String> = countryName.getOptional("countryName")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun regionCode(): Optional<String> = regionCode.getOptional("regionCode")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun regionName(): Optional<String> = regionName.getOptional("regionName")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

        /**
         * Returns the raw JSON value of [capacity].
         *
         * Unlike [capacity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("capacity") @ExcludeMissing fun _capacity(): JsonField<Double> = capacity

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countryCode")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

        /**
         * Returns the raw JSON value of [countryName].
         *
         * Unlike [countryName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countryName")
        @ExcludeMissing
        fun _countryName(): JsonField<String> = countryName

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [regionCode].
         *
         * Unlike [regionCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("regionCode")
        @ExcludeMissing
        fun _regionCode(): JsonField<String> = regionCode

        /**
         * Returns the raw JSON value of [regionName].
         *
         * Unlike [regionName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("regionName")
        @ExcludeMissing
        fun _regionName(): JsonField<String> = regionName

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

            /** Returns a mutable builder for constructing an instance of [Venue]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Venue]. */
        class Builder internal constructor() {

            private var address: JsonField<String> = JsonMissing.of()
            private var capacity: JsonField<Double> = JsonMissing.of()
            private var city: JsonField<String> = JsonMissing.of()
            private var countryCode: JsonField<String> = JsonMissing.of()
            private var countryName: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var regionCode: JsonField<String> = JsonMissing.of()
            private var regionName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(venue: Venue) = apply {
                address = venue.address
                capacity = venue.capacity
                city = venue.city
                countryCode = venue.countryCode
                countryName = venue.countryName
                name = venue.name
                regionCode = venue.regionCode
                regionName = venue.regionName
                additionalProperties = venue.additionalProperties.toMutableMap()
            }

            fun address(address: String) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<String>) = apply { this.address = address }

            fun capacity(capacity: Double) = capacity(JsonField.of(capacity))

            /**
             * Sets [Builder.capacity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.capacity] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun capacity(capacity: JsonField<Double>) = apply { this.capacity = capacity }

            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

            /**
             * Sets [Builder.countryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryCode(countryCode: JsonField<String>) = apply {
                this.countryCode = countryCode
            }

            fun countryName(countryName: String) = countryName(JsonField.of(countryName))

            /**
             * Sets [Builder.countryName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryName(countryName: JsonField<String>) = apply {
                this.countryName = countryName
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun regionCode(regionCode: String) = regionCode(JsonField.of(regionCode))

            /**
             * Sets [Builder.regionCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regionCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun regionCode(regionCode: JsonField<String>) = apply { this.regionCode = regionCode }

            fun regionName(regionName: String) = regionName(JsonField.of(regionName))

            /**
             * Sets [Builder.regionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regionName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun regionName(regionName: JsonField<String>) = apply { this.regionName = regionName }

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
             * Returns an immutable instance of [Venue].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Venue =
                Venue(
                    address,
                    capacity,
                    city,
                    countryCode,
                    countryName,
                    name,
                    regionCode,
                    regionName,
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
        fun validate(): Venue = apply {
            if (validated) {
                return@apply
            }

            address()
            capacity()
            city()
            countryCode()
            countryName()
            name()
            regionCode()
            regionName()
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
            (if (address.asKnown().isPresent) 1 else 0) +
                (if (capacity.asKnown().isPresent) 1 else 0) +
                (if (city.asKnown().isPresent) 1 else 0) +
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (countryName.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (regionCode.asKnown().isPresent) 1 else 0) +
                (if (regionName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Venue &&
                address == other.address &&
                capacity == other.capacity &&
                city == other.city &&
                countryCode == other.countryCode &&
                countryName == other.countryName &&
                name == other.name &&
                regionCode == other.regionCode &&
                regionName == other.regionName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                address,
                capacity,
                city,
                countryCode,
                countryName,
                name,
                regionCode,
                regionName,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Venue{address=$address, capacity=$capacity, city=$city, countryCode=$countryCode, countryName=$countryName, name=$name, regionCode=$regionCode, regionName=$regionName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Team &&
            coach == other.coach &&
            colors == other.colors &&
            leagueId == other.leagueId &&
            logo == other.logo &&
            lookups == other.lookups &&
            names == other.names &&
            owner == other.owner &&
            sportId == other.sportId &&
            standings == other.standings &&
            teamId == other.teamId &&
            venue == other.venue &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            coach,
            colors,
            leagueId,
            logo,
            lookups,
            names,
            owner,
            sportId,
            standings,
            teamId,
            venue,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Team{coach=$coach, colors=$colors, leagueId=$leagueId, logo=$logo, lookups=$lookups, names=$names, owner=$owner, sportId=$sportId, standings=$standings, teamId=$teamId, venue=$venue, additionalProperties=$additionalProperties}"
}
