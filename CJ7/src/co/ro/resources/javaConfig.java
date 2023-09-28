package co.ro.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.ro.beans.Address;
import co.ro.beans.Student;

@Configuration
public class javaConfig {
	
	@Bean("addObj")
	public Address createAdd() {
		return new Address("MIT ADT","Pune",800025,"Maharastra");
		
	}
	
	@Bean("stdObj")
	public Student createStd() {
		Student std = new Student("Aishu",112,createAdd());
		return std;
	}
	

}
