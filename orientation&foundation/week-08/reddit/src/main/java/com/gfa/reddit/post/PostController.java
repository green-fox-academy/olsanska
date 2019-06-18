package com.gfa.reddit.post;

import com.gfa.reddit.user.User;
import com.gfa.reddit.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingRequestCookieException;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class PostController {

    @Autowired
    PostRepository postRepo;
    PostService service;
    UserRepository users;

    @Autowired
    public PostController(PostRepository postRepo, PostService service, UserRepository users) {
        this.postRepo = postRepo;
        this.service = service;
        this.users = users;
    }


    @GetMapping({"", "/"})
    public String index (Model model,
                         @RequestParam(required = false) String msg,
                        @CookieValue String username) {
        System.out.println(username + "  HELLO FUCKER");
        User current = users.findByCookie(username);
        model.addAttribute("current", "showAll");
        model.addAttribute("posts", current.getPosts());
        model.addAttribute("msg", msg);
        return "index";
    }

    @GetMapping("/add")
    public String showAdd(Model model, @CookieValue String username) {
        model.addAttribute("current", "add");
        model.addAttribute("post", new Post());
        return "index";
    }

    @PostMapping("/add")
    public String save(@ModelAttribute Post post, @CookieValue String username) {
        User current = users.findByCookie(username);
        post.setUser(current);
        postRepo.save(post);
        return "redirect:/";
    }

    @GetMapping("/show/{id}")
    public String showPost(Model model, @PathVariable long id, @CookieValue String username) {
        Optional<Post> post = postRepo.findOneByIdAndUser(id, users.findByCookie(username));
        if(!post.isPresent()) {
            return "redirect:/?msg=error";
        }
        model.addAttribute("current", "show");
        model.addAttribute("post", post.get());
        return "index";
    }

    @GetMapping("/delete/{id}")
    public String deletePost(Model model, @PathVariable long id, @CookieValue String username) {
        Optional<Post> post = postRepo.findOneByIdAndUser(id, users.findByCookie(username));
        if(!post.isPresent()) {
            return "redirect:/?msg=error";
        }
        postRepo.delete(post.get());
        return "redirect:/?msg=deleted";
    }

    @ExceptionHandler(MissingRequestCookieException.class)
    public String notAuthenticated() {
        return "redirect:/login";
    }
}

