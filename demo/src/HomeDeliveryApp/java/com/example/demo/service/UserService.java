package com.example.demo.service;

import com.example.demo.model.User;
//import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserService {

    /**
    @Autowired
    private UserRepository userRepo;

    public User addUser(User user){
        return this.userRepo.save(user);
    }

    public List<User> getUsers(){
        return this.userRepo.findAll();
    }

    public User getUser(int id){
       return this.userRepo.findById(id).orElse(null);
    }

    public User updateUser(User user, int id){
        User u = this.getUser(id);
        u.setUsername(user.getUsername());
        u.setRole(user.getRole());
        return this.userRepo.save(u);
    }

    public String deleteUser(int id){
        try {
            this.userRepo.delete(this.getUser(id));
        } catch(Exception e){
            e.printStackTrace();
        }
        return "successfully deleted";
    }
    **/


}


