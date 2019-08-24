package com.test.springdata.com.test.springdata.jdbc;

import com.test.springdata.com.test.springdata.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserJdbcDao {

    private final JdbcTemplate jdbcTemplate;

    String FETCH_ALL_DATA = "select * from user";

    String FIND_SPECIFIC_DATA = "select * from user where id=?";

    class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getInt(1));
            user.setName(rs.getString(2));
            user.setAddress(rs.getString(3));
            return user;
        }
    }

    public List<User> findAll() {
        return jdbcTemplate.query(FETCH_ALL_DATA, new UserRowMapper());
    }

    public User findById(int id) {
        return jdbcTemplate.queryForObject(FIND_SPECIFIC_DATA, new Object[]{id},
                new BeanPropertyRowMapper<User>(User.class));
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("delete from user where id=?", new Object[]{id});
    }

    public int insert(User user) {
        return jdbcTemplate.update("insert into user (id, name, address) " + "values(?,  ?, ? )",
                new Object[]{user.getId(), user.getName(), user.getAddress()});
    }

    public int update(User user) {
        return jdbcTemplate.update("update user " + " set name = ?, address = ? " + " where id = ?",
                new Object[]{user.getName(), user.getAddress(),
                        user.getId()});
    }
}
