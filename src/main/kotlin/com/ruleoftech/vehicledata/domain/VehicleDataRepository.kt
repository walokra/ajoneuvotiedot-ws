package com.ruleoftech.vehicledata.domain

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional(readOnly = true)
internal interface VehicleDataRepository : PagingAndSortingRepository<TeknisetTiedot, Long> {

    override fun findAll(pageable: Pageable): Page<TeknisetTiedot>

    fun findByMerkkiSelvakielinen(merkkiSelvakielinen: String, pageable: Pageable): Page<TeknisetTiedot>
}