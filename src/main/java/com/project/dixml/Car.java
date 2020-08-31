package com.project.dixml;

import org.springframework.stereotype.Component;

@Component
public class Car {


    public String name;

    public Car(String name) {
        this.name = name;
    }

    public Car() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
