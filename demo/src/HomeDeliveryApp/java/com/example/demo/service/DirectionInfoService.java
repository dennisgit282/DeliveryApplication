package com.example.demo.service;


import com.example.demo.model.Address;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


//https://www.mapquest.com/directions/from/{country1}/{state1}/{city1}/{zip1}/{street1}/to/{country2}/{state2}/{city2}/{zip2}{street2}
@Service
public class DirectionInfoService {


    public void generateDirectionURL(Address address1, Address address2 ) throws URISyntaxException, IOException {


        String site = "https://www.mapquest.com/directions/from/" + address1.getCountry() + "/" + address1.getState() + "/" + address1.getCity() + "/" + address1.getStreet() + "/" + address1.getNumber() + "/to/" + address1.getZip() + "/" +
                "/" + address2.getCountry() + "/" + address2.getState() + "/" + address2.getCity() + "/" + address2.getStreet() + "/" + address2.getNumber() + "/to/" + address2.getZip() ;

        // Create Desktop object
        Desktop d = Desktop.getDesktop();

        // Browse a URL, say google.com
        d.browse(new URI(site));


    }
}
