package com.tobeto.pair3.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")//class seviyesi için...
public class SayHello {
    @GetMapping(path="/hello")
    public String SayHello()
    {
        return "Hello World!";
    }
@PostMapping("/save")
    public String Num()
    {
        return "Saved!";
    }
    @DeleteMapping("/delete")
    public String delete(){
        return "Data deleted!";
    }
}

