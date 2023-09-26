package co.ro.beans;

public class Student {
	private String name;
	private int roll;
	private int marks;
	public Student(String name,int roll,int marks) {
		this.name=name;
		this.roll=roll;
		this.marks=marks;
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.roll);
		System.out.println(this.marks);
	}
}
