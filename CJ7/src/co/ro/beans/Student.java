package co.ro.beans;

public class Student {
	private String name;
	private int roll;
	private Address add;

	public Student(String name,int roll,Address add) {
		this.add=add;
		this.name=name;
		this.roll=roll;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", add=" + add + "]";
	}
	
	
}
