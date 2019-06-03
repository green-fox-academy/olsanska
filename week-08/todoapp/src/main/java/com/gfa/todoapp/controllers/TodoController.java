package com.gfa.todoapp.controllers;

import com.gfa.todoapp.models.Todo;
import com.gfa.todoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

    private TodoRepository repo;

    @Autowired
    public TodoController(TodoRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/home")
    public String list(Model model) {
       model.addAttribute("newTodo", new Todo());
       model.addAttribute("allTodos", repo.findAll());
        return "list";
    }

    @PostMapping("/home")
    public String save(@ModelAttribute Todo task) {
        repo.save(task);
        return "redirect:/home";
    }
}
