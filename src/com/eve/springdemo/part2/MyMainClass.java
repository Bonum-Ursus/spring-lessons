package com.eve.springdemo.part2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMainClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("part2applicationContext.xml");
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);
        Coach formula1Coach = context.getBean("formula1Coach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
//        tennisCoach.getTennisCoachOrder();
//        System.out.println(formula1Coach.getDailyWorkout());

        context.close();
    }
}
