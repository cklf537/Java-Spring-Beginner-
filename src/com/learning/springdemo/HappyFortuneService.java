package com.learning.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	String[] fortunes = {"Your are luckey.", "You are beautiful.", "You area rock star."};
	static int rnd = 0;
	
	@Override
	public String getFortune() {
		if(!(fortunes.length <= 0)) {
			rnd = new Random().nextInt(fortunes.length);
		}
		return fortunes[rnd];
	}

}
