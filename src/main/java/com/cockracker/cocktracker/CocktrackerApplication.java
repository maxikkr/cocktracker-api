package com.cockracker.cocktracker;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "cocktracker API", version = "1.0.0"))
public class CocktrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CocktrackerApplication.class, args);
	}

}
