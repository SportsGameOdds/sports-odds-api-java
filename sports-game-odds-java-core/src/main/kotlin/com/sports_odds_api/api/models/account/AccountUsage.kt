// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.models.account

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.sports_odds_api.api.core.ExcludeMissing
import com.sports_odds_api.api.core.JsonField
import com.sports_odds_api.api.core.JsonMissing
import com.sports_odds_api.api.core.JsonValue
import com.sports_odds_api.api.errors.SportsGameOddsInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AccountUsage
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val customerId: JsonField<String>,
    private val email: JsonField<String>,
    private val isActive: JsonField<Boolean>,
    private val keyId: JsonField<String>,
    private val rateLimits: JsonField<RateLimits>,
    private val tier: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("customerID")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isActive") @ExcludeMissing isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("keyID") @ExcludeMissing keyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rateLimits")
        @ExcludeMissing
        rateLimits: JsonField<RateLimits> = JsonMissing.of(),
        @JsonProperty("tier") @ExcludeMissing tier: JsonField<String> = JsonMissing.of(),
    ) : this(customerId, email, isActive, keyId, rateLimits, tier, mutableMapOf())

    /**
     * The Stripe customer ID for the account
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customerId(): Optional<String> = customerId.getOptional("customerID")

    /**
     * The email address associated with the account
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * Whether the API key is active
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun isActive(): Optional<Boolean> = isActive.getOptional("isActive")

    /**
     * The hashed identifier for the API key
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun keyId(): Optional<String> = keyId.getOptional("keyID")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rateLimits(): Optional<RateLimits> = rateLimits.getOptional("rateLimits")

    /**
     * The current subscription tier
     *
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tier(): Optional<String> = tier.getOptional("tier")

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customerID") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isActive") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

    /**
     * Returns the raw JSON value of [keyId].
     *
     * Unlike [keyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("keyID") @ExcludeMissing fun _keyId(): JsonField<String> = keyId

    /**
     * Returns the raw JSON value of [rateLimits].
     *
     * Unlike [rateLimits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rateLimits")
    @ExcludeMissing
    fun _rateLimits(): JsonField<RateLimits> = rateLimits

    /**
     * Returns the raw JSON value of [tier].
     *
     * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<String> = tier

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

        /** Returns a mutable builder for constructing an instance of [AccountUsage]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountUsage]. */
    class Builder internal constructor() {

        private var customerId: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var isActive: JsonField<Boolean> = JsonMissing.of()
        private var keyId: JsonField<String> = JsonMissing.of()
        private var rateLimits: JsonField<RateLimits> = JsonMissing.of()
        private var tier: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountUsage: AccountUsage) = apply {
            customerId = accountUsage.customerId
            email = accountUsage.email
            isActive = accountUsage.isActive
            keyId = accountUsage.keyId
            rateLimits = accountUsage.rateLimits
            tier = accountUsage.tier
            additionalProperties = accountUsage.additionalProperties.toMutableMap()
        }

        /** The Stripe customer ID for the account */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /** The email address associated with the account */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** Whether the API key is active */
        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        /** The hashed identifier for the API key */
        fun keyId(keyId: String) = keyId(JsonField.of(keyId))

        /**
         * Sets [Builder.keyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keyId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun keyId(keyId: JsonField<String>) = apply { this.keyId = keyId }

        fun rateLimits(rateLimits: RateLimits) = rateLimits(JsonField.of(rateLimits))

        /**
         * Sets [Builder.rateLimits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rateLimits] with a well-typed [RateLimits] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rateLimits(rateLimits: JsonField<RateLimits>) = apply { this.rateLimits = rateLimits }

        /** The current subscription tier */
        fun tier(tier: String) = tier(JsonField.of(tier))

        /**
         * Sets [Builder.tier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tier] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tier(tier: JsonField<String>) = apply { this.tier = tier }

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
         * Returns an immutable instance of [AccountUsage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AccountUsage =
            AccountUsage(
                customerId,
                email,
                isActive,
                keyId,
                rateLimits,
                tier,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccountUsage = apply {
        if (validated) {
            return@apply
        }

        customerId()
        email()
        isActive()
        keyId()
        rateLimits().ifPresent { it.validate() }
        tier()
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
        (if (customerId.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (isActive.asKnown().isPresent) 1 else 0) +
            (if (keyId.asKnown().isPresent) 1 else 0) +
            (rateLimits.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tier.asKnown().isPresent) 1 else 0)

    class RateLimits
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val perDay: JsonField<RateLimitInterval>,
        private val perHour: JsonField<RateLimitInterval>,
        private val perMinute: JsonField<RateLimitInterval>,
        private val perMonth: JsonField<RateLimitInterval>,
        private val perSecond: JsonField<RateLimitInterval>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("per-day")
            @ExcludeMissing
            perDay: JsonField<RateLimitInterval> = JsonMissing.of(),
            @JsonProperty("per-hour")
            @ExcludeMissing
            perHour: JsonField<RateLimitInterval> = JsonMissing.of(),
            @JsonProperty("per-minute")
            @ExcludeMissing
            perMinute: JsonField<RateLimitInterval> = JsonMissing.of(),
            @JsonProperty("per-month")
            @ExcludeMissing
            perMonth: JsonField<RateLimitInterval> = JsonMissing.of(),
            @JsonProperty("per-second")
            @ExcludeMissing
            perSecond: JsonField<RateLimitInterval> = JsonMissing.of(),
        ) : this(perDay, perHour, perMinute, perMonth, perSecond, mutableMapOf())

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun perDay(): Optional<RateLimitInterval> = perDay.getOptional("per-day")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun perHour(): Optional<RateLimitInterval> = perHour.getOptional("per-hour")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun perMinute(): Optional<RateLimitInterval> = perMinute.getOptional("per-minute")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun perMonth(): Optional<RateLimitInterval> = perMonth.getOptional("per-month")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun perSecond(): Optional<RateLimitInterval> = perSecond.getOptional("per-second")

        /**
         * Returns the raw JSON value of [perDay].
         *
         * Unlike [perDay], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("per-day")
        @ExcludeMissing
        fun _perDay(): JsonField<RateLimitInterval> = perDay

        /**
         * Returns the raw JSON value of [perHour].
         *
         * Unlike [perHour], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("per-hour")
        @ExcludeMissing
        fun _perHour(): JsonField<RateLimitInterval> = perHour

        /**
         * Returns the raw JSON value of [perMinute].
         *
         * Unlike [perMinute], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("per-minute")
        @ExcludeMissing
        fun _perMinute(): JsonField<RateLimitInterval> = perMinute

        /**
         * Returns the raw JSON value of [perMonth].
         *
         * Unlike [perMonth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("per-month")
        @ExcludeMissing
        fun _perMonth(): JsonField<RateLimitInterval> = perMonth

        /**
         * Returns the raw JSON value of [perSecond].
         *
         * Unlike [perSecond], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("per-second")
        @ExcludeMissing
        fun _perSecond(): JsonField<RateLimitInterval> = perSecond

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

            /** Returns a mutable builder for constructing an instance of [RateLimits]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RateLimits]. */
        class Builder internal constructor() {

            private var perDay: JsonField<RateLimitInterval> = JsonMissing.of()
            private var perHour: JsonField<RateLimitInterval> = JsonMissing.of()
            private var perMinute: JsonField<RateLimitInterval> = JsonMissing.of()
            private var perMonth: JsonField<RateLimitInterval> = JsonMissing.of()
            private var perSecond: JsonField<RateLimitInterval> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rateLimits: RateLimits) = apply {
                perDay = rateLimits.perDay
                perHour = rateLimits.perHour
                perMinute = rateLimits.perMinute
                perMonth = rateLimits.perMonth
                perSecond = rateLimits.perSecond
                additionalProperties = rateLimits.additionalProperties.toMutableMap()
            }

            fun perDay(perDay: RateLimitInterval) = perDay(JsonField.of(perDay))

            /**
             * Sets [Builder.perDay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.perDay] with a well-typed [RateLimitInterval] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun perDay(perDay: JsonField<RateLimitInterval>) = apply { this.perDay = perDay }

            fun perHour(perHour: RateLimitInterval) = perHour(JsonField.of(perHour))

            /**
             * Sets [Builder.perHour] to an arbitrary JSON value.
             *
             * You should usually call [Builder.perHour] with a well-typed [RateLimitInterval] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun perHour(perHour: JsonField<RateLimitInterval>) = apply { this.perHour = perHour }

            fun perMinute(perMinute: RateLimitInterval) = perMinute(JsonField.of(perMinute))

            /**
             * Sets [Builder.perMinute] to an arbitrary JSON value.
             *
             * You should usually call [Builder.perMinute] with a well-typed [RateLimitInterval]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun perMinute(perMinute: JsonField<RateLimitInterval>) = apply {
                this.perMinute = perMinute
            }

            fun perMonth(perMonth: RateLimitInterval) = perMonth(JsonField.of(perMonth))

            /**
             * Sets [Builder.perMonth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.perMonth] with a well-typed [RateLimitInterval]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun perMonth(perMonth: JsonField<RateLimitInterval>) = apply {
                this.perMonth = perMonth
            }

            fun perSecond(perSecond: RateLimitInterval) = perSecond(JsonField.of(perSecond))

            /**
             * Sets [Builder.perSecond] to an arbitrary JSON value.
             *
             * You should usually call [Builder.perSecond] with a well-typed [RateLimitInterval]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun perSecond(perSecond: JsonField<RateLimitInterval>) = apply {
                this.perSecond = perSecond
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
             * Returns an immutable instance of [RateLimits].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RateLimits =
                RateLimits(
                    perDay,
                    perHour,
                    perMinute,
                    perMonth,
                    perSecond,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RateLimits = apply {
            if (validated) {
                return@apply
            }

            perDay().ifPresent { it.validate() }
            perHour().ifPresent { it.validate() }
            perMinute().ifPresent { it.validate() }
            perMonth().ifPresent { it.validate() }
            perSecond().ifPresent { it.validate() }
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
            (perDay.asKnown().getOrNull()?.validity() ?: 0) +
                (perHour.asKnown().getOrNull()?.validity() ?: 0) +
                (perMinute.asKnown().getOrNull()?.validity() ?: 0) +
                (perMonth.asKnown().getOrNull()?.validity() ?: 0) +
                (perSecond.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RateLimits &&
                perDay == other.perDay &&
                perHour == other.perHour &&
                perMinute == other.perMinute &&
                perMonth == other.perMonth &&
                perSecond == other.perSecond &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(perDay, perHour, perMinute, perMonth, perSecond, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RateLimits{perDay=$perDay, perHour=$perHour, perMinute=$perMinute, perMonth=$perMonth, perSecond=$perSecond, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountUsage &&
            customerId == other.customerId &&
            email == other.email &&
            isActive == other.isActive &&
            keyId == other.keyId &&
            rateLimits == other.rateLimits &&
            tier == other.tier &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(customerId, email, isActive, keyId, rateLimits, tier, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountUsage{customerId=$customerId, email=$email, isActive=$isActive, keyId=$keyId, rateLimits=$rateLimits, tier=$tier, additionalProperties=$additionalProperties}"
}
