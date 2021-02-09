package com.docker.rahul;

public class HelloPing {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello World " + i);
			Thread.sleep(1000);
		}
	}
}
