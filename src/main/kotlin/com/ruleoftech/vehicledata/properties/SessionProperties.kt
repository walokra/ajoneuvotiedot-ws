package com.ruleoftech.vehicledata.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "session")
data class SessionProperties(var timeoutMins: Long = 10)