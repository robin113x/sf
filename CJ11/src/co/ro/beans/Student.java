package co.ro.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private String name;
	private int roll;
	
	@Autowired
	private Subjects subj;
	@Autowired
	private Address addr;

	

	public void setName(String name) {
		this.name = name;
	}



	public void setRoll(int roll) {
		this.roll = roll;
	}



	public void setSubj(Subjects subj) {
		this.subj = subj;
	}



	public void setAddr(Address addr) {
		this.addr = addr;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "\nsubj=" + subj + "\naddr=" + addr + "]";
	}
}
