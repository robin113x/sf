package in.ro.beans;

public class Student {
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private Address address;
	
	public void display() {
		System.out.println(this.name);
		System.out.println(this.roll);
		System.out.println(address.toString());
	}

}
