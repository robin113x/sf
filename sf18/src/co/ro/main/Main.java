package co.ro.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.ro.beans.Student;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/co/ro/resources/applicationContext.xml"
				);
		Student std = context.getBean("stdObj",Student.class);
		std.display();
	}

}
