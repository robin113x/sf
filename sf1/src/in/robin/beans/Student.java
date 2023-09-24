package in.robin.beans;

public class Student {
	private String name;
	private int rollNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void dispaly() {
		System.out.println("Name : "+this.name);
		System.out.println("Roll : "+this.rollNo);
	}
	public String toString() {
		System.out.println("Name :  Roll");
		return this.name+" : "+this.rollNo;
	}
	
}
