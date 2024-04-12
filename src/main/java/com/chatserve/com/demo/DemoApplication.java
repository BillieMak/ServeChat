package com.chatserve.com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {

			@Override
			public void addCorsMappings(org.springframework.web.servlet.config.annotation.CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:8081","http://192.168.100.89:8081","https://socket-bases.vercel.app/").allowedMethods("*").allowedHeaders("*")
						.allowCredentials(true).maxAge(3600);
			}
		};
	}
}
