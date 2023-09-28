package co.ro.beans;

public class Student {
	private String name;
	private int roll;
	private Address add;
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
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", add=" + add + "]";
	}
	
	
}
