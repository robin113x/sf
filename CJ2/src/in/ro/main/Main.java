package in.ro.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ro.beans.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/ro/resources/applicationContext.xml");

		Student std = context.getBean("std", Student.class);

		std.display();

	}

}
