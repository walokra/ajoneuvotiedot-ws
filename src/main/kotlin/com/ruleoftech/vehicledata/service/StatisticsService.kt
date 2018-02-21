package com.ruleoftech.exp.ajotektiedot.service

import com.github.kittinunf.result.*
import com.ruleoftech.vehicledata.domain.StatisticsRepository
import com.ruleoftech.vehicledata.domain.TeknisetTiedot
import com.ruleoftech.vehicledata.domain.TeknisetTiedotView
import com.ruleoftech.vehicledata.domain.VehicleDataRepository
import com.ruleoftech.vehicledata.exceptions.EntityNotFound
import com.ruleoftech.vehicledata.extensions.OffsetLimitPageable
import org.springframework.stereotype.Service

import org.slf4j.LoggerFactory
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import javax.persistence.NamedNativeQueries
import javax.transaction.Transactional

@Service
@Transactional(rollbackOn = [(Exception::class)])
internal class StatisticsService constructor(
    val repository: StatisticsRepository) {

    fun countByModel(model: String) =
        Result.of {
            repository
                .countByModel(model)
        }

    companion object {
        private val log = LoggerFactory.getLogger(this::class.java)
    }
}
