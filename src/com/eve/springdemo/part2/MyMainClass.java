package com.eve.springdemo.part2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MyMainClass {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("part2applicationContext.xml");
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);
        Coach formula1Coach = context.getBean("formula1Coach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        for (int i = 0; i < 10; i++) {
            System.out.println(theCoach.getDailyFortune());
        }
//        System.out.println(tennisCoach.getName());
//        System.out.println(tennisCoach.getEmail());
//        tennisCoach.getTennisCoachOrder();
//        System.out.println(formula1Coach.getDailyWorkout());

        context.close();
    }
}
