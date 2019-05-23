package com.gfa.foxapp.controllers;

import com.gfa.foxapp.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    Fox fox;

    @RequestMapping("/home")
    public String foxappMainPage(Model model) {
        model.addAttribute("foxapp", fox.count());
        return "index";
    }

    @RequestMapping("/list")
    public String addStudent(Model model) {
        model.addAttribute("foxList", fox.findAll());
        return "list";
    }

    @RequestMapping("/home/choose")
    public String saveStudent(Model model, @RequestParam String name) {
        fox.save(name);
        model.addAttribute("name", name);
        return "choose";
    }

    @RequestMapping("/web/gfa/check")
    public String checkIfPresent(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        model.addAttribute("hasname", fox.findAll().contains(name));
        return "CheckPresence";
    }
}
/*
    @GetMapping("/newaccount")
    public String newAccount(@RequestParam(required = false, defaultValue = "") String name, String animalType, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("animalType", animalType);
        model.addAttribute("newAccount", new BankAccount());
        return "newAccountForm2";
    }

    @PostMapping("/newaccount")
    public String handle(@ModelAttribute BankAccount newAccount,
                         Model model) {
        model.addAttribute("name", newAccount.getName());
        System.out.println("Animal type:" + newAccount.getAnimalType());
        System.out.println("Password:" + newAccount.getPassword());
        model.addAttribute("newAccount", new BankAccount());
        return "newAccountForm2";
    }
 */