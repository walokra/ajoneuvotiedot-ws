package com.ruleoftech.exp.ajotektiedot.service

import com.github.kittinunf.result.*
import com.ruleoftech.vehicledata.domain.StatisticsRepository
import org.springframework.stereotype.Service

import org.slf4j.LoggerFactory
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
