package co.ro.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {

	private String name;
	private int roll;

	@Autowired
	private Subjects subj;
	@Autowired
	private Address addr;

	
	public Student(@Value("Robin hood")String name,@Value("123") int roll, Subjects subj, Address addr) {
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
