package com.example.jpa_project.ch07Example;

import javax.persistence.*;
import java.time.LocalDate;

public class JoinStrategyMapping {

    @Entity
    @Inheritance(strategy = InheritanceType.JOINED)
    @DiscriminatorColumn(name = "DTYPE")
    public abstract class Item{
        @Id
        @GeneratedValue
        @Column(name = "ITEM_ID")
        private Long id;

        private String name;
        private int price;

        private LocalDate createdAt;
        private LocalDate updatedAt;
    }

    @Entity
    @DiscriminatorValue("A")
    public class Album extends Item{
        private String artist;

    }

    @Entity
    @DiscriminatorValue("M")
    public class Movie extends Item{
        private String director;
        private String actor;
    }

    @Entity
    @DiscriminatorValue("B")
    @PrimaryKeyJoinColumn(name = "BOOK_ID") //아이디를 재정의한다..?
    public class Book extends Item{
        private String author;
        private String isbn;
    }
}
