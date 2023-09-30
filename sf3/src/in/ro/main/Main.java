package in.ro.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ro.beans.Employee;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext container = new ClassPathXmlApplicationContext("/in/ro/resources/applicationContext.xml");
		Employee emp = (Employee)container.getBean("EmpObj");
		System.out.println(emp.getId());
		System.out.println(emp.getLocation());
		System.out.println(emp.getName());
		System.out.println(emp.getPost());
	}
}
