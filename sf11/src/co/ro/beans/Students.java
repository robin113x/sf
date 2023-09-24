package co.ro.beans;

public class Students {
	private String name;
	private int roll;
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
	public void display() {
		System.out.println(this.name+" : "+this.roll);
	}

}
