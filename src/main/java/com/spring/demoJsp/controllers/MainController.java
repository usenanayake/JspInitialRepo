package com.spring.demoJsp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {

    @GetMapping("/welcome")
    public String welcome(Model model){

        model.addAttribute("name","Shaminda");
        return "welcomepage";
    }
}
