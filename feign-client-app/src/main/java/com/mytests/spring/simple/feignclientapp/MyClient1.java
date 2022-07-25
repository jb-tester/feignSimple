package com.mytests.spring.simple.feignclientapp;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * *
 * <p>Created by irina on 14.10.2020.</p>
 * <p>Project: feignSimple</p>
 * *
 */
@FeignClient(name = "test1", qualifiers = {"simple"}, url = "http://localhost:8081/simple/server")  // uncomment the servlet.context-path in server application configuration
//@FeignClient(name = "test1", qualifiers = {"simple"}, url = "http://localhost:8081/") // without servlet.context-path set for server application
public interface MyClient1 {
    
    @Cacheable("foo")
    @GetMapping("/test1")
    String test1();
    @GetMapping
    String root();
}
