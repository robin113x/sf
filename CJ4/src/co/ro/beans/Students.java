package co.ro.beans;

public class Students {
	private String name;
	private int roll;
	private float marks;

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

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
	}
	
	

}
