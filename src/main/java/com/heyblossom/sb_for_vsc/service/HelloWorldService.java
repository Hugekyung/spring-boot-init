package com.heyblossom.sb_for_vsc.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String getGreeting() {
        return "Hello, World! in HelloWorldService";
    }
}
