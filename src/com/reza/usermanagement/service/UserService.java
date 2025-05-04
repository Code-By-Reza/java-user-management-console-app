package com.reza.usermanagement.service;

import com.reza.usermanagement.model.User;
import com.reza.usermanagement.repository.UserRepository;

import java.util.List;

// This class handles the business logic related to users
public class UserService {

    private UserRepository userRepository = new UserRepository();

    // Creates a new user and saves it to the repository
    public User createUser(int id, String name, String email) {
        User user = new User(id, name, email);
        userRepository.save(user);
        return user;
    }

    // Returns a formatted string with user information
    public String getUserInfo(User user) {
        return user.toString();
    }

    // Returns a list of all users stored in the repository
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Finds and returns a user by their ID, or null if not found
    public User getUserById(int id) {
        return userRepository.findById(id);
    }
}
