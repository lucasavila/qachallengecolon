package com.colonbackend.colon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class ColonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColonApplication.class, args);
	}

}