package com.gfa.bankofsimba.controllers;

import com.gfa.bankofsimba.Model.BankAccount;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankController {
    private List<BankAccount> accounts = new ArrayList<>();

    public BankController() {
        accounts.add(new BankAccount("Simba", 2000, "lion"));
        accounts.add(new BankAccount("Nala", 1000, "lion"));
        accounts.add(new BankAccount("Pumba", 3000, "warthog"));
        accounts.add(new BankAccount("Timon", 1000, "meerkat"));
    }

    @RequestMapping("/home")
    public String show(Model model) {
        model.addAttribute("BankAccount", accounts);
        return "BankOfSimba2";
    }

    @RequestMapping("/accounts")
    public String accounts(Model model) {
        model.addAttribute("BankAccount", accounts);
        return "Accounts2";
    }

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

}
