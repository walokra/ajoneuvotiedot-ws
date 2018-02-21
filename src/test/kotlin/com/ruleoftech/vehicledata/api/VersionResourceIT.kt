package com.ruleoftech.vehicledata.api

import com.ruleoftech.vehicledata.AbstractIT
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.springframework.http.HttpStatus

class VersionResourceIT : AbstractIT() {

    @Test
    fun versionInfo() {
        val forEntity = restTemplate.getForEntity("/public/version", String::class.java)
        assertThat(forEntity.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(forEntity.body).isEqualTo("test")
    }

    @Test
    fun `api-docs is found`() {
        val forEntity = restTemplate.getForEntity("/public/api-docs/", String::class.java)
        assertThat(forEntity.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(forEntity.body).contains("swagger")
    }
}
