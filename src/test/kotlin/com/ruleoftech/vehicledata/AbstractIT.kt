package com.ruleoftech.vehicledata

import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.test.context.jdbc.Sql
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, properties = ["swagger.enabled=true"])
@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = ["classpath:before.sql"])
abstract class AbstractIT {

    @Autowired
    lateinit var restTemplate: TestRestTemplate

    final inline fun <reified T : Any> typeRef(): ParameterizedTypeReference<T> = object : ParameterizedTypeReference<T>() {}

    final inline fun <reified T : Any> get(path: String): ResponseEntity<T> {
        val typeReference: ParameterizedTypeReference<T> = typeRef()
        return restTemplate.exchange(
            path,
            HttpMethod.GET,
            HttpEntity<Any>(httpHeaders()),
            typeReference)
    }

    @PublishedApi
    internal fun httpHeaders(contentType: MediaType? = null): HttpHeaders {
        val headers = HttpHeaders()
        headers.contentType = contentType ?: MediaType.APPLICATION_JSON
        return headers
    }
}
