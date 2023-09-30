package in.ro.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ro.beans.Student;

public class MAin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext container = new ClassPathXmlApplicationContext("/in/ro/resources/applicationContext.xml");
		Student std = (Student)container.getBean("stdObj");
		System.out.println(std.toString());
	}

}
