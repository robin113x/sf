package co.ro.beans;

public class Students {
	private String name;
	private int roll;
	private Teacher tch;
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
	public Teacher getTch() {
		return tch;
	}
	public void setTch(Teacher tch) {
		this.tch = tch;
	}
	
	public String display() {
		return "Students [name=" + name + ", roll=" + roll + ", tch=" + tch + "]";
	}
	
	
	
}
