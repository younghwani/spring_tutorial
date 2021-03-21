package com.tutorial.rex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

    @RequestMapping(value = "/")
    public String Home1() {
        return "home";
    }

    @RequestMapping(value = "/home")
    public String Home2() {
        return "home";
    }

    @RequestMapping(value="/test")
    public String Hello(Model model) {
        model.addAttribute("test", "test success!");
        return "test";
    }
}
