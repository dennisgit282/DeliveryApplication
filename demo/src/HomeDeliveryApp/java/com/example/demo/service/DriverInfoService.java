package com.example.demo.service;

import com.example.demo.model.DriverInfo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Driver;
import java.util.ArrayList;

@Service
@Data
public class DriverInfoService {

  @Autowired
  ArrayList<DriverInfo> driverInfoList;

  public void updateDriverInfo(DriverInfo driverInfo){

      driverInfoList.add(driverInfo);
  }

  public ArrayList<DriverInfo> getAllDriverInfo(){
      return driverInfoList;
  }

  public void deleteDriverInfo(String driversLicence){
      for(int i = 0; i < driverInfoList.size(); i++){
          if(driverInfoList.get(i).getDriversLicence() == driversLicence){
              driverInfoList.remove(i);
          }
      }
  }

  public DriverInfo getDriverInfo(String driversLicence){
      for(int i = 0; i < driverInfoList.size(); i++){
          if(driverInfoList.get(i).getDriversLicence() == driversLicence){
              return driverInfoList.get(i);
          }
      }
      return null;
  }


}
