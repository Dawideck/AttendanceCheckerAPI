package com.AttendanceChecker.AttendanceCheckerAPI.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestGreetingController {

    @GetMapping
    public String greet(){
        return "Yowza";
    }
}
