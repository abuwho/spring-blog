package com.springblog.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "Home page";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "bro") String name) {
		return String.format("Hello, %s!", name);
	}
}
