package com.test.springdata.com.test.springdata.jpa;

import com.test.springdata.com.test.springdata.entities.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> findAll() {
        TypedQuery<User> namedQuery = entityManager.createNamedQuery("find_all_user", User.class);
        return namedQuery.getResultList();
    }

    public User findById(int id) {
        return entityManager.find(User.class, id);
    }

    public User update(User u) {
        return entityManager.merge(u);
    }

    public User insert(User u) {
        return entityManager.merge(u);
    }

    public void deleteById(int id) { entityManager.remove(findById(id)); }

}