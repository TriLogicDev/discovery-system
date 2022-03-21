package io.github.trilogicdev.discoverysystem

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class DiscoverySystemApplication

fun main(args: Array<String>) {
	runApplication<DiscoverySystemApplication>(*args)
}
