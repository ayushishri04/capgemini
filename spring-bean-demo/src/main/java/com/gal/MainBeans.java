package com.gal;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gal.algo.Calc;
import com.gal.algo.PasswordHasher;
public class MainBeans {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//which package to scan for annotations : @Component
		context.scan("com.gal");
		context.refresh();
		PasswordHasher bean = context.getBean(PasswordHasher.class);
		System.out.println(bean);
		PasswordHasher bean2 = context.getBean(PasswordHasher.class);
		System.out.println(bean2);
		System.out.println(bean.hashPassword("hello"));
		StringBuilder bean3= context.getBean(StringBuilder.class);
		System.out.println(bean3);
		Calc bean4=context.getBean(Calc.class);
		int sum=bean4.add(4,5);
		System.out.println(sum);

		String[] bean5 = context.getBeanDefinitionNames();
		for(String name : bean5) {
			System.out.println(name);
		}

		//create an object of data source and inject into the string context
		
		DataSource ds = context.getBean(DataSource.class);
		System.out.println("Datasource created: " + ds);
		context.close();
		

	}
}
