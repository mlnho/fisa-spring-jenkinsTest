package com.example.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class jenkins {
    @GetMapping("/")
    public String hello(){
        return "home";
    }
}
