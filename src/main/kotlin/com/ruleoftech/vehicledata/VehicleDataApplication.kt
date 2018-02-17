package com.ruleoftech.vehicledata

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.PropertySource

@SpringBootApplication
@ComponentScan("com.ruleoftech")
@PropertySource(value = "classpath:application.yml")
class VehicleDataApplication

fun main(args: Array<String>) {
    SpringApplication.run(VehicleDataApplication::class.java, *args)
}
