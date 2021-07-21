package com.sgtrain.company;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class CompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	@Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).select()
	         .apis(RequestHandlerSelectors.basePackage("com.sgtrain.company")).build()
	         .apiInfo(apiDetails());
	   }
	
	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Company Microservice API",
				"API Documentation for Company Microservice",
				"1.0",
				"Copyright- Yash Raj",
				new springfox.documentation.service.Contact("Yash Raj", "https://github.com/Yash-VIT/socgen-stockmarket-project", "yashrajgithub@gmail.com"),
				"API License",
				"https://github.com/Yash-VIT/socgen-stockmarket-project",
				Collections.emptyList());
	}

}
