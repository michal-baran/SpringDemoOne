package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//create no argument constructor
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();	
	}
}
