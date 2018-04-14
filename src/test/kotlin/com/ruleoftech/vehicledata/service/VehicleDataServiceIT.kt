package com.ruleoftech.vehicledata.service

import com.ruleoftech.exp.ajotektiedot.service.VehicleDataService
import com.ruleoftech.vehicledata.AbstractIT
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import kotlin.system.measureTimeMillis

class VehicleDataServiceIT : AbstractIT() {

    @Autowired
    internal
    lateinit var service: VehicleDataService

    @Test
    fun `get vehicles`() {
        measureTimeMillis {
            val (vehicles, _) = service.findAll(PageRequest.of(0, 100))
            assertThat(vehicles).isNotNull
            println("vehicles[0]: ${vehicles!![0]}")
        }.apply { println("TOOK: $this ms") }
    }

    @Test
    fun `get vehicle by model`() {
        measureTimeMillis {
            val (vehicles, _) = service.findByModel("Volkswagen", PageRequest.of(0, 100))
            assertThat(vehicles).isNotNull
            println("vehicles[0]: ${vehicles!![0]}")
        }.apply { println("TOOK: $this ms") }
    }

    @Test
    fun `get count`() {
        measureTimeMillis {
            val (count, _) = service.count()
            assertThat(count).isGreaterThan(1)
            println("count: $count")
        }.apply { println("TOOK: $this ms") }
    }
}
