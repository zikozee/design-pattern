package com.example.simplefactory;

public class Client {

	public static void main(String[] args) {

		Post post = PostFactory.createPost("news");
		System.out.println(post);
	}

}
