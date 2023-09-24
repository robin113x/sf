package in.ro.beans;

import javax.annotation.PostConstruct;

public class Student {
	private String name;
	private int roll;
	private int marks;
	
	public Student(int roll) {
		System.out.println("Parameter value");
	}

	@PostConstruct
	public void initStdObj() {
		name="robin";
		roll=121;
		marks=2324;
	}

	public void dispaly() {
		System.out.println(this.name+" "+this.marks+" "+this.roll);
	}
}
 