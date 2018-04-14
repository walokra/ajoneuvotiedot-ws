package com.ruleoftech.vehicledata

import com.github.kittinunf.result.map
import com.ruleoftech.exp.ajotektiedot.service.VehicleDataService
import com.ruleoftech.vehicledata.dto.TeknisetTiedotViewDto
import org.slf4j.LoggerFactory
import org.springframework.data.domain.PageRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Rest Endpoint for getting data.
 */
@RestController()
@RequestMapping("/v1/vehicles")
class VehicleDataResource internal constructor(
    val service: VehicleDataService) {

    private val log = LoggerFactory.getLogger(VehicleDataResource::class.java)

    @GetMapping()
    fun findAll(
        @RequestParam(required = true, defaultValue = "0") offset: Int,
        @RequestParam(required = true, defaultValue = "100") limit: Int
    ): ResponseEntity<List<TeknisetTiedotViewDto>> {
        val pageable = PageRequest.of(offset, limit)

        return service.findAll(pageable)
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
    ): ResponseEntity<List<TeknisetTiedotViewDto>> {
        log.debug(
            "{'method':'findByModel', 'params':{'merkki'='{}', 'offset'={}, 'limit'={}}", model, offset, limit)
        return service.findByModel(model, PageRequest.of(offset, limit))
            .map {
                it.map {
                    it.toDto()
                }
            }
            .map { ResponseEntity.ok(it) }
            .get()
    }

    @GetMapping("/count")
    fun count(
    ): ResponseEntity<Long> {
        log.debug(
            "{'method':'count'}")
        return service.count()
            .map { ResponseEntity.ok(it) }
            .get()
    }
}
