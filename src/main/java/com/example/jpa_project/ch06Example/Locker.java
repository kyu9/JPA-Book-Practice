package com.example.jpa_project.ch06Example;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Locker {
    @Id
    @GeneratedValue
    @Column(name = "LOCKER_ID")
    private Long id;

    private String name;

    @OneToOne(mappedBy = "MEMBER_ID")
    private Member member;
}
