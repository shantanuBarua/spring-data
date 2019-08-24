package com.test.springdata.com.test.springdata.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Review {

    @Id
    private long id;

    @Enumerated(EnumType.STRING)
    private Rating rating;

    private String description;

    @ManyToOne
    private Course course;

    @Override
    public String toString() {
        return "Review{" +
                "description='" + description + '\'' +
                '}';
    }
}
