package com.ruleoftech.vehicledata.configuration

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import com.ruleoftech.vehicledata.properties.AppProperties
import com.ruleoftech.vehicledata.properties.SessionProperties
import com.zaxxer.hikari.HikariDataSource
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder
import java.time.Duration
import java.time.format.DateTimeFormatter
import java.util.TimeZone
import javax.annotation.PostConstruct
import javax.sql.DataSource

@Configuration
class SpringAppConfig(
        val appProperties: AppProperties,
        val sessionProperties: SessionProperties,
        val builder: Jackson2ObjectMapperBuilder) {

    @Bean
    fun webServerFactory(): ConfigurableServletWebServerFactory {
        val factory = JettyServletWebServerFactory()
        factory.session.timeout = Duration.ofMinutes(sessionProperties.timeoutMins)
        factory.contextPath = appProperties.servlet.contextPath
        return factory
    }

    @ConfigurationProperties(prefix = "hikari")
    @Bean
    fun dataSource(): DataSource = HikariDataSource()

    @PostConstruct
    fun postConstruct() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"))

        this.builder.serializers(LocalDateTimeSerializer(DateTimeFormatter
                .ofPattern(appProperties.dateFormat)))
    }

}
