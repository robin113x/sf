package co.ro.beans;

import java.util.Map;

public class Student {
	
	private String name;
	private int roll;
	private Map<String,Integer> subjMarks;
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
	public Map<String, Integer> getSubjMarks() {
		return subjMarks;
	}
	public void setSubjMarks(Map<String, Integer> subjMarks) {
		this.subjMarks = subjMarks;
	}
	

}
