package ru.spring.micro.eurekaclent2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main2")
public class NewController {

    @GetMapping("/test2")
    public String test(){
        return "test from client 2";
    }
}
