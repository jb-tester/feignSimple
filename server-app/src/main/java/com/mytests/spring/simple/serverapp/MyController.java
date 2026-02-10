package com.mytests.spring.simple.serverapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

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
