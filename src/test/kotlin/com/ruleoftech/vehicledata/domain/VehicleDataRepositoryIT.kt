/*
 * The MIT License
 *
 * Copyright (c) 2018 Population Register Centre
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.ruleoftech.vehicledata.domain

import com.ruleoftech.vehicledata.AbstractIT
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import kotlin.system.measureTimeMillis

class VehicleDataRepositoryIT : AbstractIT() {

    @Autowired
    internal
    lateinit var repository: VehicleDataRepository

//    @Test
//    fun `basic tests`() {
//        measureTimeMillis {
//            val vehicle = TeknisetTiedot(
//                "M1",
//                "1997-01-10",
//                null,
//                "01",
//                null,
//                null,
//                19970110,
//                "5",
//                5,
//                "AC",
//                1,
//                5,
//                1320,
//                1780,
//                1780,
//                4600,
//                1720,
//                null,
//                "01",
//                1780,
//                66.6,
//                4,
//                "false",
//                null,
//                "Volkswagen",
//                "5D PASSAT VARIANT 1.8 CL-351-C/263",
//                null,
//                null,
//                "PASSAT",
//                "05",
//                null,
//                "01",
//                "286",
//                null,
//                365135,
//                "453",
//                "WVWZZZ3AZT",
//                99
//            )
//
//            repository.deleteAll()
//
//            val saved = repository.save(vehicle)
//            assertThat(saved.jarnro).isEqualTo(vehicle.jarnro)
//
//            val fetched = repository.findByMerkkiSelvakielinen(vehicle.merkkiSelvakielinen, OffsetLimitPageable(0, 100))
//            assertThat(fetched[0].jarnro).isEqualTo(vehicle.jarnro)
//        }.apply { println("TOOK: $this ms") }
//    }

    @Test
    fun `find all should return list`() {
        measureTimeMillis {
            val fetched = repository
                .findAllByOrderByJarnroAsc(PageRequest.of(0, 100))

            assertThat(fetched).isNotNull
            assertThat(fetched).isNotEmpty

        }.apply { println("TOOK: $this ms") }
    }

    @Test
    fun `if vehicle model is not found return null`() {
        measureTimeMillis {
            val fetched = repository
                .findByMerkkiSelvakielinen("BMW", PageRequest.of(0, 100))

            assertThat(fetched).isNotNull()
        }.apply { println("TOOK: $this ms") }
    }
}