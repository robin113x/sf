package co.ro.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import co.ro.bean.Student;

public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		boolean b=Student.class.equals(clazz);
		return b;
	}

	@Override
	public void validate(Object target, Errors errors) {
		Student stdObj = (Student)target;
		if(stdObj.getRoll()<=0) errors.rejectValue("Roll", "key_ROll", "Roll no is not valid"); 
		if(stdObj.getName().equals("") || stdObj.getName().equals("null")) errors.rejectValue("Name", "Invalid Name");
		if(stdObj.getPhone().length()!=10) errors.rejectValue("Phone","Chal bee" ,"Not valid");
		
				
	}
	

}
