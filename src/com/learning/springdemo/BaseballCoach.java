package com.learning.springdemo;

import com.learning.springdemo.constructorinjection.Posts;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	private Posts posts;
	
	/**
	 * @param fortuneService
	 * @param posts
	 */
	public BaseballCoach(FortuneService fortuneService, Posts posts) {
		super();
		this.fortuneService = fortuneService;
		this.posts = posts;
	}
		
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting pratice";
	}

	@Override
	public String getDailyFortunes() {
		return fortuneService.getFortune();
	}

	@Override
	public String getAllPosts() {
		return posts.getAllPosts();
	}

	@Override
	public String getTrendingPosts() {
		return posts.getTrendingPosts();
	}

}
