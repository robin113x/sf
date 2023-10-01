package co.ro.bean;

import org.springframework.stereotype.Component;

@Component("stdObj")
public class Student {
	private String name;
	private int roll;
	private String phone;

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", phone=" + phone + "]";
	}

}
