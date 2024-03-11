package com.PROJECT.BLOG.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class testController {

    @GetMapping(value = "/")
    public String home() {
        return "index";
    }
}