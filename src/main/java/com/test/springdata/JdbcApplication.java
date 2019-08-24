package com.test.springdata;

import com.test.springdata.com.test.springdata.entities.User;
import com.test.springdata.com.test.springdata.jdbc.UserJdbcDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@RequiredArgsConstructor
public class JdbcApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JdbcApplication.class, args);
    }

    private Logger logger = LoggerFactory.getLogger(JdbcApplication.class);

    private final UserJdbcDao dao;

    @Override
    public void run(String... args) throws Exception {

        for (int i = 1; i <= 10; i++) {
            logger.info("Insert user:{} ", dao.insert(new User(i, "Test" + i, "Dhaka" + i)));
        }
        logger.info("All users -> {}", dao.findAll());

        logger.info("User id 1 -> {}", dao.findById(1));

        /*logger.info("Deleting 1 -> No of Rows Deleted - {}",
                dao.deleteById(1));*/

    }
}

