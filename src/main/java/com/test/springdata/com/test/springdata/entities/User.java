package com.test.springdata.com.test.springdata.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
@NamedQuery(name="find_all_user", query="select u from User u")
public class User {
    @Id
    private long id;

    private String name;

    private String address;

}
