package com.gfa.bankofsimba.controllers;

import com.gfa.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
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

    @RequestMapping("/show")
    public String show(Model model) {
        model.addAttribute("BankAccount", accounts);
        return "Accounts";
    }


}
