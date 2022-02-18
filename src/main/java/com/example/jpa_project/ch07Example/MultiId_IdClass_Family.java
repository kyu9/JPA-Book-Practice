package com.example.jpa_project.ch07Example;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

public class MultiId_IdClass_Family {
    @Entity
    public class Parent{
        @Id
        @Column(name = "PARENT_ID")
        private String id;

        private String name;
    }

    @Entity
    @IdClass(ChildId.class)
    public class Child{
        @Id
        @ManyToOne
        @JoinColumn(name = "PARENT_ID")
        public Parent parent;

        @Id
        @Column(name = "CHILD_ID")
        public String childId;

        private String name;
    }

    public class ChildId implements Serializable{
        private String parent;
        private String childId;

        public ChildId() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ChildId childId1 = (ChildId) o;
            return Objects.equals(parent, childId1.parent) && Objects.equals(childId, childId1.childId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(parent, childId);
        }
    }

    @Entity
    @IdClass(GrandChildId.class)
    public class GrandChild{
        @Id
        @ManyToOne
        @JoinColumns({
                @JoinColumn(name = "PARENT_ID"),
                @JoinColumn(name = "CHILD_ID")
        })
        private Child child;

        @Id
        @Column(name = "GRANDCHILD_ID")
        private String id;
    }

    public class GrandChildId implements Serializable{
        private ChildId child;
        private String id;

        public GrandChildId() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GrandChildId that = (GrandChildId) o;
            return Objects.equals(child, that.child) && Objects.equals(id, that.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(child, id);
        }
    }
}
