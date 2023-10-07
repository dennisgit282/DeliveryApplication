package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
**/
public class MenuItems {

    /**
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int mealId;

    @OneToOne(mappedBy = "RestaurantInfo")
    private MenuItems menuItems;

    @Column
    String menuItem;
    @Column
    String description;
    @Column
    double price;
    @Column
    int quantity;
    **/



}
