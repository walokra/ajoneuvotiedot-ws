package com.ruleoftech.exp.ajotektiedot.service

import com.github.kittinunf.result.*
import com.ruleoftech.vehicledata.domain.TeknisetTiedot
import com.ruleoftech.vehicledata.domain.TeknisetTiedotView
import com.ruleoftech.vehicledata.domain.VehicleDataRepository
import com.ruleoftech.vehicledata.exceptions.EntityNotFound
import com.ruleoftech.vehicledata.extensions.OffsetLimitPageable
import org.springframework.stereotype.Service

import org.slf4j.LoggerFactory
import javax.transaction.Transactional

@Service
@Transactional(rollbackOn = [(Exception::class)])
internal class VehicleDataService constructor(
    val repository: VehicleDataRepository) {

    fun findAll(pageable: OffsetLimitPageable): Result<List<TeknisetTiedotView>, Exception> =
        Result.of(
            repository
                .findAllByOrderByJarnroAsc(pageable), EntityNotFound
        )

    fun findByModel(model: String, pageable: OffsetLimitPageable): Result<List<TeknisetTiedotView>, Exception> =
        Result.of(
            repository
                .findByMerkkiSelvakielinen(model, pageable), EntityNotFound
        )

    fun count() =
        Result.of {
            repository
                .count()
        }

    companion object {
        private val log = LoggerFactory.getLogger(this::class.java)
    }
}
