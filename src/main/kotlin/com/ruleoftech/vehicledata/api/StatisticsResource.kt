package com.ruleoftech.vehicledata

import com.github.kittinunf.result.map
import com.ruleoftech.exp.ajotektiedot.service.StatisticsService
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Rest Endpoint for getting data.
 */
@RestController()
@RequestMapping("/v1/statistics")
class StatisticsResource internal constructor(
    val service: StatisticsService) {

    private val log = LoggerFactory.getLogger(StatisticsResource::class.java)

    @GetMapping("/total")
    fun countModel(
        @RequestParam(required = false, defaultValue = "0") model: String
    ): ResponseEntity<Long> {
        log.debug(
            "{'method':'findByModel', 'params':{'model'='{}'}", model)
        return service.countByModel(model)
            .map { ResponseEntity.ok(it) }
            .get()
    }
}
