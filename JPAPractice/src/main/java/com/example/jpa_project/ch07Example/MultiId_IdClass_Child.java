package com.example.jpa_project.ch07Example;

import javax.persistence.*;

public class MultiId_IdClass_Child {
    @Entity
    public class Child {
        @Id
        private String id;

        @ManyToOne
        @JoinColumns({
                @JoinColumn(name = "PARENT_ID1", referencedColumnName = "PARENT_ID1"),
                @JoinColumn(name = "PARENT_ID2", referencedColumnName = "PARENT_ID2")
        })
        private MultiId_IdClass_Parent.Parent parent;
    }
}
