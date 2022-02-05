package com.example.jpa_project.ch06Example;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@IdClass(MemberProductId.class)
public class MemberProduct {
    @Id
    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @Id
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    private LocalDate createdAt;
}
