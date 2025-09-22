// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.sports_odds_api.api.core.ExcludeMissing
import com.sports_odds_api.api.core.JsonField
import com.sports_odds_api.api.core.JsonMissing
import com.sports_odds_api.api.core.JsonValue
import com.sports_odds_api.api.core.contentEquals
import com.sports_odds_api.api.core.contentHash
import com.sports_odds_api.api.core.contentToString
import com.sports_odds_api.api.errors.SportsGameOddsInvalidDataException
import java.util.Collections

class DataEnvelope<T : Any>
private constructor(
    private val data: JsonField<T>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<T> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    fun data(): T = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<T> = data

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    private var validated: Boolean = false

    fun validate(): DataEnvelope<T> = apply {
        if (validated) {
            return@apply
        }

        data()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: SportsGameOddsInvalidDataException) {
            false
        }

    fun toBuilder() = Builder<T>().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataEnvelope<*> &&
            data contentEquals other.data &&
            additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int = contentHash(data, additionalProperties)

    override fun toString() =
        "DataEnvelope{data=${data.contentToString()}, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun <T : Any> builder() = Builder<T>()
    }

    class Builder<T : Any> {

        private var data: JsonField<T> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(DataEnvelope: DataEnvelope<T>) = apply {
            this.data = DataEnvelope.data
            this.additionalProperties.putAll(DataEnvelope.additionalProperties)
        }

        fun data(data: T) = data(JsonField.of(data))

        fun data(data: JsonField<T>) = apply { this.data = data }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun build() = DataEnvelope(data, additionalProperties.toMutableMap())
    }
}
