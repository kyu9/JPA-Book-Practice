package com.example.jpa_project.ch07Example;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

public class MultiId_EmbeddedClass_Family {

    @Entity
    public class Parent{
        @Id
        @Column(name = "PARENT_ID")
        private String id;
        private String name;
    }

    @Entity
    public class Child{
        @EmbeddedId
        private ChildId id;

        @MapsId("parentId")
        @ManyToOne
        @JoinColumn(name = "PARENT_ID")
        public Parent parent;

        private String name;
    }

    @Embeddable
    public class ChildId implements Serializable{
        private String parentId;

        @Column(name = "CHILD_ID")
        private String id;

        public ChildId() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ChildId childId = (ChildId) o;
            return Objects.equals(parentId, childId.parentId) && Objects.equals(id, childId.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(parentId, id);
        }
    }

    @Entity
    public class GrandChild{
        @EmbeddedId
        private GrandChildId id;

        @MapsId("childId")
        @ManyToOne
        @JoinColumns({
                @JoinColumn(name = "PARENT_ID"),
                @JoinColumn(name = "CHILD_ID")
        })
        private Child child;

        private String name;
    }

    @Embeddable
    public class GrandChildId implements Serializable{
        private ChildId childId;

        @Column(name = "GRANDCHILD_ID")
        private String id;

        public GrandChildId() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GrandChildId that = (GrandChildId) o;
            return Objects.equals(childId, that.childId) && Objects.equals(id, that.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(childId, id);
        }
    }
}
