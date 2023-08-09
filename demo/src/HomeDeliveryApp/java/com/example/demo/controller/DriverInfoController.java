package com.example.demo.controller;

import com.example.demo.helper.ApiResponseBody;
import com.example.demo.model.DriverInfo;
import com.example.demo.service.DriverInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverInfoController {

    @Autowired
    private DriverInfoService driverInfoService;

    @PostMapping("/addDriverInfo")
    public ResponseEntity<DriverInfo> addDriverInfo(@RequestBody DriverInfo driverInfo){
        DriverInfo d = this.driverInfoService.addDriverInfo(driverInfo);
        return new ResponseEntity<>(d, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteDriverInfo/{id}")
    public ResponseEntity<ApiResponseBody> deleteDriverInfo(@PathVariable long id){
        String response = this.driverInfoService.deleteDriverInfo(id);
        return new ResponseEntity<>(new ApiResponseBody(response, true), HttpStatus.OK);
    }

    @GetMapping("/getDriverInfo")
    public List<DriverInfo> getUsers(){
        return this.driverInfoService.getDriversInfo();
    }

    @PutMapping("/updateDriverInfo/{id}")
    public ResponseEntity<DriverInfo> updateDriverInfo(@RequestBody DriverInfo driverInfo,@PathVariable long id){
        DriverInfo d = this.driverInfoService.updateDriverInfo(driverInfo, id);
        return new ResponseEntity<>(d, HttpStatus.CREATED);
    }

    @GetMapping("/getDriverInfo/{id}")
    public ResponseEntity<DriverInfo> getDriverInfo(@PathVariable long id){
        DriverInfo d = this.driverInfoService.getDriverInfo(id);
        return new ResponseEntity<>(d, HttpStatus.OK);
    }



}
