package com.challenge.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ChallengeMlApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeMlApiApplication.class, args);
	}

}
