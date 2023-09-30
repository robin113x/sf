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

	@Bean("subjObj1")
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
	
	
	@Bean("subjObj2")
	public Subjects subjObjM2() {
		Subjects subjObj = new Subjects();
		List<String> list = new ArrayList<String>();
		// Adding elements in the List
		list.add("Mango1");
		list.add("Apple2");
		list.add("Banana3");
		list.add("Grapes4");
		subjObj.setSubj(list);
		return subjObj;
	}
	
	
	@Bean("StdObjm")
	public Student stdObjM() {
		Student stdObj = new Student();
		stdObj.setName("Aishuu Roy");
		stdObj.setRoll(123654);
		
		return stdObj;
	}
	
	

}
