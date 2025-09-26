// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.models.account

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.sports_odds_api.api.core.BaseDeserializer
import com.sports_odds_api.api.core.BaseSerializer
import com.sports_odds_api.api.core.Enum
import com.sports_odds_api.api.core.ExcludeMissing
import com.sports_odds_api.api.core.JsonField
import com.sports_odds_api.api.core.JsonMissing
import com.sports_odds_api.api.core.JsonValue
import com.sports_odds_api.api.core.allMaxBy
import com.sports_odds_api.api.core.getOrThrow
import com.sports_odds_api.api.errors.SportsGameOddsInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RateLimitInterval
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val currentEntities: JsonField<Long>,
    private val currentRequests: JsonField<Long>,
    private val maxEntities: JsonField<MaxEntities>,
    private val maxRequests: JsonField<MaxRequests>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("current-entities")
        @ExcludeMissing
        currentEntities: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("current-requests")
        @ExcludeMissing
        currentRequests: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max-entities")
        @ExcludeMissing
        maxEntities: JsonField<MaxEntities> = JsonMissing.of(),
        @JsonProperty("max-requests")
        @ExcludeMissing
        maxRequests: JsonField<MaxRequests> = JsonMissing.of(),
    ) : this(currentEntities, currentRequests, maxEntities, maxRequests, mutableMapOf())

    /**
     * Current number of entities accessed in the interval
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currentEntities(): Optional<Long> = currentEntities.getOptional("current-entities")

    /**
     * Current number of requests made in the interval
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currentRequests(): Optional<Long> = currentRequests.getOptional("current-requests")

    /**
     * Maximum allowed entity accesses in the interval
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxEntities(): Optional<MaxEntities> = maxEntities.getOptional("max-entities")

    /**
     * Maximum allowed requests in the interval
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxRequests(): Optional<MaxRequests> = maxRequests.getOptional("max-requests")

    /**
     * Returns the raw JSON value of [currentEntities].
     *
     * Unlike [currentEntities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current-entities")
    @ExcludeMissing
    fun _currentEntities(): JsonField<Long> = currentEntities

    /**
     * Returns the raw JSON value of [currentRequests].
     *
     * Unlike [currentRequests], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current-requests")
    @ExcludeMissing
    fun _currentRequests(): JsonField<Long> = currentRequests

    /**
     * Returns the raw JSON value of [maxEntities].
     *
     * Unlike [maxEntities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max-entities")
    @ExcludeMissing
    fun _maxEntities(): JsonField<MaxEntities> = maxEntities

    /**
     * Returns the raw JSON value of [maxRequests].
     *
     * Unlike [maxRequests], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max-requests")
    @ExcludeMissing
    fun _maxRequests(): JsonField<MaxRequests> = maxRequests

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

        /** Returns a mutable builder for constructing an instance of [RateLimitInterval]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RateLimitInterval]. */
    class Builder internal constructor() {

        private var currentEntities: JsonField<Long> = JsonMissing.of()
        private var currentRequests: JsonField<Long> = JsonMissing.of()
        private var maxEntities: JsonField<MaxEntities> = JsonMissing.of()
        private var maxRequests: JsonField<MaxRequests> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rateLimitInterval: RateLimitInterval) = apply {
            currentEntities = rateLimitInterval.currentEntities
            currentRequests = rateLimitInterval.currentRequests
            maxEntities = rateLimitInterval.maxEntities
            maxRequests = rateLimitInterval.maxRequests
            additionalProperties = rateLimitInterval.additionalProperties.toMutableMap()
        }

        /** Current number of entities accessed in the interval */
        fun currentEntities(currentEntities: Long) = currentEntities(JsonField.of(currentEntities))

        /**
         * Sets [Builder.currentEntities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentEntities] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentEntities(currentEntities: JsonField<Long>) = apply {
            this.currentEntities = currentEntities
        }

        /** Current number of requests made in the interval */
        fun currentRequests(currentRequests: Long) = currentRequests(JsonField.of(currentRequests))

        /**
         * Sets [Builder.currentRequests] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentRequests] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentRequests(currentRequests: JsonField<Long>) = apply {
            this.currentRequests = currentRequests
        }

        /** Maximum allowed entity accesses in the interval */
        fun maxEntities(maxEntities: MaxEntities) = maxEntities(JsonField.of(maxEntities))

        /**
         * Sets [Builder.maxEntities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxEntities] with a well-typed [MaxEntities] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxEntities(maxEntities: JsonField<MaxEntities>) = apply {
            this.maxEntities = maxEntities
        }

        /** Alias for calling [maxEntities] with `MaxEntities.ofUnionMember0(unionMember0)`. */
        fun maxEntities(unionMember0: MaxEntities.UnionMember0) =
            maxEntities(MaxEntities.ofUnionMember0(unionMember0))

        /** Alias for calling [maxEntities] with `MaxEntities.ofInteger(integer)`. */
        fun maxEntities(integer: Long) = maxEntities(MaxEntities.ofInteger(integer))

        /** Maximum allowed requests in the interval */
        fun maxRequests(maxRequests: MaxRequests) = maxRequests(JsonField.of(maxRequests))

        /**
         * Sets [Builder.maxRequests] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxRequests] with a well-typed [MaxRequests] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxRequests(maxRequests: JsonField<MaxRequests>) = apply {
            this.maxRequests = maxRequests
        }

        /** Alias for calling [maxRequests] with `MaxRequests.ofUnionMember0(unionMember0)`. */
        fun maxRequests(unionMember0: MaxRequests.UnionMember0) =
            maxRequests(MaxRequests.ofUnionMember0(unionMember0))

        /** Alias for calling [maxRequests] with `MaxRequests.ofInteger(integer)`. */
        fun maxRequests(integer: Long) = maxRequests(MaxRequests.ofInteger(integer))

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
         * Returns an immutable instance of [RateLimitInterval].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RateLimitInterval =
            RateLimitInterval(
                currentEntities,
                currentRequests,
                maxEntities,
                maxRequests,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RateLimitInterval = apply {
        if (validated) {
            return@apply
        }

        currentEntities()
        currentRequests()
        maxEntities().ifPresent { it.validate() }
        maxRequests().ifPresent { it.validate() }
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
        (if (currentEntities.asKnown().isPresent) 1 else 0) +
            (if (currentRequests.asKnown().isPresent) 1 else 0) +
            (maxEntities.asKnown().getOrNull()?.validity() ?: 0) +
            (maxRequests.asKnown().getOrNull()?.validity() ?: 0)

    /** Maximum allowed entity accesses in the interval */
    @JsonDeserialize(using = MaxEntities.Deserializer::class)
    @JsonSerialize(using = MaxEntities.Serializer::class)
    class MaxEntities
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val integer: Long? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun integer(): Optional<Long> = Optional.ofNullable(integer)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isInteger(): Boolean = integer != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asInteger(): Long = integer.getOrThrow("integer")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                integer != null -> visitor.visitInteger(integer)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): MaxEntities = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
                    }

                    override fun visitInteger(integer: Long) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) =
                        unionMember0.validity()

                    override fun visitInteger(integer: Long) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MaxEntities &&
                unionMember0 == other.unionMember0 &&
                integer == other.integer
        }

        override fun hashCode(): Int = Objects.hash(unionMember0, integer)

        override fun toString(): String =
            when {
                unionMember0 != null -> "MaxEntities{unionMember0=$unionMember0}"
                integer != null -> "MaxEntities{integer=$integer}"
                _json != null -> "MaxEntities{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid MaxEntities")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) =
                MaxEntities(unionMember0 = unionMember0)

            @JvmStatic fun ofInteger(integer: Long) = MaxEntities(integer = integer)
        }

        /**
         * An interface that defines how to map each variant of [MaxEntities] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitInteger(integer: Long): T

            /**
             * Maps an unknown variant of [MaxEntities] to a value of type [T].
             *
             * An instance of [MaxEntities] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws SportsGameOddsInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw SportsGameOddsInvalidDataException("Unknown MaxEntities: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<MaxEntities>(MaxEntities::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): MaxEntities {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                MaxEntities(unionMember0 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                MaxEntities(integer = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> MaxEntities(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<MaxEntities>(MaxEntities::class) {

            override fun serialize(
                value: MaxEntities,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.integer != null -> generator.writeObject(value.integer)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid MaxEntities")
                }
            }
        }

        class UnionMember0 @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val UNLIMITED = of("unlimited")

                @JvmStatic fun of(value: String) = UnionMember0(JsonField.of(value))
            }

            /** An enum containing [UnionMember0]'s known values. */
            enum class Known {
                UNLIMITED
            }

            /**
             * An enum containing [UnionMember0]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [UnionMember0] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                UNLIMITED,
                /**
                 * An enum member indicating that [UnionMember0] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    UNLIMITED -> Value.UNLIMITED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws SportsGameOddsInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    UNLIMITED -> Known.UNLIMITED
                    else -> throw SportsGameOddsInvalidDataException("Unknown UnionMember0: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws SportsGameOddsInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    SportsGameOddsInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): UnionMember0 = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember0 && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }
    }

    /** Maximum allowed requests in the interval */
    @JsonDeserialize(using = MaxRequests.Deserializer::class)
    @JsonSerialize(using = MaxRequests.Serializer::class)
    class MaxRequests
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val integer: Long? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun integer(): Optional<Long> = Optional.ofNullable(integer)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isInteger(): Boolean = integer != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asInteger(): Long = integer.getOrThrow("integer")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                integer != null -> visitor.visitInteger(integer)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): MaxRequests = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
                    }

                    override fun visitInteger(integer: Long) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) =
                        unionMember0.validity()

                    override fun visitInteger(integer: Long) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MaxRequests &&
                unionMember0 == other.unionMember0 &&
                integer == other.integer
        }

        override fun hashCode(): Int = Objects.hash(unionMember0, integer)

        override fun toString(): String =
            when {
                unionMember0 != null -> "MaxRequests{unionMember0=$unionMember0}"
                integer != null -> "MaxRequests{integer=$integer}"
                _json != null -> "MaxRequests{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid MaxRequests")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) =
                MaxRequests(unionMember0 = unionMember0)

            @JvmStatic fun ofInteger(integer: Long) = MaxRequests(integer = integer)
        }

        /**
         * An interface that defines how to map each variant of [MaxRequests] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitInteger(integer: Long): T

            /**
             * Maps an unknown variant of [MaxRequests] to a value of type [T].
             *
             * An instance of [MaxRequests] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws SportsGameOddsInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw SportsGameOddsInvalidDataException("Unknown MaxRequests: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<MaxRequests>(MaxRequests::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): MaxRequests {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                MaxRequests(unionMember0 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                MaxRequests(integer = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> MaxRequests(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<MaxRequests>(MaxRequests::class) {

            override fun serialize(
                value: MaxRequests,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.integer != null -> generator.writeObject(value.integer)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid MaxRequests")
                }
            }
        }

        class UnionMember0 @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val UNLIMITED = of("unlimited")

                @JvmStatic fun of(value: String) = UnionMember0(JsonField.of(value))
            }

            /** An enum containing [UnionMember0]'s known values. */
            enum class Known {
                UNLIMITED
            }

            /**
             * An enum containing [UnionMember0]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [UnionMember0] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                UNLIMITED,
                /**
                 * An enum member indicating that [UnionMember0] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    UNLIMITED -> Value.UNLIMITED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws SportsGameOddsInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    UNLIMITED -> Known.UNLIMITED
                    else -> throw SportsGameOddsInvalidDataException("Unknown UnionMember0: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws SportsGameOddsInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    SportsGameOddsInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): UnionMember0 = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember0 && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RateLimitInterval &&
            currentEntities == other.currentEntities &&
            currentRequests == other.currentRequests &&
            maxEntities == other.maxEntities &&
            maxRequests == other.maxRequests &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            currentEntities,
            currentRequests,
            maxEntities,
            maxRequests,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RateLimitInterval{currentEntities=$currentEntities, currentRequests=$currentRequests, maxEntities=$maxEntities, maxRequests=$maxRequests, additionalProperties=$additionalProperties}"
}
