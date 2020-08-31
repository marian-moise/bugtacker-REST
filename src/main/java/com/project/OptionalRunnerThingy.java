package com.project;

import com.project.dixml.Car;

import java.util.Optional;

public class OptionalRunnerThingy {

    public static void main(String[] args) {

        //Car c= null;
        /*Car c= new Car("roz bonbon");

        if(c != null){
            //c.setName("asdas");
            System.out.println(c.getName());
        } else {
            System.out.println("Car este null");
        }*/

        Car c = new Car("roz bonbon");
        Optional<Car> carOptional = Optional.ofNullable(c);

        if(carOptional.isPresent()){
            System.out.println(c.getName());
        }else {
            System.out.println("Car este null");
        }

    }

    public Car getMySpecialCar(){
        //luam din baza de date
        if(1 > 5){
            return new Car();
        } else {
            return null;
        }
    }

    public Optional<Car> getMySpecialCar2(){
        // aici ne prefacem ca luam din db;
        Car carFromDb = null;

        return Optional.ofNullable(carFromDb);
    }

    public void divide(int a, int b){
        if(b == 0){
            throw new IllegalStateException("The divide method cannot be called with this value");
        }
    }
}
