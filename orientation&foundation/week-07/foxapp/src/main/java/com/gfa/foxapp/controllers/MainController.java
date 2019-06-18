package com.gfa.foxapp.controllers;

import com.gfa.foxapp.models.Fox;
import com.gfa.foxapp.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    FoxService service;

    @RequestMapping("/")
    public String login(@RequestParam(name = "name", required = false) String name, Model model) {
        if (!service.checkNames(name)) {
            return "redirect:/login";
        } else if (name.equals(null)) {
            return "redirect:/login";
        }
        model.addAttribute("fox", service.findFox(name));
        return "loggedin";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String handle(@RequestParam("name") String name) {
        if (!service.checkNames(name)) {
            service.addFox(name);
        }
        return "redirect:/?name=" + name;
    }
}
