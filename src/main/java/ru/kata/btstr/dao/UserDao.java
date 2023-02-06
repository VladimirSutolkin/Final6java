package ru.kata.btstr.dao;

import ru.kata.btstr.model.User;
import java.util.List;

public interface UserDao {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    List<User> getAllUsers();

    User getUserByEmail(String email);

    User getUserById(long id);
}
