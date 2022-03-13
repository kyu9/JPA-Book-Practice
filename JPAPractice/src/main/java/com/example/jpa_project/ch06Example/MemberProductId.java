package com.example.jpa_project.ch06Example;

import java.io.Serializable;
import java.util.Objects;

public class MemberProductId implements Serializable {
    //각 MemberProduct의 member, product객체에 연결
    private String member;
    private String product;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberProductId that = (MemberProductId) o;
        return Objects.equals(member, that.member) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(member, product);
    }
}
