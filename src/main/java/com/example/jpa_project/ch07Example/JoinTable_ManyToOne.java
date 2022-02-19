package com.example.jpa_project.ch07Example;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class JoinTable_ManyToOne {
    @Entity
    public class Parent{
        @Id
        @GeneratedValue
        @Column(name = "PARENT_ID")
        private Long id;

        private String name;

        @OneToMany(mappedBy = "parent")
        private List<Child> childs = new ArrayList<>();
    }

    @Entity
    public class Child{
        @Id
        @GeneratedValue
        @Column(name = "CHILD_ID")
        private Long id;
        
        private String name;

        @ManyToOne(optional = false)
        @JoinTable(
                name = "PARENT_CHILD",
                joinColumns = @JoinColumn(name = "CHILD_ID"),
                inverseJoinColumns = @JoinColumn(name = "PARENT_ID")
        )
        private Parent parent;
    }
}
