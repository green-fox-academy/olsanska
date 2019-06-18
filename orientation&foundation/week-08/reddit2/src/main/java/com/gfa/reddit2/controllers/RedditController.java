package com.gfa.reddit2.controllers;

import com.gfa.reddit2.services.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedditController {

    @Autowired
    RedditService service;

    @GetMapping("/reddit")
    public String main() {
        return "main";
    }
}
