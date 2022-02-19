package com.example.jpa_project.ch07Example;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class JoinTable_OneToMany {
    @Entity
    public class Parent{
        @Id
        @GeneratedValue
        @Column(name = "PARENT_ID")
        private Long id;

        private String name;

        @OneToMany
        @JoinTable(
                name = "PARNET_CHILD",
                joinColumns = @JoinColumn(name = "PARENT_ID"),
                inverseJoinColumns = @JoinColumn(name = "CHILD_ID")
        )
        private List<Child> childs = new ArrayList<>();
    }

    @Entity
    public class Child{
        @Id
        @GeneratedValue
        @Column(name = "CHILD_ID")
        private Long id;

        private String name;
    }
}
