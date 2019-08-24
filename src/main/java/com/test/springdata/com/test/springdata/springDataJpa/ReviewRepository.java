package com.test.springdata.com.test.springdata.springDataJpa;

import com.test.springdata.com.test.springdata.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}
