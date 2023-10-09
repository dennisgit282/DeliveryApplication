package com.example.demo.controller;


import com.example.demo.model.TwoAddress;
import com.example.demo.service.DirectionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
public class DirectionController {

    @Autowired
    private DirectionInfoService directionInfoService;



    @GetMapping("/addDirections")
    public void showDirections(@RequestBody TwoAddress twoAddress) throws URISyntaxException, IOException {

        this.directionInfoService.generateDirectionURL(twoAddress.getAddress1(), twoAddress.getAddress2());

    }




}
