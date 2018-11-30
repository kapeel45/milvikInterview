package com.milvik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan("com.milvik")
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class QuestionareMainApp {

	public static void main(String[] args) {
		SpringApplication.run(QuestionareMainApp.class, args); 
	
		
	}

}
