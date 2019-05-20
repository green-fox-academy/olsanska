package com.javaspring.basicwebshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopController {

    @RequestMapping("/helloworld")
    public String greeting() {
        model.addAttribute("name", "HelloWorld");
        return "greeting";
    }
}
