package com.test.springdata.com.test.springdata.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table
public class Course {
    @Id
    private long id;

    private String name;

    @OneToMany(mappedBy = "course")
    private List<Review> reviews = new ArrayList<>();

    @ManyToMany
    @JoinColumn
    private List<Student> students;
}
