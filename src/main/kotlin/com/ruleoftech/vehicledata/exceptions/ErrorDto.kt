package com.ruleoftech.vehicledata.exceptions

import org.springframework.http.HttpStatus

data class ErrorDto(
    val status: Int = HttpStatus.BAD_REQUEST.value(),
    val message: String = "Unknown error",
    val errors: List<String> = emptyList()
) {
    constructor(
        status: Int,
        message: String,
        error: String
    ) : this(status, message, listOf(error))
}