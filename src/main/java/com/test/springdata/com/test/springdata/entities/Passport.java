package com.test.springdata.com.test.springdata.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passport {
    @Id
    private long id;

    private String number;

    @OneToOne(fetch= FetchType.LAZY, mappedBy="passport")
    private Student student;
}
