package com.gfa.reddit.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;
import java.util.UUID;

@Controller
public class UserController {

    UserRepository users;

    @Autowired
    public UserController(UserRepository users) {
        this.users = users;
    }

    @GetMapping("/login")
    public String showLogin(Model model) {
        model.addAttribute("current", "login");
        model.addAttribute("userRequest", new UserRequest());
        return "user";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute UserRequest request, Model model, HttpServletResponse response) {
        if(request.validLogin()) {
            Optional<User> user = users.findById(request.id);
            if(user.isPresent()) {
                if(user.get().password.equals(request.password)) {
                    user.get().setCookie(UUID.randomUUID().toString());
                    users.save(user.get());
                    response.addCookie(new Cookie("username", user.get().cookie));
                    return "redirect:/";
                } else {
                    request.addError("Incorrect password.");
                }
            } else {
                request.addError("Username not found.");
            }
        }
        model.addAttribute("current", "login");
        model.addAttribute("userRequest", request);
        return "user";
    }

    @GetMapping("/register")
    public String showRegister(Model model) {
        model.addAttribute("current", "register");
        model.addAttribute("userRequest", new UserRequest());
        return "user";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute UserRequest userRequest, Model model) {
        if(userRequest.validReg()) {
            if(users.findById(userRequest.id).isPresent()) {
                userRequest.addError("Username is taken, please choose another.");
            } else {
                User user = new User(userRequest.username, userRequest.password);
                users.save(user);
                // have message of success and remember username
                return "redirect:/login";
            }
        }
        model.addAttribute("current", "register");
        model.addAttribute("userRequest", userRequest);
        return "user";
    }

    @GetMapping("/logout")
    public String logout(@CookieValue String username, HttpServletResponse response) {
        Cookie cookie = new Cookie("username", "");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        return "redirect:/login";
    }
}

