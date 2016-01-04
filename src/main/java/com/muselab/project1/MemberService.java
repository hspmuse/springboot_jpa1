package com.muselab.project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 1002428 on 16. 1. 3..
 */
@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> findByName(String name) {
        return memberRepository.findByName(name);
        //return memberRepository.findByLikeName(name);
    }

    public Long save(Member member) {
        memberRepository.save(member);
        return member.getId();
    }

}
