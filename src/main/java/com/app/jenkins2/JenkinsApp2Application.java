package com.app.jenkins2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JenkinsApp2Application {

	public static Logger logger = LoggerFactory.getLogger(JenkinsApp2Application.class);
	public static void main(String[] args) {
		SpringApplication.run(JenkinsApp2Application.class, args);
	}

	@Bean
	public CommandLineRunner cr() {
		return (args)-> {
			System.out.println("hello world..");
			logger.info("hello from command line runner..");
		};
	}
}
