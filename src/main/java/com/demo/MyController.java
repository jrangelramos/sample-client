package com.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()

public class MyController {
    
    @Value("${the.message}")
    String message;

    @GetMapping("/hello")
    public String index() {
        return message;
    }

}
