package com.ruleoftech.vehicledata.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "server")
data class AppProperties(
        var contextPath: String = "/vehicledata-ws",
        var dateFormat: String = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
)