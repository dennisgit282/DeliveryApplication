package com.example.demo.service;

import com.example.demo.model.CarInfo;
import com.example.demo.repository.CarInfoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Data
public class CarInfoService {
    @Autowired
    CarInfoRepository carInfoRepository;

    public CarInfo addCarInfo(CarInfo carInfo){
        return this.carInfoRepository.save(carInfo);
    }

    public CarInfo getCarInfo(long id){
        return this.carInfoRepository.findById(id).orElse(null);
    }

    public List<CarInfo> getAllCarInfo(){
        return this.carInfoRepository.findAll();
    }


    public String deleteCarInfo(long id){
        try{
            this.carInfoRepository.deleteById(id);
        } catch(Exception e){
            e.printStackTrace();
        }

        return "successfully deleted";
    }

    public CarInfo updateCarInfo(CarInfo carInfo, long id){
        CarInfo c = this.getCarInfo(id);
        c.setVIN(carInfo.getVIN());
        c.setUser(carInfo.getUser());
        c.setMake(carInfo.getMake());
        c.setModel(carInfo.getModel());
        return this.carInfoRepository.save(c);
    }

}
