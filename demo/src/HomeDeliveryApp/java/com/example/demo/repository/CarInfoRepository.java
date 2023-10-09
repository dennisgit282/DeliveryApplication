package com.example.demo.repository;

import com.example.demo.model.CarInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarInfoRepository extends JpaRepository<CarInfo, Long> {


}

