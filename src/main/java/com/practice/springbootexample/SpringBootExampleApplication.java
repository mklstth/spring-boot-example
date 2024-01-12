package com.practice.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
/*
* @ComponentScan(basePackage = "com.practice.springbootexample")
* @Configuration
* @EnableAutoConfiguration
* */
@RestController
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}

	@GetMapping("/")
	public String greet(){
		return "Hello";
	}
}
