package com.eve.springdemo.part1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach1 = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach1.getDailyFortune());
		System.out.println(theCoach1.getDailyWorkout());
		
		CricketCoach theCoach2 = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(theCoach2.getDailyWorkout());
		System.out.println(theCoach2.getDailyFortune());
		System.out.println(theCoach2.getTeam());
		System.out.println(theCoach2.getEmailAddress());

		context.close();
	}
}
