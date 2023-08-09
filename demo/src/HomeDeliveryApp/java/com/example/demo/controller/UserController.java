package com.example.demo.controller;

import com.example.demo.helper.ApiResponseBody;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

   @Autowired
   private UserService userService;

   @PostMapping("/addUser")
   public ResponseEntity<User> addUser(@RequestBody User user){
      User u = this.userService.addUser(user);
      return new ResponseEntity<>(u, HttpStatus.CREATED);
   }

   @DeleteMapping("/user/{id}")
   public ResponseEntity<ApiResponseBody> deleteUser(@PathVariable int id){
      String response = this.userService.deleteUser(id);
      return new ResponseEntity<>(new ApiResponseBody(response, true), HttpStatus.OK);
   }

   @GetMapping("/getUsers")
   public List<User> getUsers(){
      return this.userService.getUsers();
   }

   @PutMapping("/updateUser/{id}")
   public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable int id){
      User u = this.userService.updateUser(user, id);
      return new ResponseEntity<>(u, HttpStatus.CREATED);
   }

   @GetMapping("/getUser/{id}")
   public ResponseEntity<User> getUser(@PathVariable int id){
      User u = this.userService.getUser(id);
      return new ResponseEntity<>(u, HttpStatus.OK);
   }

}
