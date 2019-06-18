package com.examplewroni.mapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MappingController {

    @GetMapping("/whatever")
    public String whatever() {
        return "index";
    }

    @PostMapping("/home")
    @ResponseBody
    public String mappingEx() {
        return "Hello Roni";
    }
}
