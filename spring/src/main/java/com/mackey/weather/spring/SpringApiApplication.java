package com.mackey.weather.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.mackey.weather.spring.Repo")
public class SpringApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringApiApplication.class, args);
	}
}
