package com.sports_odds_api.api.errors

class SportsGameOddsInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    SportsGameOddsException(message, cause)
