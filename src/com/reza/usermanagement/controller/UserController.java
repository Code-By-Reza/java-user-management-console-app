package com.reza.usermanagement.controller;

import com.reza.usermanagement.model.User;
import com.reza.usermanagement.service.UserService;

import java.util.List;

public class UserController {

    public static void main(String[] args) {
        UserService userService = new UserService();

        // Create and save users
        userService.createUser(1, "Reza", "reza@example.com");
        userService.createUser(2, "Mahshad", "mahshad@example.com");

        // Get all users
        List<User> allUsers = userService.getAllUsers();
        System.out.println("All Users:");
        for (User user : allUsers) {
            System.out.println(user);
        }

        // Find a user by ID
        User foundUser = userService.getUserById(1);
        System.out.println("User with ID 1:");
        System.out.println(foundUser);
    }
}
