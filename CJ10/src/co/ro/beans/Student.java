package co.ro.beans;

public class Student {

	private String name;
	private int roll;
	private Subjects subj;
	private Address addr;
	
	public Student(String name, int roll, Subjects subj, Address addr) {
		super();
		this.name = name;
		this.roll = roll;
		this.subj = subj;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "\nsubj=" + subj + "\naddr=" + addr + "]";
	}
}
