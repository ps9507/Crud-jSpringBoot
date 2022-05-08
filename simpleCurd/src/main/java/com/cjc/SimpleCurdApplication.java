package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@EntityScan(basePackages = "com.cjc.*")
@SpringBootApplication
public class SimpleCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleCurdApplication.class, args);
	}

}
