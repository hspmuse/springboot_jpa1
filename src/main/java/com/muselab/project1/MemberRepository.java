package com.muselab.project1;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by 1002428 on 16. 1. 3..
 */
//@EnableJpaRepositories
public interface MemberRepository extends Repository<Member,Long> {

    public List<Member> findByName(String name);

//    @Query("select m from member m where m.name like :name")
//    public List<Member> findByLikeName(String name);

    public void save(Member member);
}
