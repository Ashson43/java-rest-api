package com.example.spring_rest_api;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class UserController {
    Userstore userstore = new Userstore();

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        String name = user.getName();
        return userstore.adduser(name);
    }

    @DeleteMapping("/users")
    public void deleteUser(@RequestBody User user) {
        int id = user.getId();
        userstore.removeBookById(id);
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id) {
        return userstore.getUserById(id);
    }
    @GetMapping("/users")
    public List<User> getUsers(){
        return userstore.getUsers();
    }

}
