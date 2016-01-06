package com.muselab.project1.controller;

import com.muselab.project1.domain.Member;
import com.muselab.project1.domain.Team;
import com.muselab.project1.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 1002428 on 16. 1. 3..
 */
@RestController
public class MemberController {


    @Autowired
    private MemberService memberService;

    @RequestMapping(value="/hello")
    public String hello() {

        System.out.println("hi");

        return "hello";
    }

    @RequestMapping("/member/save")
    public Long memberSave(@RequestParam("name") String name, Model model) {
        Member member = new Member();
        member.setName(name);
        member.setTeam(memberService.findOneTeam("t1"));
        return memberService.save(member);
    }

    @RequestMapping("/member/findByName")
    public List<Member> findByName(@RequestParam("name") String name) {

        return memberService.findByName(name);
    }

    @RequestMapping("/team/save")
    public String teamSave(@RequestParam("teamcode") String teamCode, Model model) {
        Team team = new Team();
        team.setTeamCode(teamCode);
        team.setTeamName("ocb개발팀");

        System.out.println(team.getTeamCode());
        System.out.println(team.getTeamName());

        memberService.save(team);
        return team.getTeamCode();
    }

    @RequestMapping("/team/findone")
    public Team findTeamone(@RequestParam("teamcode") String teamCode) {

        return memberService.findOneTeam(teamCode);
    }

}
