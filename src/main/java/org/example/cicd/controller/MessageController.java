package org.example.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MessageController {
    @GetMapping("/cicd")
    public String getMessage(){
        return "Hello";
    }
}
