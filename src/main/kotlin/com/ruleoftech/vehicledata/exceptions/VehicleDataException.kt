package com.ruleoftech.vehicledata.exceptions

import org.springframework.http.HttpStatus

abstract class VehicleDataException(
    val status: HttpStatus = HttpStatus.BAD_REQUEST,
    override val message: String,
    val errors: List<String>
) : RuntimeException() {

    fun toErrorDto(): ErrorDto = ErrorDto(
        status = this.status.value(),
        message = this.message,
        errors = errors
    )

    override fun toString(): String {
        return "VehicleDataException(status=$status, message='$message', errors=$errors)"
    }
}