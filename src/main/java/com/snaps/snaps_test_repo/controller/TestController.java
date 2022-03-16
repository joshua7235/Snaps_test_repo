package com.snaps.snaps_test_repo.controller;

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
}
