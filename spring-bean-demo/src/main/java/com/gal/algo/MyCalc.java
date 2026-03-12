package com.gal.algo;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyCalc implements Calc {
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	//act as Initialization 
	//after calling the constructor, call this method
	@PostConstruct
	public void onInit() {
		System.out.println("Initialization method for DBConnect, Websockets open, n/w connetion open");
	}
	//act as Destruction 
	@PreDestroy
	public void onDestroy() {
		System.out.println("on destroy of object : close resouces");
	}

}