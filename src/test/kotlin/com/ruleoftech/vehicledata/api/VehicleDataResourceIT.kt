package com.ruleoftech.vehicledata.api

import com.ruleoftech.vehicledata.AbstractIT
import com.ruleoftech.vehicledata.dto.TeknisetTiedotDto
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import kotlin.system.measureTimeMillis

class VehicleDataResourceIT : AbstractIT() {

    val VEHICLES = "/v1/vehicles"

    @Test
    fun `get vehicles`() {
        val took = measureTimeMillis {
            val response: ResponseEntity<Array<TeknisetTiedotDto>> = get(VEHICLES)
            val vehicles = response.body
            assertThat(response.statusCode).isEqualTo(HttpStatus.OK)
            assertThat(vehicles.isNotEmpty()).isTrue()
        }
        println("TOOK: $took ms")
    }
}