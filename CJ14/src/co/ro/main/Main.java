package co.ro.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;

import co.ro.bean.Student;
import co.ro.resources.javaConfig;
import co.ro.validators.StudentValidator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		Student std = context.getBean("stdObj",Student.class);
		std.setName("Robin Aishu");
		std.setRoll(1234);
		std.setPhone("12356778");
		
		DataBinder databinder = new DataBinder(std);
		databinder.addValidators(new StudentValidator());
		databinder.validate();
		List<ObjectError> list= databinder.getBindingResult().getAllErrors();
		System.out.println(list);
		
		System.out.println(std.toString());
	}

}
