package co.ro.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.ro.beans.Address;
import co.ro.beans.Student;

@Configuration
public class javaConfig {
	
	@Bean("addObj")
	public Address createAdd() {
		Address ad = new Address();
		ad.setCity("Pune");
		ad.setLocation("MIT ADT");
		ad.setPincode(800025);
		ad.setState("Maharastra");
		return ad;
	}
	
	@Bean("stdObj")
	public Student createStd() {
		Student std = new Student();
		std.setName("Aishu");
		std.setRoll(121);
		std.setAdd(createAdd());
		return std;
	}
	

}
