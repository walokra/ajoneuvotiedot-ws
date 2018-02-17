package com.ruleoftech.vehicledata.api

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.PropertySource
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/public/version")
@PropertySource(value = "classpath:git.properties", ignoreResourceNotFound = true)
class VersionResource {

    @Value(value = "\${git.commit.id.abbrev:dev}")
    private val commitId: String? = "dev"

    @GetMapping
    fun version(): String = commitId ?: "no commit id found"
}

