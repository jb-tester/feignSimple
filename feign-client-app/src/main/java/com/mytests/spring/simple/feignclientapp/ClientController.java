package com.mytests.spring.simple.feignclientapp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientController {


    private final MyClient1 myClient1;
    private final DummyClientService dummyClientService;

    public ClientController(@Qualifier("simple") MyClient1 myClient1, DummyClientService dummyClientService) {
        this.myClient1 = myClient1;
        this.dummyClientService = dummyClientService;
    }

    @GetMapping("/testClient/test1")
    public String test1() {
        String test1Call = myClient1.test1();
        test1Call = dummyClientService.dummyGreeting() + " test1: " + test1Call;
        return test1Call;
    }

    @GetMapping("/testClient/root")
    public String root() {
        String rootCall = myClient1.root();
        rootCall = dummyClientService.dummyGreeting() + " root: " + rootCall;
        return rootCall;
    }
}
