package com.learnspringboot.learnspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // we have used Controller anotation
@ResponseBody // As we are not returning any page but a string so we have used this anotation
public class TestController {

    @RequestMapping("/test") // We have done mapping here

    // Make a handler
    public String firstHandle() {
        return "Just for Testing !!!";
    }
}
