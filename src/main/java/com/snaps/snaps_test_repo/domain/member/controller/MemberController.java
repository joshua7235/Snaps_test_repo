package com.snaps.snaps_test_repo.domain.member.controller;

import com.snaps.snaps_test_repo.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping ("/v1")
public class MemberController {

    private final MemberService memberService;

    @GetMapping ("/auth/login")
    public String login () {
        return "auth/login";
    }

}
