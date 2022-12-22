package project.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.dao.UserDao;
import project.model.User;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserDao userDao;

    UserServiceImpl (UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional
    public void deleteUserById(int id) {
        userDao.deleteUserById(id);
    }

    @Override
    @Transactional
    public void updateUserById(int id, User user) {
        userDao.updateUserById(id, user);
    }
    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
