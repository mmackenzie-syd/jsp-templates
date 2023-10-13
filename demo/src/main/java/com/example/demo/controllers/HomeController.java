package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    private String message = "Hello World Again";

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("greeting", message);
        return "index";
    }
}