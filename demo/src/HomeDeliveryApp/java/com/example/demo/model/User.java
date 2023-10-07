package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;


@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Column(nullable = false)
    private String username;


    /**
    @OneToOne(mappedBy = "user")
    DriverInfo driverInfo;
    **/

    /**
    @OneToOne(mappedBy =  "user")
    CarInfo carInfo;
     **/

    @Column
    private String role;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;


}