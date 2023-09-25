package co.ro.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Student {
	@Value("Robin Aishu")
	private String name;
	
	@Value("121")
	private int roll;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
}
