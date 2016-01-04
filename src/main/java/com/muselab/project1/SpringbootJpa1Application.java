package com.muselab.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
//@EnableJpaRepositories("com.muselab.project1")
public class SpringbootJpa1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpa1Application.class, args);
	}
}
