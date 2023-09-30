package co.ro.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	private String name;
	
	@Autowired
	private Engine engine;
	public void setname(String name) {
		this.name=name;
	}
	
	public void carStart() {
		engine.engineStart(); 
		System.out.println(name+ " :"+engine.engineType()  + "  is Started ........ burummmmm...."  );
	}

}
 