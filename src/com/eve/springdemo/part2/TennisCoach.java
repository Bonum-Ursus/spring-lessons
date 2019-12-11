package com.eve.springdemo.part2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//В скобках анотации можно не указывать bean id.
//Автомтически bean id будет представлен как имя класса (первая буква строчная).
@Component("tennisCoach")
public class TennisCoach implements Coach{

//    Dependency injection by field
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

/*
//  Dependency injection by setter
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

/*
//  Dependency injection by constructor
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Just play 10 games";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void getTennisCoachOrder(){
        System.out.println("Keep calm and play the game");
    }

}
