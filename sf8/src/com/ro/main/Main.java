package com.ro.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ro.beans.Student;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Student.class);
		context.refresh();
		
		Student std = context.getBean("student",Student.class);
		std.setName("Robin");
		std.setRoll(121);
		System.out.println(std.getName()+" "+std.getRoll());
	}
}
