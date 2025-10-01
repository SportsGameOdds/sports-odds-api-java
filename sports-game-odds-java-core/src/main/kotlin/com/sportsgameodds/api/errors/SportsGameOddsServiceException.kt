// File generated from our OpenAPI spec by Stainless.

package com.sportsgameodds.api.errors

import com.sportsgameodds.api.core.JsonValue
import com.sportsgameodds.api.core.http.Headers

abstract class SportsGameOddsServiceException
protected constructor(message: String, cause: Throwable? = null) :
    SportsGameOddsException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
