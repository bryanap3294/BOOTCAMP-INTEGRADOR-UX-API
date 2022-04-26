package com.bootcamp.uxapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class UxapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UxapiApplication.class, args);
	}

}
