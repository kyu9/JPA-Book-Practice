package com.example.jpa_project.ch07Example;

import javax.persistence.*;

public class SingleTableStrategyMapping {
    @Entity
    @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
    @DiscriminatorColumn
    public abstract class Item{
        @Id
        @GeneratedValue
        @Column(name = "ITEM_ID")
        private Long id;

        private String name;
        private Long price;
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
    public class Book extends Item{
        private String isbn;
        private String author;
    }
}
