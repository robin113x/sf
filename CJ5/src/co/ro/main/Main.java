package co.ro.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.ro.beans.Student;
import co.ro.beans.Teacher;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/co/ro/resources/applicationContext.xml");
		Student std = context.getBean("stdObj",Student.class);
		System.out.println(std.toString());
		
		Teacher tch = context.getBean("tchObj",Teacher.class);
		System.out.println(tch.toString());
	}
}
