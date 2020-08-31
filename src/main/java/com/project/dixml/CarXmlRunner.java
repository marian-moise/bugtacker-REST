package com.project.dixml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class CarXmlRunner {

    public static void main(String[] args) {
        //todo load based on env
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("carContext.xml");

        Parcare parcare = context.getBean("parcare", Parcare.class);

        System.out.println(parcare);

        List listaDeMasini = context.getBean("listaDeMasini", List.class);

        System.out.println(listaDeMasini);

    }
}
