package com.example.exospring.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@EqualsAndHashCode
@ToString
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Column(nullable = false)
    @Getter
    @Setter
    private String title;

    @OneToOne
    @Getter
    @Setter
    private Person author;
}
