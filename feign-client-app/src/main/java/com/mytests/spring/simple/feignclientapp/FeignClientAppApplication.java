package com.mytests.spring.simple.feignclientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Set;

@SpringBootApplication
@EnableFeignClients
@EnableCaching
public class FeignClientAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientAppApplication.class, args);
	}

	@Bean
    CacheManager cacheManager() {
		SimpleCacheManager cacheManager = new SimpleCacheManager();
		cacheManager.setCaches(Set.of(new ConcurrentMapCache("foo")));
		return cacheManager;
	}
}
