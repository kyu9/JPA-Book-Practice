package com.example.jpa_project.ch06HW;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "MEMEBR_ID")
    private Long Id;

    private String name;
    private String city;
    private String street;
    private String zipCode;

}
