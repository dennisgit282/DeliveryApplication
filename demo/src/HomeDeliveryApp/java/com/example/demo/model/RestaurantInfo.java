package com.example.demo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantInfo {

    @Column
    private String restaurantName;

    @Column
    private String foodType;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int restaurantId;

}
