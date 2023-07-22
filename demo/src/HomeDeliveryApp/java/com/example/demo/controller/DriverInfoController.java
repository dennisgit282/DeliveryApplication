package com.example.demo.controller;

import com.example.demo.model.DriverInfo;
import com.example.demo.service.DriverInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Driver;
import java.util.ArrayList;

@RestController
public class DriverInfoController {

    @Autowired
    DriverInfoService driverInfo;

    @GetMapping("/driverInfo")
    public ArrayList<DriverInfo> getAllDriverRecords(){
        return driverInfo.getAllDriverInfo();
    }

    @PostMapping("/driverInfo")
    public void updateDriverInfo(DriverInfo driverInformation){
        updateDriverInfo(driverInformation);
    }

    @DeleteMapping("/driverInfo/{driversLicence}")
    public void deleteDriverInfo(@PathVariable String driversLicence){
        for(int i = 0; i < driverInfo.getDriverInfoList().size(); i++){
            if(driversLicence == driverInfo.getDriverInfoList().get(i).getDriversLicence()){
                driverInfo.getDriverInfoList().remove(i);
            }
        }
    }

    @GetMapping("driverInfo/{driversLicence}")
    public DriverInfo getDriverInfo(@PathVariable String driversLicence){
        return getDriverInfo(driversLicence);
    }



}
