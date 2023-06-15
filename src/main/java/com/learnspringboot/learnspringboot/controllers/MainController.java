package com.learnspringboot.learnspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

// Download tomcat jasper for runing jsp pages

    @RequestMapping("/")
    public String home() {
        return "home";
    }
}
