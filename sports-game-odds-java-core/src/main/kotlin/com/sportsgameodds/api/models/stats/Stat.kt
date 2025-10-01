// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.models.stats

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.sportsgameodds.api.core.ExcludeMissing
import com.sportsgameodds.api.core.JsonField
import com.sportsgameodds.api.core.JsonMissing
import com.sportsgameodds.api.core.JsonValue
import com.sportsgameodds.api.core.toImmutable
import com.sportsgameodds.api.errors.SportsGameOddsInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Stat
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val description: JsonField<String>,
    private val displays: JsonField<Displays>,
    private val isScoreStat: JsonField<Boolean>,
    private val statId: JsonField<String>,
    private val supportedLevels: JsonField<SupportedLevels>,
    private val supportedSports: JsonField<SupportedSports>,
    private val units: JsonField<Units>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("displays") @ExcludeMissing displays: JsonField<Displays> = JsonMissing.of(),
        @JsonProperty("isScoreStat")
        @ExcludeMissing
        isScoreStat: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("statID") @ExcludeMissing statId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supportedLevels")
        @ExcludeMissing
        supportedLevels: JsonField<SupportedLevels> = JsonMissing.of(),
        @JsonProperty("supportedSports")
        @ExcludeMissing
        supportedSports: JsonField<SupportedSports> = JsonMissing.of(),
        @JsonProperty("units") @ExcludeMissing units: JsonField<Units> = JsonMissing.of(),
    ) : this(
        description,
        displays,
        isScoreStat,
        statId,
        supportedLevels,
        supportedSports,
        units,
        mutableMapOf(),
    )

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun displays(): Optional<Displays> = displays.getOptional("displays")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun isScoreStat(): Optional<Boolean> = isScoreStat.getOptional("isScoreStat")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun statId(): Optional<String> = statId.getOptional("statID")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun supportedLevels(): Optional<SupportedLevels> =
        supportedLevels.getOptional("supportedLevels")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun supportedSports(): Optional<SupportedSports> =
        supportedSports.getOptional("supportedSports")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun units(): Optional<Units> = units.getOptional("units")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [displays].
     *
     * Unlike [displays], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("displays") @ExcludeMissing fun _displays(): JsonField<Displays> = displays

    /**
     * Returns the raw JSON value of [isScoreStat].
     *
     * Unlike [isScoreStat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isScoreStat")
    @ExcludeMissing
    fun _isScoreStat(): JsonField<Boolean> = isScoreStat

    /**
     * Returns the raw JSON value of [statId].
     *
     * Unlike [statId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statID") @ExcludeMissing fun _statId(): JsonField<String> = statId

    /**
     * Returns the raw JSON value of [supportedLevels].
     *
     * Unlike [supportedLevels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("supportedLevels")
    @ExcludeMissing
    fun _supportedLevels(): JsonField<SupportedLevels> = supportedLevels

    /**
     * Returns the raw JSON value of [supportedSports].
     *
     * Unlike [supportedSports], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("supportedSports")
    @ExcludeMissing
    fun _supportedSports(): JsonField<SupportedSports> = supportedSports

    /**
     * Returns the raw JSON value of [units].
     *
     * Unlike [units], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("units") @ExcludeMissing fun _units(): JsonField<Units> = units

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

        /** Returns a mutable builder for constructing an instance of [Stat]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Stat]. */
    class Builder internal constructor() {

        private var description: JsonField<String> = JsonMissing.of()
        private var displays: JsonField<Displays> = JsonMissing.of()
        private var isScoreStat: JsonField<Boolean> = JsonMissing.of()
        private var statId: JsonField<String> = JsonMissing.of()
        private var supportedLevels: JsonField<SupportedLevels> = JsonMissing.of()
        private var supportedSports: JsonField<SupportedSports> = JsonMissing.of()
        private var units: JsonField<Units> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(stat: Stat) = apply {
            description = stat.description
            displays = stat.displays
            isScoreStat = stat.isScoreStat
            statId = stat.statId
            supportedLevels = stat.supportedLevels
            supportedSports = stat.supportedSports
            units = stat.units
            additionalProperties = stat.additionalProperties.toMutableMap()
        }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun displays(displays: Displays) = displays(JsonField.of(displays))

        /**
         * Sets [Builder.displays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displays] with a well-typed [Displays] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displays(displays: JsonField<Displays>) = apply { this.displays = displays }

        fun isScoreStat(isScoreStat: Boolean) = isScoreStat(JsonField.of(isScoreStat))

        /**
         * Sets [Builder.isScoreStat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isScoreStat] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isScoreStat(isScoreStat: JsonField<Boolean>) = apply { this.isScoreStat = isScoreStat }

        fun statId(statId: String) = statId(JsonField.of(statId))

        /**
         * Sets [Builder.statId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun statId(statId: JsonField<String>) = apply { this.statId = statId }

        fun supportedLevels(supportedLevels: SupportedLevels) =
            supportedLevels(JsonField.of(supportedLevels))

        /**
         * Sets [Builder.supportedLevels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportedLevels] with a well-typed [SupportedLevels]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun supportedLevels(supportedLevels: JsonField<SupportedLevels>) = apply {
            this.supportedLevels = supportedLevels
        }

        fun supportedSports(supportedSports: SupportedSports) =
            supportedSports(JsonField.of(supportedSports))

        /**
         * Sets [Builder.supportedSports] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportedSports] with a well-typed [SupportedSports]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun supportedSports(supportedSports: JsonField<SupportedSports>) = apply {
            this.supportedSports = supportedSports
        }

        fun units(units: Units) = units(JsonField.of(units))

        /**
         * Sets [Builder.units] to an arbitrary JSON value.
         *
         * You should usually call [Builder.units] with a well-typed [Units] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun units(units: JsonField<Units>) = apply { this.units = units }

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
         * Returns an immutable instance of [Stat].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Stat =
            Stat(
                description,
                displays,
                isScoreStat,
                statId,
                supportedLevels,
                supportedSports,
                units,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Stat = apply {
        if (validated) {
            return@apply
        }

        description()
        displays().ifPresent { it.validate() }
        isScoreStat()
        statId()
        supportedLevels().ifPresent { it.validate() }
        supportedSports().ifPresent { it.validate() }
        units().ifPresent { it.validate() }
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
        (if (description.asKnown().isPresent) 1 else 0) +
            (displays.asKnown().getOrNull()?.validity() ?: 0) +
            (if (isScoreStat.asKnown().isPresent) 1 else 0) +
            (if (statId.asKnown().isPresent) 1 else 0) +
            (supportedLevels.asKnown().getOrNull()?.validity() ?: 0) +
            (supportedSports.asKnown().getOrNull()?.validity() ?: 0) +
            (units.asKnown().getOrNull()?.validity() ?: 0)

    class Displays
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val long_: JsonField<String>,
        private val short_: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("long") @ExcludeMissing long_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("short") @ExcludeMissing short_: JsonField<String> = JsonMissing.of(),
        ) : this(long_, short_, mutableMapOf())

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun long_(): Optional<String> = long_.getOptional("long")

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

            /** Returns a mutable builder for constructing an instance of [Displays]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Displays]. */
        class Builder internal constructor() {

            private var long_: JsonField<String> = JsonMissing.of()
            private var short_: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(displays: Displays) = apply {
                long_ = displays.long_
                short_ = displays.short_
                additionalProperties = displays.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Displays].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Displays = Displays(long_, short_, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Displays = apply {
            if (validated) {
                return@apply
            }

            long_()
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
            (if (long_.asKnown().isPresent) 1 else 0) + (if (short_.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Displays &&
                long_ == other.long_ &&
                short_ == other.short_ &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(long_, short_, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Displays{long_=$long_, short_=$short_, additionalProperties=$additionalProperties}"
    }

    class SupportedLevels
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val all: JsonField<Boolean>,
        private val player: JsonField<Boolean>,
        private val team: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("all") @ExcludeMissing all: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("player") @ExcludeMissing player: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("team") @ExcludeMissing team: JsonField<Boolean> = JsonMissing.of(),
        ) : this(all, player, team, mutableMapOf())

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun all(): Optional<Boolean> = all.getOptional("all")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun player(): Optional<Boolean> = player.getOptional("player")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun team(): Optional<Boolean> = team.getOptional("team")

        /**
         * Returns the raw JSON value of [all].
         *
         * Unlike [all], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("all") @ExcludeMissing fun _all(): JsonField<Boolean> = all

        /**
         * Returns the raw JSON value of [player].
         *
         * Unlike [player], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("player") @ExcludeMissing fun _player(): JsonField<Boolean> = player

        /**
         * Returns the raw JSON value of [team].
         *
         * Unlike [team], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("team") @ExcludeMissing fun _team(): JsonField<Boolean> = team

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

            /** Returns a mutable builder for constructing an instance of [SupportedLevels]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SupportedLevels]. */
        class Builder internal constructor() {

            private var all: JsonField<Boolean> = JsonMissing.of()
            private var player: JsonField<Boolean> = JsonMissing.of()
            private var team: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(supportedLevels: SupportedLevels) = apply {
                all = supportedLevels.all
                player = supportedLevels.player
                team = supportedLevels.team
                additionalProperties = supportedLevels.additionalProperties.toMutableMap()
            }

            fun all(all: Boolean) = all(JsonField.of(all))

            /**
             * Sets [Builder.all] to an arbitrary JSON value.
             *
             * You should usually call [Builder.all] with a well-typed [Boolean] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun all(all: JsonField<Boolean>) = apply { this.all = all }

            fun player(player: Boolean) = player(JsonField.of(player))

            /**
             * Sets [Builder.player] to an arbitrary JSON value.
             *
             * You should usually call [Builder.player] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun player(player: JsonField<Boolean>) = apply { this.player = player }

            fun team(team: Boolean) = team(JsonField.of(team))

            /**
             * Sets [Builder.team] to an arbitrary JSON value.
             *
             * You should usually call [Builder.team] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun team(team: JsonField<Boolean>) = apply { this.team = team }

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
             * Returns an immutable instance of [SupportedLevels].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SupportedLevels =
                SupportedLevels(all, player, team, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): SupportedLevels = apply {
            if (validated) {
                return@apply
            }

            all()
            player()
            team()
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
            (if (all.asKnown().isPresent) 1 else 0) +
                (if (player.asKnown().isPresent) 1 else 0) +
                (if (team.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SupportedLevels &&
                all == other.all &&
                player == other.player &&
                team == other.team &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(all, player, team, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SupportedLevels{all=$all, player=$player, team=$team, additionalProperties=$additionalProperties}"
    }

    class SupportedSports
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

            /** Returns a mutable builder for constructing an instance of [SupportedSports]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SupportedSports]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(supportedSports: SupportedSports) = apply {
                additionalProperties = supportedSports.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [SupportedSports].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SupportedSports = SupportedSports(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): SupportedSports = apply {
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

            return other is SupportedSports && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "SupportedSports{additionalProperties=$additionalProperties}"
    }

    class Units
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val long_: JsonField<Long>,
        private val short_: JsonField<Short>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("long") @ExcludeMissing long_: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("short") @ExcludeMissing short_: JsonField<Short> = JsonMissing.of(),
        ) : this(long_, short_, mutableMapOf())

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun long_(): Optional<Long> = long_.getOptional("long")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun short_(): Optional<Short> = short_.getOptional("short")

        /**
         * Returns the raw JSON value of [long_].
         *
         * Unlike [long_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("long") @ExcludeMissing fun _long_(): JsonField<Long> = long_

        /**
         * Returns the raw JSON value of [short_].
         *
         * Unlike [short_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("short") @ExcludeMissing fun _short_(): JsonField<Short> = short_

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

            /** Returns a mutable builder for constructing an instance of [Units]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Units]. */
        class Builder internal constructor() {

            private var long_: JsonField<Long> = JsonMissing.of()
            private var short_: JsonField<Short> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(units: Units) = apply {
                long_ = units.long_
                short_ = units.short_
                additionalProperties = units.additionalProperties.toMutableMap()
            }

            fun long_(long_: Long) = long_(JsonField.of(long_))

            /**
             * Sets [Builder.long_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.long_] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun long_(long_: JsonField<Long>) = apply { this.long_ = long_ }

            fun short_(short_: Short) = short_(JsonField.of(short_))

            /**
             * Sets [Builder.short_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.short_] with a well-typed [Short] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun short_(short_: JsonField<Short>) = apply { this.short_ = short_ }

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
             * Returns an immutable instance of [Units].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Units = Units(long_, short_, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Units = apply {
            if (validated) {
                return@apply
            }

            long_().ifPresent { it.validate() }
            short_().ifPresent { it.validate() }
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
            (long_.asKnown().getOrNull()?.validity() ?: 0) +
                (short_.asKnown().getOrNull()?.validity() ?: 0)

        class Long
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val plural: JsonField<String>,
            private val singular: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("plural")
                @ExcludeMissing
                plural: JsonField<String> = JsonMissing.of(),
                @JsonProperty("singular")
                @ExcludeMissing
                singular: JsonField<String> = JsonMissing.of(),
            ) : this(plural, singular, mutableMapOf())

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun plural(): Optional<String> = plural.getOptional("plural")

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun singular(): Optional<String> = singular.getOptional("singular")

            /**
             * Returns the raw JSON value of [plural].
             *
             * Unlike [plural], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("plural") @ExcludeMissing fun _plural(): JsonField<String> = plural

            /**
             * Returns the raw JSON value of [singular].
             *
             * Unlike [singular], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("singular") @ExcludeMissing fun _singular(): JsonField<String> = singular

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

                /** Returns a mutable builder for constructing an instance of [Long]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Long]. */
            class Builder internal constructor() {

                private var plural: JsonField<String> = JsonMissing.of()
                private var singular: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(long_: Long) = apply {
                    plural = long_.plural
                    singular = long_.singular
                    additionalProperties = long_.additionalProperties.toMutableMap()
                }

                fun plural(plural: String) = plural(JsonField.of(plural))

                /**
                 * Sets [Builder.plural] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.plural] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun plural(plural: JsonField<String>) = apply { this.plural = plural }

                fun singular(singular: String) = singular(JsonField.of(singular))

                /**
                 * Sets [Builder.singular] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.singular] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun singular(singular: JsonField<String>) = apply { this.singular = singular }

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
                 * Returns an immutable instance of [Long].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Long = Long(plural, singular, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Long = apply {
                if (validated) {
                    return@apply
                }

                plural()
                singular()
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
                (if (plural.asKnown().isPresent) 1 else 0) +
                    (if (singular.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Long &&
                    plural == other.plural &&
                    singular == other.singular &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(plural, singular, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Long{plural=$plural, singular=$singular, additionalProperties=$additionalProperties}"
        }

        class Short
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val plural: JsonField<String>,
            private val singular: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("plural")
                @ExcludeMissing
                plural: JsonField<String> = JsonMissing.of(),
                @JsonProperty("singular")
                @ExcludeMissing
                singular: JsonField<String> = JsonMissing.of(),
            ) : this(plural, singular, mutableMapOf())

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun plural(): Optional<String> = plural.getOptional("plural")

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun singular(): Optional<String> = singular.getOptional("singular")

            /**
             * Returns the raw JSON value of [plural].
             *
             * Unlike [plural], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("plural") @ExcludeMissing fun _plural(): JsonField<String> = plural

            /**
             * Returns the raw JSON value of [singular].
             *
             * Unlike [singular], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("singular") @ExcludeMissing fun _singular(): JsonField<String> = singular

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

                /** Returns a mutable builder for constructing an instance of [Short]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Short]. */
            class Builder internal constructor() {

                private var plural: JsonField<String> = JsonMissing.of()
                private var singular: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(short_: Short) = apply {
                    plural = short_.plural
                    singular = short_.singular
                    additionalProperties = short_.additionalProperties.toMutableMap()
                }

                fun plural(plural: String) = plural(JsonField.of(plural))

                /**
                 * Sets [Builder.plural] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.plural] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun plural(plural: JsonField<String>) = apply { this.plural = plural }

                fun singular(singular: String) = singular(JsonField.of(singular))

                /**
                 * Sets [Builder.singular] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.singular] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun singular(singular: JsonField<String>) = apply { this.singular = singular }

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
                 * Returns an immutable instance of [Short].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Short = Short(plural, singular, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Short = apply {
                if (validated) {
                    return@apply
                }

                plural()
                singular()
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
                (if (plural.asKnown().isPresent) 1 else 0) +
                    (if (singular.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Short &&
                    plural == other.plural &&
                    singular == other.singular &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(plural, singular, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Short{plural=$plural, singular=$singular, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Units &&
                long_ == other.long_ &&
                short_ == other.short_ &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(long_, short_, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Units{long_=$long_, short_=$short_, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Stat &&
            description == other.description &&
            displays == other.displays &&
            isScoreStat == other.isScoreStat &&
            statId == other.statId &&
            supportedLevels == other.supportedLevels &&
            supportedSports == other.supportedSports &&
            units == other.units &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            description,
            displays,
            isScoreStat,
            statId,
            supportedLevels,
            supportedSports,
            units,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Stat{description=$description, displays=$displays, isScoreStat=$isScoreStat, statId=$statId, supportedLevels=$supportedLevels, supportedSports=$supportedSports, units=$units, additionalProperties=$additionalProperties}"
}
