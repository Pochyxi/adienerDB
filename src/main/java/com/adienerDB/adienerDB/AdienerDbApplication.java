package com.adienerDB.adienerDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AdienerDbApplication {

	public static void main(String[] args) {

		SpringApplication.run(AdienerDbApplication.class, args);

		@RequestMapping("/hello")
		@RestController
		class SayHello {


			@GetMapping("")
			public List<String> myName() {
				List<String> miaLista =  new ArrayList<>();
				miaLista.add( "Adiener" );
				miaLista.add( "Lopez" );
				miaLista.add( "Velazquez" );
				return miaLista;
			}
		}
	}

}
