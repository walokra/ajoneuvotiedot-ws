package com.ruleoftech.vehicledata.service

import com.ruleoftech.exp.ajotektiedot.service.VehicleDataService
import com.ruleoftech.vehicledata.AbstractIT
import com.ruleoftech.vehicledata.extensions.OffsetLimitPageable
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import kotlin.system.measureTimeMillis

class VehicleDataServiceIT : AbstractIT() {

    @Autowired
    internal
    lateinit var service: VehicleDataService

    @Test
    fun `get vehicles`() {
        measureTimeMillis {
            val (vehicles, _) = service.findAll(OffsetLimitPageable(0, 100))
            assertThat(vehicles).isNotNull
            println("vehicles[0]: ${vehicles!![0]}")
        }.apply { println("TOOK: $this ms") }
    }

    @Test
    fun `get vehicle by model`() {
        measureTimeMillis {
            val (vehicles, _) = service.findByModel("Volkswagen", OffsetLimitPageable(0, 100))
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
