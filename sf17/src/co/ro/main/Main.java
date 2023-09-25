package co.ro.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.ro.beans.Student;
import co.ro.resources.javaConfig;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings({  "resource" })
		ApplicationContext context = new AnnotationConfigApplicationContext(
				javaConfig.class
				);
		Student std = context.getBean("student",Student.class);
		System.out.println(std.getName());
		System.out.println(std.getSubj());
		

	}

}
