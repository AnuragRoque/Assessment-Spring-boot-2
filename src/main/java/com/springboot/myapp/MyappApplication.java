package com.springboot.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.springboot.myapp.repository")
@EntityScan(basePackages = "com.springboot.myapp.model")
public class MyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}

}
