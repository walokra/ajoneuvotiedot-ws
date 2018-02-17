package com.ruleoftech.vehicledata

import com.github.kittinunf.result.map
import com.ruleoftech.vehicledata.dto.TeknisetTiedotDto

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

import com.ruleoftech.exp.ajotektiedot.service.TeknisetTiedotService
import org.springframework.data.domain.Page
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

/**
 * Rest Endpoint for getting data.
 */
@RestController()
@RequestMapping("/v1/vehicles")
class VehicleDataResource internal constructor(
    val service: TeknisetTiedotService) {

    private val log = LoggerFactory.getLogger(VehicleDataResource::class.java)

    @GetMapping()
    fun findAll(
        @RequestParam(required = false, defaultValue = "0") offset: Int,
        @RequestParam(required = false, defaultValue = "100") limit: Int
    ): ResponseEntity<Page<TeknisetTiedotDto>> {
        return service.findAll(offset, limit)
            .map {
                it.map {
                    it.toDto()
                }
            }
            .map { ResponseEntity.ok(it) }
            .get()
    }

    @GetMapping("/search")
    fun findByModel(
        @PathVariable("model") model: String,
        @RequestParam(required = false, defaultValue = "0") offset: Int,
        @RequestParam(required = false, defaultValue = "100") limit: Int
    ): ResponseEntity<Page<TeknisetTiedotDto>> {
        log.debug(
            "{'method':'findByModel', 'params':{'merkki'='{}', 'offset'={}, 'limit'={}}", model, offset, limit)
        return service.findByModel(model, offset, limit)
            .map {
                it.map {
                    it.toDto()
                }
            }
            .map { ResponseEntity.ok(it) }
            .get()
    }
}
