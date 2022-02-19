package com.example.jpa_project.ch07Example;

import javax.persistence.*;

public class JoinTable_OneToOne {
    @Entity
    public class Parent{
        @Id
        @GeneratedValue
        @Column(name = "PARENT_ID")
        private Long id;
        private String name;

        @OneToOne
        @JoinTable(name = "PARENT_CHILD",
                joinColumns = @JoinColumn(name = "PARENT_ID"),
                inverseJoinColumns = @JoinColumn(name = "CHILD_ID")
        )
        private Child child;
    }

    @Entity
    public class Child{
        @Id
        @GeneratedValue
        @Column(name = "CHILD_ID")
        private Long id;
        private String name;

        @OneToOne(mappedBy = "child")
        private Parent parent;
    }
}
