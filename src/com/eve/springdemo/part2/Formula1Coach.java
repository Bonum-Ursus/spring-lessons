package com.eve.springdemo.part2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Formula1Coach implements Coach{
    @Autowired
    @Qualifier("databaseFortuneService")
    private FortuneService fortuneService;


//    public Formula1Coach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Drive 10 laps as fast and safe as you can.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
