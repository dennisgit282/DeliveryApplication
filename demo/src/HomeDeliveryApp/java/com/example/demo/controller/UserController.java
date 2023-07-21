package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ArrayList<User> getUserList(){
        return userService.getUsers();
    }

    @GetMapping("user/{id}")
    public User getUser(@PathVariable int id){
        return userService.getUser(id);
    }

    @PostMapping("/user")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @PutMapping("user/{id}")
    public void updateUser(@PathVariable int id, @PathVariable String username){
       userService.getUser(id).setUsername(username);
    }

    @DeleteMapping("user/{id}")
    public void deleteUser(@PathVariable int id){
        userService.getUserList().remove(id);
    }

}
