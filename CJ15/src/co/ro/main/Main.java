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
		Student std = context.getBean(Student.class);
		std.setName("");
		std.setRoll(0);
		std.setPhone("123577182");

		DataBinder databinder = new DataBinder(std);
		databinder.addValidators(new StudentValidator());
		databinder.validate();
		List<ObjectError> list = databinder.getBindingResult().getAllErrors();
		if (!list.isEmpty()) {
			for (ObjectError oe : list) 
				System.out.println(oe.getDefaultMessage());
		} else
			System.out.println(std.toString());
	}

}
