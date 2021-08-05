package com.example.dekoratechallenge;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class DekorateChallengeController {

    @GetMapping
    public String hello() {
        return "Hello world";
    }
}