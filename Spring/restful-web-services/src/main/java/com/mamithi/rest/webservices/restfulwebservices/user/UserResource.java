package com.mamithi.rest.webservices.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;
    // Retrieve All Users
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

    // Retrieve one user
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        return service.findOne(id);
    }

    // Create new user and return URI
    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        User savedUser =  service.save(user);

        return savedUser;
    }
}
