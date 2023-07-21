package com.example.demo.service;

import com.example.demo.model.User;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import lombok.Data;

@Service
@Data
public class UserService {
    @Autowired
    ArrayList<User> userList = new ArrayList<>();

    @Column
    User user;

    public void addUser(User user){
        userList.add(user);
    }

    public ArrayList<User> getUsers(){
        return userList;
    }

    public User getUser(int id){
        if(id > userList.size()|| id < 1){
            return null;
        }
        return userList.get(id);
    }


}


