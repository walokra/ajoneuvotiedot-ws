package com.ruleoftech.vehicledata.exceptions

import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus

class EntityNotFound
private constructor() : VehicleDataException(
    status = HttpStatus.NOT_FOUND,
    message = "Entity not found",
    errors = emptyList()) {

    companion object : () -> Exception {
        private val log = LoggerFactory.getLogger(this::class.java)

        override fun invoke(): Exception {
            val e = EntityNotFound()
            log.info(e.toString())
            return e
        }
    }
}