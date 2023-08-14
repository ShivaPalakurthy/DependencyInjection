package com.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String args[]) {
		System.out.println("Hello Admin Welcome back");
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		Employee emp1=(Employee) context.getBean("employee1");
		System.out.println(emp1);
		Employee emp=(Employee) context.getBean("emp");
		emp.show();
	}
}
