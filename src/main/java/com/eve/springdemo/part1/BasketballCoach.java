package com.eve.springdemo.part1;

public class BasketballCoach implements Coach{
	
	private FortuneService fortuneService;
	public BasketballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Jump 100*3";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
