package com.arshin.jenkins.dummy;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





@SpringBootApplication
public class DummyApplication {
	
	
	public static Logger logger=LoggerFactory.getLogger(DummyApplication.class);
	
	@PostConstruct
	public void intt()
	{
		logger.info("application started");
	}

	public static void main(String[] args) {
		SpringApplication.run(DummyApplication.class, args);
	}

}
