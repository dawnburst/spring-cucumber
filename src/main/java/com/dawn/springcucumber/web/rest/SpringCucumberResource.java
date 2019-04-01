package com.dawn.springcucumber.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCucumberResource {

    @GetMapping("/start")
    public String getStartValue(@RequestParam("value") String value){
        return "This is the start value: " + value;
    }
}
