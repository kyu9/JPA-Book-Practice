package com.example.jpa_project.ch07Example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.util.Objects;

public class MultiId_IdClass_Parent {

    @Entity
    @IdClass(ParentId.class)
    public class Parent{
        @Id
        @Column(name = "PARNET_ID")
        private String id;

        @Id
        @Column(name = "PARENT_ID2")
        private String id2;
    }

    public class ParentId implements Serializable{
        private String id1;
        private String id2;

        public ParentId() {
        }

        public ParentId(String id1, String id2) {
            this.id1 = id1;
            this.id2 = id2;
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
