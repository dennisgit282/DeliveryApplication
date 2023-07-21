package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class CarInfo {

    @Column
    String make;
    @Column
    String model;
    @Column
    String VIN;

    public CarInfo(){

    }

    public CarInfo(int id, String make, String model, String VIN){
        this.make = make;
        this.model = model;
        this.VIN = VIN;
    }


}
