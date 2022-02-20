package com.example.jpa_project.ch08Example;

import com.example.jpa_project.ch05.Order;
import com.example.jpa_project.ch06Example.Team;

import javax.persistence.*;
import java.util.List;

public class Lazy_Eager_Loading {
    @Entity
    public class Member {
        @Id
        private String id;

        private String username;
        private Integer age;

        @ManyToOne(fetch = FetchType.EAGER)
        private Team team;

        @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
        private List<Order> orderList;
    }

}
