package com.gal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gal.algo.WordCounter;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.gal");
		context.refresh();
		WordCounter counter = context.getBean(WordCounter.class);
		System.out.println(counter.createMapResult());
		context.close();
	}
}
