package in.ro.beans;

public class Student {
	private String Name;
	private int roll;
	private int marks;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
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
	
	public String toString() {
		return this.roll+" : "+this.Name+" : "+this.marks;
	}
	
}
