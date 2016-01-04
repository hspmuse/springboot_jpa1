package com.muselab.project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by 1002428 on 16. 1. 3..
 */
@Controller
public class MemberController {


    @Autowired
    private MemberService memberService;

    @RequestMapping(value="/hello")
    public String hello() {

        System.out.println("hi");

        return "hello";
    }

    @RequestMapping("/member/save")
    public Long save(@RequestParam("name") String name, Model model) {
        Member member = new Member();
        member.setName(name);
        return memberService.save(member);
    }

    @RequestMapping("/member/findByName")
    public String findByName(@RequestParam("name") String name, Model model) {

        model.addAttribute("members",memberService.findByName(name) );

        return "memberlist";
    }
}
