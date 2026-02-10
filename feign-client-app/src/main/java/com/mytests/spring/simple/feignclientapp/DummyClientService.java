package com.mytests.spring.simple.feignclientapp;

import org.springframework.stereotype.Service;


@Service
public class DummyClientService {

    public String dummyGreeting() {
        return "Welcome to Feign Client Test application! We are testing the endpoint ";
    }
}
