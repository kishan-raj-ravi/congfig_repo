package com.LAPP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LoanApplicationsApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ConfigurableApplicationContext runes = SpringApplication.run(LoanApplicationsApplication.class, args);
	}

}
