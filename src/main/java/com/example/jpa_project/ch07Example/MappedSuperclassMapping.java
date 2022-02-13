package com.example.jpa_project.ch07Example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

public class MappedSuperclassMapping {

    @MappedSuperclass
    public abstract class BaseEntity{
        @Id
        @GeneratedValue
        private Long id;

        private String name;
    }

    @Entity
    public class Member extends BaseEntity{
        private String email;
    }

    @Entity
    public class Seller extends BaseEntity{
        private String shopName;
    }
}
