package com.feel2code.jenkin.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinApplication {
	
	public static Logger logger=LoggerFactory.getLogger(SpringJenkinApplication.class);
	
	@PostConstruct
	public void innt() {
		logger.info("Application started.");
		logger.info("Application Executed.")
	}

	public static void main(String[] args) {
		
		logger.info("Application Executed.");
		SpringApplication.run(SpringJenkinApplication.class, args);
	}

}
