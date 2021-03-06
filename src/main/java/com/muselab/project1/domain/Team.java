package com.muselab.project1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 1002428 on 16. 1. 6..
 */
@Entity
public class Team {

    @Id
    private String teamCode;
    private String teamName;

    public Team(String teamCode, String teamName) {
        this.teamCode = teamCode;
        this.teamName = teamName;
    }

    public Team() {
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
