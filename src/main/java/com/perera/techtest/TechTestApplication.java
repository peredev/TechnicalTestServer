package com.perera.techtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class TechTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechTestApplication.class, args);
	}

	//Enable Global CORS support for the application
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/*")
						.allowedOrigins("http://localhost:4200")
						.allowedMethods("POST", "GET", "DELETE");
			}
		};
	}
}
