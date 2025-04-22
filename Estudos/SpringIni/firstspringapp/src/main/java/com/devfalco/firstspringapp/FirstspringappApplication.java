package com.devfalco.firstspringapp;

import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.context.annotation.Configuration;

@SpringBootApplication //São Anotações que abstraem configurações onde a classe essa configuração
// @Configuration
// @EnableAutoConfiguration // Habilita autoconfigurações
// @ComponentScan // Ele analisa e gerencia o ciclo de vida dos componenetes
public class FirstspringappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstspringappApplication.class, args);
	}

}
