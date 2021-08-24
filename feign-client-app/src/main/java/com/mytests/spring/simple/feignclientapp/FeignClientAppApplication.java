package com.mytests.spring.simple.feignclientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCaching
public class FeignClientAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientAppApplication.class, args);
	}

}
