package co.ro.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.ro.beans.Student;
import co.ro.resources.springConfig;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(springConfig.class);
		Student stdObj = context.getBean("student",Student.class);
		System.out.println(stdObj.toString());
	}

}
