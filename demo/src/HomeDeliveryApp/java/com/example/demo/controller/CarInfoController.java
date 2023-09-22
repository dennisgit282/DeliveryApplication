package com.example.demo.controller;

import com.example.demo.model.CarInfo;
import com.example.demo.service.CarInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarInfoController {
    @Autowired
    private CarInfoService carInfoService;

    @PostMapping("/addCarInfo")
    public ResponseEntity<CarInfo> addCarInfo(@RequestBody CarInfo carInfo){
        CarInfo c = this.carInfoService.addCarInfo(carInfo);
        return new ResponseEntity<>(c, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteMapping/{id}")
    public void deleteCarInfo(long id){
        carInfoService.getCarInfoRepository().deleteById(id);
    }

    @GetMapping("/getCarInfo")
    public List<CarInfo> getAllCarInfo(){
        return this.carInfoService.getCarInfoRepository().findAll();
    }

    @GetMapping("/getCarInfo/{id}")
    public ResponseEntity<CarInfo> getCarInfo(long id){
        CarInfo c = this.carInfoService.getCarInfo(id);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    @PutMapping("/updateCarInfo/{id}")
    public ResponseEntity<CarInfo> updateCarInfo(@RequestBody CarInfo carInfo, @PathVariable long id){
        CarInfo c = this.carInfoService.updateCarInfo(carInfo, id);
        return new ResponseEntity<>(c, HttpStatus.CREATED);
    }

}
