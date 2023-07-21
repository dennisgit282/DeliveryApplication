package com.example.demo.model;

import lombok.Data;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Driver;


@Entity
@Table
@Data
public class User {
    @Column(nullable = false)
    private String username;

    @Autowired
    CarInfo carInfo;

    @Autowired
    DriverInfo driverInfo;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    public User(){

    }

    public User(String username, int id, CarInfo carInfo, DriverInfo driverInfo){
        this.username = username;
        this.id = id;
        this.carInfo = carInfo;
        this.driverInfo = driverInfo;
    }

}