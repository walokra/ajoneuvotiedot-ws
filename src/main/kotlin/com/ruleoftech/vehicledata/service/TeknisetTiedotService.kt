package com.ruleoftech.exp.ajotektiedot.service

import com.github.kittinunf.result.Result
import com.ruleoftech.vehicledata.domain.TeknisetTiedot
import com.ruleoftech.vehicledata.domain.VehicleDataRepository
import com.ruleoftech.vehicledata.extensions.OffsetLimitPageable
import org.springframework.stereotype.Service

import org.slf4j.LoggerFactory
import org.springframework.data.domain.Page
import javax.transaction.Transactional

@Service
@Transactional(rollbackOn = [(Exception::class)])
internal class TeknisetTiedotService constructor(
    val repository: VehicleDataRepository) {

    fun findAll(offset: Int, limit: Int): Result<Page<TeknisetTiedot>, Exception> =
        Result.of {
            val pageable = OffsetLimitPageable(offset, limit)
            repository
                .findAll(pageable)
        }

    fun findByModel(model: String, offset: Int, limit: Int): Result<Page<TeknisetTiedot>, Exception> =
        Result.of {
            val pageable = OffsetLimitPageable(offset, limit)
            repository
                .findByMerkkiSelvakielinen(model, pageable)
        }

    companion object {
        private val log = LoggerFactory.getLogger(this::class.java)
    }
}
