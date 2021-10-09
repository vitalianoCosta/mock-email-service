package com.ironhack.mockemailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MockEmailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockEmailServiceApplication.class, args);
	}

}
