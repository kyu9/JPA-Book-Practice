package com.example.jpa_project.ch07Example;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class JoinTable_ManyToMany {
    @Entity
    public class Parent{
        @Id
        @GeneratedValue
        @Column(name = "PARENT_ID")
        private Long id;

        private String name;

        @ManyToMany
        @JoinTable(
                name = "PARENT_CHILD",
                joinColumns = @JoinColumn(name = "PARENT_ID"),
                inverseJoinColumns = @JoinColumn(name = "CHILD_ID")
        )
        private List<Child> childList = new ArrayList<>();
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
