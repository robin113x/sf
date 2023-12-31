package co.ro.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.ro.beans.Student;

public class Main {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/co/ro/resources/applicationContext.xml"
				);
		Student std = context.getBean("stdObj",Student.class);
		System.out.println(std.getName());
		System.out.println(std.getRoll());
		System.out.println(std.getSubjMarks());
	}

}
 