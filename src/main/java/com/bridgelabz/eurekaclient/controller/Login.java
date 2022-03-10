package com.bridgelabz.eurekaclient.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class Login {
    @PostMapping("/register")
    public void loginservice(@RequestBody int atif){
        System.out.println("Hello" +atif);
    }
}
