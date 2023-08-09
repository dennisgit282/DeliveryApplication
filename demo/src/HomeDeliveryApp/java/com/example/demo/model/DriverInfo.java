package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    private User user;

    @Column
    String driversLicence;
    @Column
    double weeklyEarnings;
    @Column
    double monthlyEarnings;
    @Column
    double yearlyEarnings;

}
