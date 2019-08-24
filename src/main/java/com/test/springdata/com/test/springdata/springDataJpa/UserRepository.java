package com.test.springdata.com.test.springdata.springDataJpa;

import com.test.springdata.com.test.springdata.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
