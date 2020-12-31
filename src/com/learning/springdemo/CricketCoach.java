package com.learning.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneservice;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("Cricket coach inside constructor");
	}
	
	//our setter method.
	public void setFortuneService(FortuneService fortuneservice) {
		System.out.println("inside setter method: cricket coach.");
		this.fortuneservice = fortuneservice;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Email Address");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Team.");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Net pratice every day for 3hrs.";
	}

	@Override
	public String getDailyFortunes() {
		return fortuneservice.getFortune();
	}

	@Override
	public String getAllPosts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTrendingPosts() {
		// TODO Auto-generated method stub
		return null;
	}

}
