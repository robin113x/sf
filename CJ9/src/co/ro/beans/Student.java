package co.ro.beans;

public class Student {
	private String name;
	private int roll;
	private Address addObj;
	private Subjects subjObj;

	public Subjects getSubjObj() {
		return subjObj;
	}

	public void setSubjObj(Subjects subjObj) {
		this.subjObj = subjObj;
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

	public Address getAddObj() {
		return addObj;
	}

	public void setAddObj(Address addObj) {
		this.addObj = addObj;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "\n addObj=" + addObj + "\n subjObj=" + subjObj + "]";
	}

}
