// File generated from our OpenAPI spec by Stainless.

package com.sports_odds_api.api.errors

import com.sports_odds_api.api.core.JsonValue
import com.sports_odds_api.api.core.http.Headers

abstract class SportsGameOddsServiceException
protected constructor(message: String, cause: Throwable? = null) :
    SportsGameOddsException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
