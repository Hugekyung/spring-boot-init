package com.heyblossom.sb_for_vsc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heyblossom.sb_for_vsc.service.HelloWorldService;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    private final HelloWorldService helloWorldService;
    
    @Autowired
    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
    
    @GetMapping("/hello")
    public String hello() {
        return helloWorldService.getGreeting();
    }
}
