package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    User getUserById(long id);
    void addUser(User user);
    void remove(long id);
    void update(User user);
}