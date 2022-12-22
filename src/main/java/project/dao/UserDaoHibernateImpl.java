package project.dao;

import org.springframework.stereotype.Repository;
import project.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoHibernateImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select user from User user", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUserById(int id) {
        entityManager.remove(entityManager.find(User.class,id));
    }

    @Override
    public void updateUserById(int id, User user) {
        User us = getUserById(id);
        us.setName(user.getName());
        us.setLastName(user.getLastName());
        us.setEmail(user.getEmail());
        us.setAge(user.getAge());
    }

    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }
}
