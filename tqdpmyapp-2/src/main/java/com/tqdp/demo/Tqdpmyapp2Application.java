package com.tqdp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.tqdp.demo.repo")
@SpringBootApplication
public class Tqdpmyapp2Application {
	public static void main(String[] args) {
		SpringApplication.run(Tqdpmyapp2Application.class, args);
	}

}
