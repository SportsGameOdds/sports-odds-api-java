package com.sports_odds_api.api.errors

open class SportsGameOddsException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
