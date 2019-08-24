package com.test.springdata.com.test.springdata.springDataJpa;

import com.test.springdata.com.test.springdata.entities.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Long> {
}
