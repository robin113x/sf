package in.ro.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ro.beans.Student;
import in.ro.resources.springConfigFile;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext container = new AnnotationConfigApplicationContext(springConfigFile.class);
		Student stdObj = container.getBean("aishu",Student.class);
		stdObj.setName("Aishwaraya");
		stdObj.setRoll(101);
		System.out.println(stdObj.getName());
		System.out.println(stdObj.getRoll());
		System.out.println(stdObj.getClass());
		
	}
}
