package com.muselab.project1.domain;

import javax.persistence.*;

/**
 * Created by 1002428 on 16. 1. 3..
 */
@Entity
@Table(name="Member1")
public class Member {


    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int age;

    @ManyToOne
    @JoinColumn(name="teamCode")
    private Team team;

    public Member() {
    }

    public Member(Long id, String name, int age, Team team) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.team = team;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
