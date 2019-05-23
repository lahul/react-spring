package com.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


@SpringBootApplication
public class SpringAndReactApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAndReactApplication.class, args);
	}
}
