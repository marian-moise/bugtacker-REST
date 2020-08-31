package com.project.diannot;

import com.project.dixml.Car;
import com.project.dixml.Parcare;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;


public class CarConfiguration {

    @Value("${car.name}")
    private String carName;

    @Value("${car.brand.name}")
    private String brandNames;

    @Bean
    public Car primaMeaMasina(){
        Car car = new Car();
        car.setName(brandNames);
        return car;
    }

    @Bean
    public Car aDouaMasina(){
        Car car = new Car();
        car.setName(carName);
        return car;
    }

//    @Bean
//    public List<Car> getCars(){
//        List<Car> c = new ArrayList<Car>();
//        c.add(primaMeaMasina());
//        c.add(aDouaMasina());
//        return  c;
//    }




    @Bean
    public Parcare parcare(){
        return new Parcare();
    }



}
