package co.ro.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.ro.beans.Students;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("/co/ro/resources/applicationContext.xml");
		Students stdO = context.getBean("stdObj",Students.class);
		stdO.display();
		System.out.println(stdO);
		
		Students stdO1 = context.getBean("stdObj",Students.class);
		System.out.println(stdO1);
		Students stdO2 = context.getBean("stdObj",Students.class);
		System.out.println(stdO2);
	}

}
