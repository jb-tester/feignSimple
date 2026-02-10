package com.mytests.spring.simple.feignclientapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *
 * <p>Created by irina on 14.10.2020.</p>
 * <p>Project: feignSimple</p>
 * *
 */
@RestController
public class ClientController {


    private final MyClient1 test1;

    public ClientController(@Qualifier("simple") MyClient1 test1) {
        this.test1 = test1;
    }

    @GetMapping("/testClient/test1")
    public String test1(){
        return test1.test1();
    }
    @GetMapping("/testClient/root")
    public String root(){
        return test1.root();
    }
}
