package co.ro.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.ro.beans.Address;
import co.ro.beans.Student;
import co.ro.beans.Subjects;

@Configuration
public class springConfig {

	@Bean
	public Address addObjM() {
		Address addObj = new Address();
		addObj.setLocation("MagarPatta");
		addObj.setCity("Pune");
		addObj.setPincode(11458);
		return addObj;
	}

	@Bean
	public Subjects subjObjM() {
		Subjects subjObj = new Subjects();
		List<String> list = new ArrayList<String>();
		// Adding elements in the List
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		subjObj.setSubj(list);
		return subjObj;
	}
	
	@Bean("StdObjm")
	public Student stdObjM() {
		Student stdObj = new Student();
		stdObj.setName("Aishuu");
		stdObj.setRoll(123654);
		stdObj.setAddr(addObjM());
		stdObj.setSubj(subjObjM());
		return stdObj;
	}
	
	

}
