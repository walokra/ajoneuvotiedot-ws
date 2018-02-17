package com.ruleoftech.vehicledata.extensions

import org.springframework.data.domain.PageRequest

class OffsetLimitPageable(private val offset: Int, limit: Int) : PageRequest(offset, limit) {
    override fun getOffset() = this.offset
}