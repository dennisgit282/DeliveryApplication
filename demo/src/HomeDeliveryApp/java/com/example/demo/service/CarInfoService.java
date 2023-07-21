package com.example.demo.service;

import com.example.demo.model.CarInfo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Data
public class CarInfoService {
    @Autowired
    ArrayList<CarInfo> carInfoList;

    public ArrayList<CarInfo> getAllCarInfo(){
        return carInfoList;
    }

    public void updateCarInfo(CarInfo carInfo){
        carInfoList.add(carInfo);
    }

    public void deleteCarInfo(String VIN){
        for(int i = 0; i < carInfoList.size(); i++){
            if(getCarInfoList().get(i).getVIN() == VIN){
                carInfoList.remove(i);
            }
        }
    }


}
