package com.example.demo.service;

import com.example.demo.model.DriverInfo;
import com.example.demo.repository.DriverInfoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class DriverInfoService {

    @Autowired
    private DriverInfoRepository driverRepo;

    public DriverInfo addDriverInfo(DriverInfo driverInfo){
        return this.driverRepo.save(driverInfo);
    }

    public List<DriverInfo> getDriversInfo(){
        return this.driverRepo.findAll();
    }

    public DriverInfo getDriverInfo(long id){
        return this.driverRepo.findById(id).orElse(null);
    }

    public DriverInfo updateDriverInfo(DriverInfo driverInfo, long id){
        DriverInfo d = this.getDriverInfo(id);
        d.setDriversLicence(driverInfo.getDriversLicence());
        d.setMonthlyEarnings(driverInfo.getMonthlyEarnings());
        d.setWeeklyEarnings(driverInfo.getWeeklyEarnings());
        d.setYearlyEarnings(driverInfo.getYearlyEarnings());
        return this.driverRepo.save(d);
    }



    public String deleteDriverInfo(long id){
        try {
            this.driverRepo.delete(this.getDriverInfo(id));
        } catch(Exception e){
            e.printStackTrace();
        }
        return "successfully deleted";
    }


}
