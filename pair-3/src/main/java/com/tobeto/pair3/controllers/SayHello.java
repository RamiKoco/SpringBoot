package com.tobeto.pair3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")//class seviyesi için
public class SayHello {
    @GetMapping(path="/hello")
    public String SayHello()
    {
        return "Hello World!";
    }
}
