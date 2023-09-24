package co.ro.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.ro.beans.Student;
import co.ro.beans.Teacher;
import co.ro.resources.*;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext container = new AnnotationConfigApplicationContext(
				studConfig.class,
				teacherConfig.class);

		Student sObj = (Student) container.getBean("stdObj");
		Teacher tObj = (Teacher) container.getBean("tech");

		System.out.println("____________Teacher_______________");
		System.out.println(tObj.getName() + "\t\t " + tObj.getId());
		System.out.println("____________Student_______________");
		System.out.println(sObj.getName() + "\t\t " + sObj.getRoll());
	}
}
