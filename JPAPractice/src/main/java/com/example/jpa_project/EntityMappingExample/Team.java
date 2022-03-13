package com.example.jpa_project.EntityMappingExample;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Team {
    @Id
    @Column(name = "TEAM_ID")
    private String id;

    private String name;

    @OneToMany(mappedBy = "team")
    private List<Member> members;

    public Team(String team1, String 팀1) {
    }

    public Team() {

    }
}
