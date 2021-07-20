package com.sgtrain.stockexchange;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class StockExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockExchangeApplication.class, args);
	}
	
	@Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).select()
	         .apis(RequestHandlerSelectors.basePackage("com.sgtrain.stockexchange")).build()
	         .apiInfo(apiDetails());
	   }
	
	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Stock Exchange Microservice API",
				"API Documentation for Stock Exchange Application",
				"1.0",
				"Free to Use",
				new springfox.documentation.service.Contact("Yash Raj", "https://github.com/Yash-VIT/socgen-stockmarket-project", "yashrajgithub@gmail.com"),
				"API License",
				"https://github.com/Yash-VIT/socgen-stockmarket-project",
				Collections.emptyList());
	}

}
