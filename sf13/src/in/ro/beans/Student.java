package in.ro.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name;
	private int roll;
	private int marks;
	
	public Student(int roll) {
		System.out.println("Parameter value");
	}

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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void dispaly() {
		System.out.println(this.name+" "+this.marks+" "+this.roll);
	}
}
 