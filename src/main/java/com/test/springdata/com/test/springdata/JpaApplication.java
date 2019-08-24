package com.test.springdata.com.test.springdata;

import com.test.springdata.com.test.springdata.entities.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

    private final JpaRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    private Logger logger = LoggerFactory.getLogger(JpaApplication.class);


    @Override
    public void run(String... args) throws Exception {


        for (int i = 1; i <= 10; i++) {
            logger.info("Insert user:{} ", repository.save(new User(i, "Test" + i, "Dhaka" + i)));
        }
        logger.info("All users -> {}", repository.findAll());

        logger.info("User id 3 -> {}", repository.findById(3));

        logger.info("All users -> {}", repository.findAll());
    }

}
