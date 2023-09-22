package com.example.demo.service;


import org.springframework.stereotype.Service;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


//https://www.mapquest.com/directions/from/{country1}/{state1}/{city1}/{zip1}/{street1}/to/{country2}/{state2}/{city2}/{zip2}{street2}
@Service
public class Directions {


    public void generateDirectionURL(String country1, String state1, String city1, String zip1, String street1,
                                     String country2, String state2, String city2, String zip2, String street2) throws URISyntaxException, IOException {


        String site = "https://www.mapquest.com/directions/from/" + country1 + "/" + state1 + "/" + state1 + "/" + city1 + "/" + zip1 + "/" + street1 + "/to/" + country2 + "/" +
                state2 + "/" + city2 + "/" + zip2 + "/" + street2 + "/";

        // Create Desktop object
        Desktop d = Desktop.getDesktop();

        // Browse a URL, say google.com
        d.browse(new URI(site));


    }
}
