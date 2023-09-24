package com.ro.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.ro.beans.Employe;
import com.ro.beans.Student;
import com.ro.resources.javaConfigFile;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfigFile.class);		//javaConfigFile.java
		Student std = context.getBean("student",Student.class);
		
		
		std.setName("Robin");
		std.setRoll(121);
		System.out.println(std.getName()+" "+std.getRoll());
		System.out.println("********************");
		Employe emp = context.getBean("employe",Employe.class);
		emp.setEmpid(13);
		emp.setName("Aishu");
		System.out.println(emp.getEmpid()+" "+emp.getName());
	}
}
