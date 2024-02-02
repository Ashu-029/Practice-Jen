package com.jenkins;



import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PracticeJenApplication {

	private static final Logger log = LoggerFactory.getLogger(PracticeJenApplication.class);

	@PostConstruct
	public void init() {
		
		log.info(" Application Has Started sucessully for new instance......... ");
		
	}
	
	public static void main(String[] args) {
		
		log.info(" Application Has Started......... "); 
		log.info(" Application ......... ")

		SpringApplication.run(PracticeJenApplication.class, args);
	}

}
