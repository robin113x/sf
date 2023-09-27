package co.ro.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.ro.beans.Students;
import co.ro.beans.Teacher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/co/ro/resources/applicationContext.xml"
				);
		Students std = context.getBean("stdObj",Students.class);
		Teacher tch = context.getBean("tchObj",Teacher.class);
		
		System.out.println(std.display());
		System.out.println(tch.display());
	}

}
