package co.ro.beans;

public class Teacher {
	private String name;
	private String subj;
	private Student std;
	public Teacher(String name,String subj,Student std) {
		this.name=name;
		this.subj=subj;
		this.std=std;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subj=" + subj + ", std=" + std + "]";
	}
	

}
