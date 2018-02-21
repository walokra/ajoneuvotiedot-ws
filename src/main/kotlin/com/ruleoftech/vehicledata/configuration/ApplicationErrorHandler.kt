package com.ruleoftech.vehicledata.configuration

import com.ruleoftech.vehicledata.exceptions.ErrorDto
import org.slf4j.LoggerFactory
import org.springframework.core.annotation.Order
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException
import javax.validation.ConstraintViolationException

@ControllerAdvice
@Order(20)
class ApplicationErrorHandler {

    private val log = LoggerFactory.getLogger(ApplicationErrorHandler::class.java)

    // 500

    @ExceptionHandler(Exception::class)
    fun handleAll(ex: Exception, request: WebRequest): ResponseEntity<ErrorDto> {
        log.error("Generic handler: ${ex::class.java.name}: ${ex.message}")
        val status = HttpStatus.INTERNAL_SERVER_ERROR
        val apiError = ErrorDto(status.value(), ex.message ?: "Unknown error", "error occurred")
        return ResponseEntity(apiError, HttpHeaders(), status)
    }

    //

    @ExceptionHandler(MethodArgumentTypeMismatchException::class)
    fun handleMethodArgumentTypeMismatch(ex: MethodArgumentTypeMismatchException, request: WebRequest): ResponseEntity<Any> {
        log.info(ex::class.java.name)

        val error = "${ex.name} should be of type ${ex.requiredType.name}"

        val status = HttpStatus.BAD_REQUEST
        val apiError = ErrorDto(status.value(), ex.message ?: "Unknown error", error)
        return ResponseEntity(apiError, HttpHeaders(), status)
    }

    @ExceptionHandler(ConstraintViolationException::class)
    fun handleConstraintViolation(ex: ConstraintViolationException, request: WebRequest): ResponseEntity<Any> {
        log.info(ex::class.java.name)

        val errors = ex.constraintViolations.map { "${it.rootBeanClass.name} ${it.propertyPath}: ${it.message}" }

        val status = HttpStatus.BAD_REQUEST
        val apiError = ErrorDto(status.value(), ex.message ?: "Unknown error", errors)
        return ResponseEntity(apiError, HttpHeaders(), status)
    }
}