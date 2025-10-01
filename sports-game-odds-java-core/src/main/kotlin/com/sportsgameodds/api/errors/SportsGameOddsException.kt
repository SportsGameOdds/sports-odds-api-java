package com.sportsgameodds.api.errors

open class SportsGameOddsException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
