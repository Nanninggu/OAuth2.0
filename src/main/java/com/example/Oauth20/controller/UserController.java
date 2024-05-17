package com.example.Oauth20.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/main")
    public String index(Model model, @AuthenticationPrincipal OAuth2User principal) {
        model.addAttribute("username", principal.getAttribute("name"));
        model.addAttribute("isUsersPage", false);
        return "index";
    }

    @GetMapping("/users")
    public String users(Model model, @AuthenticationPrincipal OAuth2User principal) {
        model.addAttribute("username", principal.getAttribute("name"));
        model.addAttribute("isUsersPage", true);
        return "user";
    }

}
