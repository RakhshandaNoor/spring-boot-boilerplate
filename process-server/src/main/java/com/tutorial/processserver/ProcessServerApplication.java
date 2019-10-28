package com.tutorial.processserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProcessServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessServerApplication.class, args);
	}

}
