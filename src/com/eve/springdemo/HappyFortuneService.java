package com.eve.springdemo;

public class HappyFortuneService implements FortuneService{
	public String getFortune() {
		return "Today is your lucky day!";
	}
}