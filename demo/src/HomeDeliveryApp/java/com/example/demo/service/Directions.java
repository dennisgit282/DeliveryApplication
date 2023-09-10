package com.example.demo.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

//https://www.mapquest.com/directions/from/{country1}/{state1}/{city1}/{zip1}/{street1}/to/{country2}/{state2}/{city2}/{zip2}{street2}
@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class Directions {
    private String country1;
    private String state1;
    private String city1;
    private String zip1;
    private String street1;

    private String country2;
    private String state2;
    private String city2;
    private String zip2;
    private String street2;

    public String generateDirectionURL(String country1, String state1, String city1, String zip1, String street1,
                                     String country2, String state2, String city2, String zip2, String street2)
    {


        return "https://www.mapquest.com/directions/from/" + country1 + "/" + state1 + "/" + state1 + "/" + city1 + "/" + zip1 + "/" + street1 + "/to/" + country2 + "/" + state2 + "/" + city2 + "/" + zip2 + "/" + street2;




    }
}
