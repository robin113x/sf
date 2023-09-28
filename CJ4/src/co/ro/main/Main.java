package co.ro.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.ro.beans.Students;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/co/ro/resources/applicationContext.xml");
		Students std = context.getBean("stdObj",Students.class);
		System.out.println(std.toString());
	}
}
