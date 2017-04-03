package com.sample.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rdbv on 3/9/2017.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "Das Boot, reporting for duty!";
    }
}
