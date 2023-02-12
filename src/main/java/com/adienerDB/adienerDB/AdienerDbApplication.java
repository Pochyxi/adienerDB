package com.adienerDB.adienerDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AdienerDbApplication {

	public static void main(String[] args) {

		SpringApplication.run(AdienerDbApplication.class, args);

		@RestController
		@CrossOrigin("*")
		class HelloController {

			@GetMapping("/")
			public String index() {
				return "Greetings from Spring Boot!";
			}

		}
	}

}
