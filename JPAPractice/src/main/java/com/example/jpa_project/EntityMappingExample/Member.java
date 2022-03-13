package com.example.jpa_project.EntityMappingExample;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Member {

    @Id
    @Column(name = "MEMBER_ID")
    private String id;

    private String username;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    public Member(String member1, String 회원1) {
    }
}
