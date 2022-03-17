package com.snaps.snaps_test_repo.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping ("/")
    public String main () {
        return "index";
    }

    @GetMapping ("/errors/404")
    public String errors404 () {
        return "exception/404";
    }

    @GetMapping ("/auth/login")
    public String login () {
        return "auth/login";
    }

    @GetMapping ("/auth/register")
    public String register () {
        return "auth/register";
    }

    @GetMapping ("/auth/find-password")
    public String findPassword () {
        return "auth/forgot-password";
    }
}
