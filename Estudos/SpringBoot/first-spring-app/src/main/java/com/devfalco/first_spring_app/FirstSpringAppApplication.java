package com.devfalco.first_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Profile;

@SpringBootApplication
//@Profile("dev") // usar o ambiente dev co,o se fosse algo mais empresarial uma para desenvolvimento outor para produção
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}

}
