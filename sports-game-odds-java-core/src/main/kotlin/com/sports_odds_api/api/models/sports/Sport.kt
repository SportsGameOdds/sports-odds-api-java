// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.models.sports

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Sport
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val backgroundImage: JsonField<String>,
    private val basePeriods: JsonField<List<String>>,
    private val clockType: JsonField<String>,
    private val defaultPopularityScore: JsonField<Double>,
    private val enabled: JsonField<Boolean>,
    private val eventWord: JsonField<EventWord>,
    private val extraPeriods: JsonField<List<String>>,
    private val hasMeaningfulHomeAway: JsonField<Boolean>,
    private val imageIcon: JsonField<String>,
    private val name: JsonField<String>,
    private val pointWord: JsonField<PointWord>,
    private val shortName: JsonField<String>,
    private val sportId: JsonField<String>,
    private val squareImage: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("backgroundImage")
        @ExcludeMissing
        backgroundImage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("basePeriods")
        @ExcludeMissing
        basePeriods: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("clockType") @ExcludeMissing clockType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("defaultPopularityScore")
        @ExcludeMissing
        defaultPopularityScore: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("eventWord")
        @ExcludeMissing
        eventWord: JsonField<EventWord> = JsonMissing.of(),
        @JsonProperty("extraPeriods")
        @ExcludeMissing
        extraPeriods: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("hasMeaningfulHomeAway")
        @ExcludeMissing
        hasMeaningfulHomeAway: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("imageIcon") @ExcludeMissing imageIcon: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pointWord")
        @ExcludeMissing
        pointWord: JsonField<PointWord> = JsonMissing.of(),
        @JsonProperty("shortName") @ExcludeMissing shortName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sportID") @ExcludeMissing sportId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("squareImage")
        @ExcludeMissing
        squareImage: JsonField<String> = JsonMissing.of(),
    ) : this(
        backgroundImage,
        basePeriods,
        clockType,
        defaultPopularityScore,
        enabled,
        eventWord,
        extraPeriods,
        hasMeaningfulHomeAway,
        imageIcon,
        name,
        pointWord,
        shortName,
        sportId,
        squareImage,
        mutableMapOf(),
    )

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun backgroundImage(): Optional<String> = backgroundImage.getOptional("backgroundImage")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun basePeriods(): Optional<List<String>> = basePeriods.getOptional("basePeriods")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun clockType(): Optional<String> = clockType.getOptional("clockType")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun defaultPopularityScore(): Optional<Double> =
        defaultPopularityScore.getOptional("defaultPopularityScore")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun eventWord(): Optional<EventWord> = eventWord.getOptional("eventWord")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun extraPeriods(): Optional<List<String>> = extraPeriods.getOptional("extraPeriods")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun hasMeaningfulHomeAway(): Optional<Boolean> =
        hasMeaningfulHomeAway.getOptional("hasMeaningfulHomeAway")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun imageIcon(): Optional<String> = imageIcon.getOptional("imageIcon")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pointWord(): Optional<PointWord> = pointWord.getOptional("pointWord")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun shortName(): Optional<String> = shortName.getOptional("shortName")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sportId(): Optional<String> = sportId.getOptional("sportID")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun squareImage(): Optional<String> = squareImage.getOptional("squareImage")

    /**
     * Returns the raw JSON value of [backgroundImage].
     *
     * Unlike [backgroundImage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("backgroundImage")
    @ExcludeMissing
    fun _backgroundImage(): JsonField<String> = backgroundImage

    /**
     * Returns the raw JSON value of [basePeriods].
     *
     * Unlike [basePeriods], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("basePeriods")
    @ExcludeMissing
    fun _basePeriods(): JsonField<List<String>> = basePeriods

    /**
     * Returns the raw JSON value of [clockType].
     *
     * Unlike [clockType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clockType") @ExcludeMissing fun _clockType(): JsonField<String> = clockType

    /**
     * Returns the raw JSON value of [defaultPopularityScore].
     *
     * Unlike [defaultPopularityScore], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("defaultPopularityScore")
    @ExcludeMissing
    fun _defaultPopularityScore(): JsonField<Double> = defaultPopularityScore

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [eventWord].
     *
     * Unlike [eventWord], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventWord") @ExcludeMissing fun _eventWord(): JsonField<EventWord> = eventWord

    /**
     * Returns the raw JSON value of [extraPeriods].
     *
     * Unlike [extraPeriods], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extraPeriods")
    @ExcludeMissing
    fun _extraPeriods(): JsonField<List<String>> = extraPeriods

    /**
     * Returns the raw JSON value of [hasMeaningfulHomeAway].
     *
     * Unlike [hasMeaningfulHomeAway], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hasMeaningfulHomeAway")
    @ExcludeMissing
    fun _hasMeaningfulHomeAway(): JsonField<Boolean> = hasMeaningfulHomeAway

    /**
     * Returns the raw JSON value of [imageIcon].
     *
     * Unlike [imageIcon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imageIcon") @ExcludeMissing fun _imageIcon(): JsonField<String> = imageIcon

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [pointWord].
     *
     * Unlike [pointWord], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pointWord") @ExcludeMissing fun _pointWord(): JsonField<PointWord> = pointWord

    /**
     * Returns the raw JSON value of [shortName].
     *
     * Unlike [shortName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shortName") @ExcludeMissing fun _shortName(): JsonField<String> = shortName

    /**
     * Returns the raw JSON value of [sportId].
     *
     * Unlike [sportId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sportID") @ExcludeMissing fun _sportId(): JsonField<String> = sportId

    /**
     * Returns the raw JSON value of [squareImage].
     *
     * Unlike [squareImage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("squareImage") @ExcludeMissing fun _squareImage(): JsonField<String> = squareImage

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

        /** Returns a mutable builder for constructing an instance of [Sport]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Sport]. */
    class Builder internal constructor() {

        private var backgroundImage: JsonField<String> = JsonMissing.of()
        private var basePeriods: JsonField<MutableList<String>>? = null
        private var clockType: JsonField<String> = JsonMissing.of()
        private var defaultPopularityScore: JsonField<Double> = JsonMissing.of()
        private var enabled: JsonField<Boolean> = JsonMissing.of()
        private var eventWord: JsonField<EventWord> = JsonMissing.of()
        private var extraPeriods: JsonField<MutableList<String>>? = null
        private var hasMeaningfulHomeAway: JsonField<Boolean> = JsonMissing.of()
        private var imageIcon: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var pointWord: JsonField<PointWord> = JsonMissing.of()
        private var shortName: JsonField<String> = JsonMissing.of()
        private var sportId: JsonField<String> = JsonMissing.of()
        private var squareImage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sport: Sport) = apply {
            backgroundImage = sport.backgroundImage
            basePeriods = sport.basePeriods.map { it.toMutableList() }
            clockType = sport.clockType
            defaultPopularityScore = sport.defaultPopularityScore
            enabled = sport.enabled
            eventWord = sport.eventWord
            extraPeriods = sport.extraPeriods.map { it.toMutableList() }
            hasMeaningfulHomeAway = sport.hasMeaningfulHomeAway
            imageIcon = sport.imageIcon
            name = sport.name
            pointWord = sport.pointWord
            shortName = sport.shortName
            sportId = sport.sportId
            squareImage = sport.squareImage
            additionalProperties = sport.additionalProperties.toMutableMap()
        }

        fun backgroundImage(backgroundImage: String) =
            backgroundImage(JsonField.of(backgroundImage))

        /**
         * Sets [Builder.backgroundImage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundImage] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundImage(backgroundImage: JsonField<String>) = apply {
            this.backgroundImage = backgroundImage
        }

        fun basePeriods(basePeriods: List<String>) = basePeriods(JsonField.of(basePeriods))

        /**
         * Sets [Builder.basePeriods] to an arbitrary JSON value.
         *
         * You should usually call [Builder.basePeriods] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun basePeriods(basePeriods: JsonField<List<String>>) = apply {
            this.basePeriods = basePeriods.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [basePeriods].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBasePeriod(basePeriod: String) = apply {
            basePeriods =
                (basePeriods ?: JsonField.of(mutableListOf())).also {
                    checkKnown("basePeriods", it).add(basePeriod)
                }
        }

        fun clockType(clockType: String) = clockType(JsonField.of(clockType))

        /**
         * Sets [Builder.clockType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clockType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clockType(clockType: JsonField<String>) = apply { this.clockType = clockType }

        fun defaultPopularityScore(defaultPopularityScore: Double) =
            defaultPopularityScore(JsonField.of(defaultPopularityScore))

        /**
         * Sets [Builder.defaultPopularityScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultPopularityScore] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultPopularityScore(defaultPopularityScore: JsonField<Double>) = apply {
            this.defaultPopularityScore = defaultPopularityScore
        }

        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        fun eventWord(eventWord: EventWord) = eventWord(JsonField.of(eventWord))

        /**
         * Sets [Builder.eventWord] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventWord] with a well-typed [EventWord] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventWord(eventWord: JsonField<EventWord>) = apply { this.eventWord = eventWord }

        fun extraPeriods(extraPeriods: List<String>) = extraPeriods(JsonField.of(extraPeriods))

        /**
         * Sets [Builder.extraPeriods] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extraPeriods] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extraPeriods(extraPeriods: JsonField<List<String>>) = apply {
            this.extraPeriods = extraPeriods.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [extraPeriods].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExtraPeriod(extraPeriod: String) = apply {
            extraPeriods =
                (extraPeriods ?: JsonField.of(mutableListOf())).also {
                    checkKnown("extraPeriods", it).add(extraPeriod)
                }
        }

        fun hasMeaningfulHomeAway(hasMeaningfulHomeAway: Boolean) =
            hasMeaningfulHomeAway(JsonField.of(hasMeaningfulHomeAway))

        /**
         * Sets [Builder.hasMeaningfulHomeAway] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasMeaningfulHomeAway] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasMeaningfulHomeAway(hasMeaningfulHomeAway: JsonField<Boolean>) = apply {
            this.hasMeaningfulHomeAway = hasMeaningfulHomeAway
        }

        fun imageIcon(imageIcon: String) = imageIcon(JsonField.of(imageIcon))

        /**
         * Sets [Builder.imageIcon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageIcon] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun imageIcon(imageIcon: JsonField<String>) = apply { this.imageIcon = imageIcon }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun pointWord(pointWord: PointWord) = pointWord(JsonField.of(pointWord))

        /**
         * Sets [Builder.pointWord] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pointWord] with a well-typed [PointWord] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pointWord(pointWord: JsonField<PointWord>) = apply { this.pointWord = pointWord }

        fun shortName(shortName: String) = shortName(JsonField.of(shortName))

        /**
         * Sets [Builder.shortName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shortName(shortName: JsonField<String>) = apply { this.shortName = shortName }

        fun sportId(sportId: String) = sportId(JsonField.of(sportId))

        /**
         * Sets [Builder.sportId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sportId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sportId(sportId: JsonField<String>) = apply { this.sportId = sportId }

        fun squareImage(squareImage: String) = squareImage(JsonField.of(squareImage))

        /**
         * Sets [Builder.squareImage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.squareImage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun squareImage(squareImage: JsonField<String>) = apply { this.squareImage = squareImage }

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
         * Returns an immutable instance of [Sport].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Sport =
            Sport(
                backgroundImage,
                (basePeriods ?: JsonMissing.of()).map { it.toImmutable() },
                clockType,
                defaultPopularityScore,
                enabled,
                eventWord,
                (extraPeriods ?: JsonMissing.of()).map { it.toImmutable() },
                hasMeaningfulHomeAway,
                imageIcon,
                name,
                pointWord,
                shortName,
                sportId,
                squareImage,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Sport = apply {
        if (validated) {
            return@apply
        }

        backgroundImage()
        basePeriods()
        clockType()
        defaultPopularityScore()
        enabled()
        eventWord().ifPresent { it.validate() }
        extraPeriods()
        hasMeaningfulHomeAway()
        imageIcon()
        name()
        pointWord().ifPresent { it.validate() }
        shortName()
        sportId()
        squareImage()
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
        (if (backgroundImage.asKnown().isPresent) 1 else 0) +
            (basePeriods.asKnown().getOrNull()?.size ?: 0) +
            (if (clockType.asKnown().isPresent) 1 else 0) +
            (if (defaultPopularityScore.asKnown().isPresent) 1 else 0) +
            (if (enabled.asKnown().isPresent) 1 else 0) +
            (eventWord.asKnown().getOrNull()?.validity() ?: 0) +
            (extraPeriods.asKnown().getOrNull()?.size ?: 0) +
            (if (hasMeaningfulHomeAway.asKnown().isPresent) 1 else 0) +
            (if (imageIcon.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (pointWord.asKnown().getOrNull()?.validity() ?: 0) +
            (if (shortName.asKnown().isPresent) 1 else 0) +
            (if (sportId.asKnown().isPresent) 1 else 0) +
            (if (squareImage.asKnown().isPresent) 1 else 0)

    class EventWord
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

            /** Returns a mutable builder for constructing an instance of [EventWord]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EventWord]. */
        class Builder internal constructor() {

            private var long_: JsonField<Long> = JsonMissing.of()
            private var short_: JsonField<Short> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(eventWord: EventWord) = apply {
                long_ = eventWord.long_
                short_ = eventWord.short_
                additionalProperties = eventWord.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [EventWord].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): EventWord = EventWord(long_, short_, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): EventWord = apply {
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

            return other is EventWord &&
                long_ == other.long_ &&
                short_ == other.short_ &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(long_, short_, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EventWord{long_=$long_, short_=$short_, additionalProperties=$additionalProperties}"
    }

    class PointWord
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

            /** Returns a mutable builder for constructing an instance of [PointWord]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PointWord]. */
        class Builder internal constructor() {

            private var long_: JsonField<Long> = JsonMissing.of()
            private var short_: JsonField<Short> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pointWord: PointWord) = apply {
                long_ = pointWord.long_
                short_ = pointWord.short_
                additionalProperties = pointWord.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [PointWord].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PointWord = PointWord(long_, short_, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): PointWord = apply {
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

            return other is PointWord &&
                long_ == other.long_ &&
                short_ == other.short_ &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(long_, short_, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PointWord{long_=$long_, short_=$short_, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Sport &&
            backgroundImage == other.backgroundImage &&
            basePeriods == other.basePeriods &&
            clockType == other.clockType &&
            defaultPopularityScore == other.defaultPopularityScore &&
            enabled == other.enabled &&
            eventWord == other.eventWord &&
            extraPeriods == other.extraPeriods &&
            hasMeaningfulHomeAway == other.hasMeaningfulHomeAway &&
            imageIcon == other.imageIcon &&
            name == other.name &&
            pointWord == other.pointWord &&
            shortName == other.shortName &&
            sportId == other.sportId &&
            squareImage == other.squareImage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            backgroundImage,
            basePeriods,
            clockType,
            defaultPopularityScore,
            enabled,
            eventWord,
            extraPeriods,
            hasMeaningfulHomeAway,
            imageIcon,
            name,
            pointWord,
            shortName,
            sportId,
            squareImage,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Sport{backgroundImage=$backgroundImage, basePeriods=$basePeriods, clockType=$clockType, defaultPopularityScore=$defaultPopularityScore, enabled=$enabled, eventWord=$eventWord, extraPeriods=$extraPeriods, hasMeaningfulHomeAway=$hasMeaningfulHomeAway, imageIcon=$imageIcon, name=$name, pointWord=$pointWord, shortName=$shortName, sportId=$sportId, squareImage=$squareImage, additionalProperties=$additionalProperties}"
}
