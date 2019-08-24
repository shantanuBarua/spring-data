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
public class ObjectRelationApplication implements CommandLineRunner {

    //private final JpaRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(ObjectRelationApplication.class, args);
    }

    private Logger logger = LoggerFactory.getLogger(ObjectRelationApplication.class);


    @Override
    public void run(String... args) throws Exception {




    }

}
