package com.eve.springdemo.part1;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	public TrackCoach(FortuneService theFortuneService) {

		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune(){
		
		return "Just do it! " + fortuneService.getFortune();
	}

	public void myInitMethod(){
		System.out.println("My init method. " + this);
	}
	public void myDestroyMethod(){
		System.out.println("My destroy method. " + this);
	}

}
