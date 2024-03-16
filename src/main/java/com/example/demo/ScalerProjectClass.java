package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScalerProjectClass {

    @GetMapping("/hi")
    public String sayHello(){
        return "Hi NIkhil Nayak.....";
    }
}
