package com.myapp.spring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration

@SpringBootApplication(exclude=SecurityAutoConfiguration.class)
class DevopsProductsAppApplication {

	static void main(String[] args) {
		SpringApplication.run(DevopsProductsAppApplication, args)
	}

}


// SCM -> Git & Github

// Build management -> Maven

// Test Automation -> JUNIT

// CI SERVER -> JENKINS


// CONTINUOUS DELIVERY