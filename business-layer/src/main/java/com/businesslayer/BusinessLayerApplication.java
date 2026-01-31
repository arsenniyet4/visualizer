package com.businesslayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.businesslayer.repositories")
public class BusinessLayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessLayerApplication.class, args);
	}
}
