package com.tutorial.processwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProcessWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessWebappApplication.class, args);
	}

}
