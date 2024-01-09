package com.tobeto.pair3.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")//class seviyesi için...
public class SayHello {
//    @GetMapping(path="/hello")
//    public String SayHello()
//    {
//        return "Hello World!";
//    }
//@PostMapping("/save")
//    public String Num()
//    {
//        return "Saved!";
//    }
//    @DeleteMapping("/delete")
//    public String delete(){
//        return "Data deleted!";
//    }
//@GetMapping("/message/{m}")
//    public String getMyData1(@PathVariable("m") String strName){
//        return "My Name IS :"+strName;
//    }
    //OR
    @GetMapping("/message/{strName}")
    public String getMyData2(@PathVariable String strName){
        return "My Name IS :"+strName;
    }

}

