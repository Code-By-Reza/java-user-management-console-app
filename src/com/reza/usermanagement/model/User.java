package com.reza.usermanagement.model;

// This class represents a user in the system
public class User {

    // Fields (user properties)
    private int id;
    private String name;
    private String email;


    // Constructor
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getter for id
    public int getId() {
        return id;
    }
    
    // Setter for id
    public void setID(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for email
    public String getEmail() {
        return name;

    }
    
    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }


    // toString method to print user info
    @Override
    public String toString() {
          return "User{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", email='" + email + '\'' +
               '}';
    }
    }
       

