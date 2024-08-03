package com.heyblossom.sb_for_vsc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class helloWorld {
    
    @GetMapping("/hello")
    public String hello() {
        return "hello!";
    }
}
