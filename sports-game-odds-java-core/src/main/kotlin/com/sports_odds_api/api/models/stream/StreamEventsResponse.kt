// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.models.stream

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
import com.sports_odds_api.api.models.events.Event
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class StreamEventsResponse
private constructor(
    private val channel: JsonField<String>,
    private val data: JsonField<List<Event>>,
    private val pusherKey: JsonField<String>,
    private val pusherOptions: JsonField<PusherOptions>,
    private val success: JsonField<Boolean>,
    private val user: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("channel") @ExcludeMissing channel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Event>> = JsonMissing.of(),
        @JsonProperty("pusherKey") @ExcludeMissing pusherKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pusherOptions")
        @ExcludeMissing
        pusherOptions: JsonField<PusherOptions> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
    ) : this(channel, data, pusherKey, pusherOptions, success, user, mutableMapOf())

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun channel(): Optional<String> = channel.getOptional("channel")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun data(): Optional<List<Event>> = data.getOptional("data")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pusherKey(): Optional<String> = pusherKey.getOptional("pusherKey")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pusherOptions(): Optional<PusherOptions> = pusherOptions.getOptional("pusherOptions")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun user(): Optional<String> = user.getOptional("user")

    /**
     * Returns the raw JSON value of [channel].
     *
     * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<String> = channel

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Event>> = data

    /**
     * Returns the raw JSON value of [pusherKey].
     *
     * Unlike [pusherKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pusherKey") @ExcludeMissing fun _pusherKey(): JsonField<String> = pusherKey

    /**
     * Returns the raw JSON value of [pusherOptions].
     *
     * Unlike [pusherOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pusherOptions")
    @ExcludeMissing
    fun _pusherOptions(): JsonField<PusherOptions> = pusherOptions

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    /**
     * Returns the raw JSON value of [user].
     *
     * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

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

        /** Returns a mutable builder for constructing an instance of [StreamEventsResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StreamEventsResponse]. */
    class Builder internal constructor() {

        private var channel: JsonField<String> = JsonMissing.of()
        private var data: JsonField<MutableList<Event>>? = null
        private var pusherKey: JsonField<String> = JsonMissing.of()
        private var pusherOptions: JsonField<PusherOptions> = JsonMissing.of()
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var user: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(streamEventsResponse: StreamEventsResponse) = apply {
            channel = streamEventsResponse.channel
            data = streamEventsResponse.data.map { it.toMutableList() }
            pusherKey = streamEventsResponse.pusherKey
            pusherOptions = streamEventsResponse.pusherOptions
            success = streamEventsResponse.success
            user = streamEventsResponse.user
            additionalProperties = streamEventsResponse.additionalProperties.toMutableMap()
        }

        fun channel(channel: String) = channel(JsonField.of(channel))

        /**
         * Sets [Builder.channel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channel] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun channel(channel: JsonField<String>) = apply { this.channel = channel }

        fun data(data: List<Event>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Event>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun data(data: JsonField<List<Event>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Event] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Event) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun pusherKey(pusherKey: String) = pusherKey(JsonField.of(pusherKey))

        /**
         * Sets [Builder.pusherKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pusherKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pusherKey(pusherKey: JsonField<String>) = apply { this.pusherKey = pusherKey }

        fun pusherOptions(pusherOptions: PusherOptions) = pusherOptions(JsonField.of(pusherOptions))

        /**
         * Sets [Builder.pusherOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pusherOptions] with a well-typed [PusherOptions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pusherOptions(pusherOptions: JsonField<PusherOptions>) = apply {
            this.pusherOptions = pusherOptions
        }

        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        fun user(user: String) = user(JsonField.of(user))

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { this.user = user }

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
         * Returns an immutable instance of [StreamEventsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StreamEventsResponse =
            StreamEventsResponse(
                channel,
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                pusherKey,
                pusherOptions,
                success,
                user,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StreamEventsResponse = apply {
        if (validated) {
            return@apply
        }

        channel()
        data().ifPresent { it.forEach { it.validate() } }
        pusherKey()
        pusherOptions().ifPresent { it.validate() }
        success()
        user()
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
        (if (channel.asKnown().isPresent) 1 else 0) +
            (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (pusherKey.asKnown().isPresent) 1 else 0) +
            (pusherOptions.asKnown().getOrNull()?.validity() ?: 0) +
            (if (success.asKnown().isPresent) 1 else 0) +
            (if (user.asKnown().isPresent) 1 else 0)

    class PusherOptions
    private constructor(
        private val channelAuthorization: JsonField<ChannelAuthorization>,
        private val cluster: JsonField<String>,
        private val httpHost: JsonField<String>,
        private val httpPort: JsonField<Long>,
        private val httpsPort: JsonField<Long>,
        private val wsHost: JsonField<String>,
        private val wsPort: JsonField<Long>,
        private val wssPort: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("channelAuthorization")
            @ExcludeMissing
            channelAuthorization: JsonField<ChannelAuthorization> = JsonMissing.of(),
            @JsonProperty("cluster") @ExcludeMissing cluster: JsonField<String> = JsonMissing.of(),
            @JsonProperty("httpHost")
            @ExcludeMissing
            httpHost: JsonField<String> = JsonMissing.of(),
            @JsonProperty("httpPort") @ExcludeMissing httpPort: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("httpsPort")
            @ExcludeMissing
            httpsPort: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("wsHost") @ExcludeMissing wsHost: JsonField<String> = JsonMissing.of(),
            @JsonProperty("wsPort") @ExcludeMissing wsPort: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("wssPort") @ExcludeMissing wssPort: JsonField<Long> = JsonMissing.of(),
        ) : this(
            channelAuthorization,
            cluster,
            httpHost,
            httpPort,
            httpsPort,
            wsHost,
            wsPort,
            wssPort,
            mutableMapOf(),
        )

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun channelAuthorization(): Optional<ChannelAuthorization> =
            channelAuthorization.getOptional("channelAuthorization")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun cluster(): Optional<String> = cluster.getOptional("cluster")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun httpHost(): Optional<String> = httpHost.getOptional("httpHost")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun httpPort(): Optional<Long> = httpPort.getOptional("httpPort")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun httpsPort(): Optional<Long> = httpsPort.getOptional("httpsPort")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun wsHost(): Optional<String> = wsHost.getOptional("wsHost")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun wsPort(): Optional<Long> = wsPort.getOptional("wsPort")

        /**
         * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun wssPort(): Optional<Long> = wssPort.getOptional("wssPort")

        /**
         * Returns the raw JSON value of [channelAuthorization].
         *
         * Unlike [channelAuthorization], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("channelAuthorization")
        @ExcludeMissing
        fun _channelAuthorization(): JsonField<ChannelAuthorization> = channelAuthorization

        /**
         * Returns the raw JSON value of [cluster].
         *
         * Unlike [cluster], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cluster") @ExcludeMissing fun _cluster(): JsonField<String> = cluster

        /**
         * Returns the raw JSON value of [httpHost].
         *
         * Unlike [httpHost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("httpHost") @ExcludeMissing fun _httpHost(): JsonField<String> = httpHost

        /**
         * Returns the raw JSON value of [httpPort].
         *
         * Unlike [httpPort], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("httpPort") @ExcludeMissing fun _httpPort(): JsonField<Long> = httpPort

        /**
         * Returns the raw JSON value of [httpsPort].
         *
         * Unlike [httpsPort], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("httpsPort") @ExcludeMissing fun _httpsPort(): JsonField<Long> = httpsPort

        /**
         * Returns the raw JSON value of [wsHost].
         *
         * Unlike [wsHost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("wsHost") @ExcludeMissing fun _wsHost(): JsonField<String> = wsHost

        /**
         * Returns the raw JSON value of [wsPort].
         *
         * Unlike [wsPort], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("wsPort") @ExcludeMissing fun _wsPort(): JsonField<Long> = wsPort

        /**
         * Returns the raw JSON value of [wssPort].
         *
         * Unlike [wssPort], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("wssPort") @ExcludeMissing fun _wssPort(): JsonField<Long> = wssPort

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

            /** Returns a mutable builder for constructing an instance of [PusherOptions]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PusherOptions]. */
        class Builder internal constructor() {

            private var channelAuthorization: JsonField<ChannelAuthorization> = JsonMissing.of()
            private var cluster: JsonField<String> = JsonMissing.of()
            private var httpHost: JsonField<String> = JsonMissing.of()
            private var httpPort: JsonField<Long> = JsonMissing.of()
            private var httpsPort: JsonField<Long> = JsonMissing.of()
            private var wsHost: JsonField<String> = JsonMissing.of()
            private var wsPort: JsonField<Long> = JsonMissing.of()
            private var wssPort: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pusherOptions: PusherOptions) = apply {
                channelAuthorization = pusherOptions.channelAuthorization
                cluster = pusherOptions.cluster
                httpHost = pusherOptions.httpHost
                httpPort = pusherOptions.httpPort
                httpsPort = pusherOptions.httpsPort
                wsHost = pusherOptions.wsHost
                wsPort = pusherOptions.wsPort
                wssPort = pusherOptions.wssPort
                additionalProperties = pusherOptions.additionalProperties.toMutableMap()
            }

            fun channelAuthorization(channelAuthorization: ChannelAuthorization) =
                channelAuthorization(JsonField.of(channelAuthorization))

            /**
             * Sets [Builder.channelAuthorization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channelAuthorization] with a well-typed
             * [ChannelAuthorization] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun channelAuthorization(channelAuthorization: JsonField<ChannelAuthorization>) =
                apply {
                    this.channelAuthorization = channelAuthorization
                }

            fun cluster(cluster: String) = cluster(JsonField.of(cluster))

            /**
             * Sets [Builder.cluster] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cluster] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cluster(cluster: JsonField<String>) = apply { this.cluster = cluster }

            fun httpHost(httpHost: String) = httpHost(JsonField.of(httpHost))

            /**
             * Sets [Builder.httpHost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.httpHost] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun httpHost(httpHost: JsonField<String>) = apply { this.httpHost = httpHost }

            fun httpPort(httpPort: Long) = httpPort(JsonField.of(httpPort))

            /**
             * Sets [Builder.httpPort] to an arbitrary JSON value.
             *
             * You should usually call [Builder.httpPort] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun httpPort(httpPort: JsonField<Long>) = apply { this.httpPort = httpPort }

            fun httpsPort(httpsPort: Long) = httpsPort(JsonField.of(httpsPort))

            /**
             * Sets [Builder.httpsPort] to an arbitrary JSON value.
             *
             * You should usually call [Builder.httpsPort] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun httpsPort(httpsPort: JsonField<Long>) = apply { this.httpsPort = httpsPort }

            fun wsHost(wsHost: String) = wsHost(JsonField.of(wsHost))

            /**
             * Sets [Builder.wsHost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wsHost] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun wsHost(wsHost: JsonField<String>) = apply { this.wsHost = wsHost }

            fun wsPort(wsPort: Long) = wsPort(JsonField.of(wsPort))

            /**
             * Sets [Builder.wsPort] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wsPort] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun wsPort(wsPort: JsonField<Long>) = apply { this.wsPort = wsPort }

            fun wssPort(wssPort: Long) = wssPort(JsonField.of(wssPort))

            /**
             * Sets [Builder.wssPort] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wssPort] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun wssPort(wssPort: JsonField<Long>) = apply { this.wssPort = wssPort }

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
             * Returns an immutable instance of [PusherOptions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PusherOptions =
                PusherOptions(
                    channelAuthorization,
                    cluster,
                    httpHost,
                    httpPort,
                    httpsPort,
                    wsHost,
                    wsPort,
                    wssPort,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PusherOptions = apply {
            if (validated) {
                return@apply
            }

            channelAuthorization().ifPresent { it.validate() }
            cluster()
            httpHost()
            httpPort()
            httpsPort()
            wsHost()
            wsPort()
            wssPort()
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
            (channelAuthorization.asKnown().getOrNull()?.validity() ?: 0) +
                (if (cluster.asKnown().isPresent) 1 else 0) +
                (if (httpHost.asKnown().isPresent) 1 else 0) +
                (if (httpPort.asKnown().isPresent) 1 else 0) +
                (if (httpsPort.asKnown().isPresent) 1 else 0) +
                (if (wsHost.asKnown().isPresent) 1 else 0) +
                (if (wsPort.asKnown().isPresent) 1 else 0) +
                (if (wssPort.asKnown().isPresent) 1 else 0)

        class ChannelAuthorization
        private constructor(
            private val endpoint: JsonField<String>,
            private val headers: JsonField<Headers>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("endpoint")
                @ExcludeMissing
                endpoint: JsonField<String> = JsonMissing.of(),
                @JsonProperty("headers")
                @ExcludeMissing
                headers: JsonField<Headers> = JsonMissing.of(),
            ) : this(endpoint, headers, mutableMapOf())

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun endpoint(): Optional<String> = endpoint.getOptional("endpoint")

            /**
             * @throws SportsGameOddsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun headers(): Optional<Headers> = headers.getOptional("headers")

            /**
             * Returns the raw JSON value of [endpoint].
             *
             * Unlike [endpoint], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

            /**
             * Returns the raw JSON value of [headers].
             *
             * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<Headers> = headers

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

                /**
                 * Returns a mutable builder for constructing an instance of [ChannelAuthorization].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ChannelAuthorization]. */
            class Builder internal constructor() {

                private var endpoint: JsonField<String> = JsonMissing.of()
                private var headers: JsonField<Headers> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(channelAuthorization: ChannelAuthorization) = apply {
                    endpoint = channelAuthorization.endpoint
                    headers = channelAuthorization.headers
                    additionalProperties = channelAuthorization.additionalProperties.toMutableMap()
                }

                fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

                /**
                 * Sets [Builder.endpoint] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endpoint] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

                fun headers(headers: Headers) = headers(JsonField.of(headers))

                /**
                 * Sets [Builder.headers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.headers] with a well-typed [Headers] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

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
                 * Returns an immutable instance of [ChannelAuthorization].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ChannelAuthorization =
                    ChannelAuthorization(endpoint, headers, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): ChannelAuthorization = apply {
                if (validated) {
                    return@apply
                }

                endpoint()
                headers().ifPresent { it.validate() }
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
                (if (endpoint.asKnown().isPresent) 1 else 0) +
                    (headers.asKnown().getOrNull()?.validity() ?: 0)

            class Headers
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

                    /** Returns a mutable builder for constructing an instance of [Headers]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Headers]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(headers: Headers) = apply {
                        additionalProperties = headers.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Headers].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Headers = Headers(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Headers = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Headers && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Headers{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ChannelAuthorization &&
                    endpoint == other.endpoint &&
                    headers == other.headers &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(endpoint, headers, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ChannelAuthorization{endpoint=$endpoint, headers=$headers, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PusherOptions &&
                channelAuthorization == other.channelAuthorization &&
                cluster == other.cluster &&
                httpHost == other.httpHost &&
                httpPort == other.httpPort &&
                httpsPort == other.httpsPort &&
                wsHost == other.wsHost &&
                wsPort == other.wsPort &&
                wssPort == other.wssPort &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                channelAuthorization,
                cluster,
                httpHost,
                httpPort,
                httpsPort,
                wsHost,
                wsPort,
                wssPort,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PusherOptions{channelAuthorization=$channelAuthorization, cluster=$cluster, httpHost=$httpHost, httpPort=$httpPort, httpsPort=$httpsPort, wsHost=$wsHost, wsPort=$wsPort, wssPort=$wssPort, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StreamEventsResponse &&
            channel == other.channel &&
            data == other.data &&
            pusherKey == other.pusherKey &&
            pusherOptions == other.pusherOptions &&
            success == other.success &&
            user == other.user &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(channel, data, pusherKey, pusherOptions, success, user, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StreamEventsResponse{channel=$channel, data=$data, pusherKey=$pusherKey, pusherOptions=$pusherOptions, success=$success, user=$user, additionalProperties=$additionalProperties}"
}
