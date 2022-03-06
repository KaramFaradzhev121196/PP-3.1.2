package com.example.web.service;

import com.example.web.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUser();
    void addUser(User user);
    void deleteById(Long id);
    User getUserById(Long id);
    void updateUser(User user);
    User getUserByUsername(String username);
}