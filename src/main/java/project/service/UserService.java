package project.service;

import project.model.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUserById(int id);
    void updateUserById(int id, User user);
    User getUserById(int id);
}
