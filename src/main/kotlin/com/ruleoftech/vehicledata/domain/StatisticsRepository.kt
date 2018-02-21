package com.ruleoftech.vehicledata.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional(readOnly = true)
internal interface StatisticsRepository : JpaRepository<TeknisetTiedotView, Long> {

    @Query("SELECT count(*) FROM TeknisetTiedot t WHERE t.merkkiSelvakielinen LIKE %:model%")
    fun countByModel(@Param("model") model: String): Long
}