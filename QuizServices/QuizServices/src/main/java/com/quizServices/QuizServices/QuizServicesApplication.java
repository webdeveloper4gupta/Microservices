package com.quizServices.QuizServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients // used to enable the feignClients
//Feign client basically used for the communicating one services with another services .
public class QuizServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizServicesApplication.class, args);
	}

}
