package com.mytests.spring.simple.serverapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * *
 * <p>Created by irina on 14.10.2020.</p>
 * <p>Project: feignSimple</p>
 * *
 */

@RestController
public class MyController {

    @GetMapping("/")
    public String root( ) {
        return "root";
    }

    @GetMapping("/test1")
    public String test1( ) {
        return "test1"+new Random().nextInt();
    }
}
