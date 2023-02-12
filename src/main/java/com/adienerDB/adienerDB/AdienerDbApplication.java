package com.adienerDB.adienerDB;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AdienerDbApplication implements CommandLineRunner {
	private static final Logger logger
			= ( Logger ) LoggerFactory.getLogger( AdienerDbApplication.class );

	public static void main(String[] args) {

		SpringApplication.run(AdienerDbApplication.class, args);

	}

	@Override
	public void run( String... args ) throws Exception {
		logger.info( "BENVENUTI NEL DB DI ADIENER LOPEZ VELAZQUEZ" );
	}
}
