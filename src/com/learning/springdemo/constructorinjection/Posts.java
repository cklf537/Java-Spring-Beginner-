package com.learning.springdemo.constructorinjection;

public class Posts implements Post {
		
	/**
	 * 
	 */
	public Posts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getAllPosts() {
		return "Get all the posts.";
	}

	@Override
	public String getTrendingPosts() {
		return "Get all the trending posts.";
	}

}
