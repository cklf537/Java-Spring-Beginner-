package com.learning.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach baseBallCoach = context.getBean("myBaseBallCoach", Coach.class);
		Coach golfCoach = context.getBean("myGolfCoach", Coach.class);
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
//		System.out.println(baseBallCoach.getDailyWorkout());
//		System.out.println(golfCoach.getDailyWorkout());
		System.out.println(baseBallCoach.getDailyFortunes());
//		System.out.println(baseBallCoach.getAllPosts());
//		System.out.println(baseBallCoach.getTrendingPosts());
//		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(theCoach.getEmailAddress()); 
//		System.out.println(theCoach.getTeam());

		context.close();

	}

}
