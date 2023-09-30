package com.ro.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ro.beans.Student;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext container = new ClassPathXmlApplicationContext("/com/ro/resources/applicationContext.xml");
		Student std = container.getBean("stdObj",Student.class);
		Student std2 = container.getBean("stdObj2",Student.class);
		System.out.println(std.getName());
		System.out.println(std2.getName());
	}
}
