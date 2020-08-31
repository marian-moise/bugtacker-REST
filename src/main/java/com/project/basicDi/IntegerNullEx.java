package com.project.basicDi;

public class IntegerNullEx {

    public static void main(String[] args) {
        Integer nr = 0;

        Integer intNull = null;

        System.out.println(nr);
        System.out.println(intNull);

        //intNull must be greater than 2;
        if(intNull != null && intNull > 2){
        //if(intNull > 2 && intNull != null){
            System.out.println("Geo este o floricica");
        }
    }
}
