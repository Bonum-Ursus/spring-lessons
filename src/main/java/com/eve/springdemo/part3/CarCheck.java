package com.eve.springdemo.part3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarCheck {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(CarConfig.class);
        Car car1 = context.getBean("fordFocus", Car.class);
        Car car2 = context.getBean("toyotaPrius", Car.class);

        car1.getCarInfo();
        car1.getEngineInfo();
        System.out.println("*********************");
        car2.getCarInfo();
        car2.getEngineInfo();
        context.close();
    }
}
