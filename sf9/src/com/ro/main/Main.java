package com.ro.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ro.beans.Employe;
import com.ro.beans.Student;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/ro/resources/applicationContext.xml");
		Student std = context.getBean("stdObj",Student.class);
		std.setName("Robin");
		std.setRoll(121);
		System.out.println(std.getName()+" "+std.getRoll());
		System.out.println("********************");
		Employe emp = context.getBean("empObj",Employe.class);
		emp.setEmpid(13);
		System.out.println(emp.getEmpid());
	}
}
