package com.reza.usermanagement.repository;

import com.reza.usermanagement.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // In-memory storage for users
    private List<User> users = new ArrayList<>();

    // Add a new user to the list
    public void save(User user) {
        users.add(user);
    }

    // Get all users
    public List<User> findAll() {
        return users;
    }

    // Find a user by id
    public User findById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null; // If not found
    }
}
