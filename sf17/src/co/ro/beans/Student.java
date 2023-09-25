package co.ro.beans;


import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Student {
	@Value("Robin Aishu")
	private String name;
	
	@Value("121")
	private int roll;
	
	@Value("[c,c++,java]")
	private List<String>subj;
	public String getName() {
		return name;
	}
	public List<String> getSubj() {
		return subj;
	}
	public void setSubj(List<String> subj) {
		this.subj = subj;
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
