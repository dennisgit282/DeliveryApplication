package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table
@Data
public class DriverInfo {

    @Column
    String driversLicence;
    @Column
    double weeklyEarnings;
    @Column
    double monthlyEarnings;
    @Column
    double yearlyEarnings;

    public DriverInfo(){

    }

    public DriverInfo(String driversLicence, double weeklyEarnings, double monthlyEarnings, double yearlyEarnings){
        this.driversLicence = driversLicence;
        this.weeklyEarnings = weeklyEarnings;
        this.monthlyEarnings = monthlyEarnings;
        this.yearlyEarnings = yearlyEarnings;
    }
}
