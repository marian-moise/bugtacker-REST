package com.project.dixml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Parcare {

    @Autowired
    private List<Car> carInParking;


    public Parcare(List<Car> carInParking) {
        this.carInParking = carInParking;
    }

    public Parcare() {
    }

    @Override
    public String toString() {
        return "Parcare{" +
                "carInParking=" + carInParking +
                '}';
    }
}
