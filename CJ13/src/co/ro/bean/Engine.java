package co.ro.bean;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	public void engineStart() {
		System.out.println("Engine is Started...");
	}
	public String engineType() {
		return "v6.721";
	}

}
