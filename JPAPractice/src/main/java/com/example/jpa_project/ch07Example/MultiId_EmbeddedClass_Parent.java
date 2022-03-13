package com.example.jpa_project.ch07Example;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

public class MultiId_EmbeddedClass_Parent {

    @Entity
    @Data
    public class Parent{
        @EmbeddedId
        private ParentId id;

        private String name;
    }

    @Embeddable
    @Data
    public class ParentId implements Serializable {
        @Column(name = "PARENT_ID1")
        private String id1;
        @Column(name = "PARENT_ID2")
        private String id2;

        public ParentId() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ParentId parentId = (ParentId) o;
            return Objects.equals(id1, parentId.id1) && Objects.equals(id2, parentId.id2);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id1, id2);
        }
    }
}
