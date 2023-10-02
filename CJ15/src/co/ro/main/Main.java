package co.ro.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.MapBindingResult;
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
		std.setName("Robin");
		std.setRoll(01);
		std.setPhone("1235771182");

		Map<String,Object>map = new HashMap<String, Object>();
		MapBindingResult mapbindingResult = new MapBindingResult(map, "myMapObj");
		
		StudentValidator stdvalid = context.getBean(StudentValidator.class);
		stdvalid.validate(std, mapbindingResult);
		
		
		List<ObjectError> list = mapbindingResult.getAllErrors() ;
		if (!list.isEmpty()) {
			for (ObjectError oe : list) 
				System.out.println(oe.getDefaultMessage());
		} else
			System.out.println(std.toString());
	}

}
