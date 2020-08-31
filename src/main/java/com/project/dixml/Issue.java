package com.project.dixml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Issue {

    @Autowired
    private List<Car> carInParking;


    public Issue(List<Car> carInParking) {
        this.carInParking = carInParking;
    }

    public Issue() {
    }

    @Override
    public String toString() {
        return "Parcare{" +
                "carInParking=" + carInParking +
                '}';
    }
}
