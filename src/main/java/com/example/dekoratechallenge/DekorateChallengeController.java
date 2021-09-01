package com.example.dekoratechallenge;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DekorateChallengeController {

    @RequestMapping("/")
    public String hello() {
        return "Hello world";
    }
}