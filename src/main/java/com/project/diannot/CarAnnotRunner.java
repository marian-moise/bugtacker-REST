package com.project.diannot;

import com.project.dixml.Parcare;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarAnnotRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(CarConfiguration.class);

        Parcare p = context.getBean("parcare", Parcare.class);

        System.out.println(p);
    }
}
