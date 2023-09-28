package co.ro.beans;

public class Teacher {
	private String name;
	private String subj;
	private Students std;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubj() {
		return subj;
	}
	public void setSubj(String subj) {
		this.subj = subj;
	}
	public Students getStd() {
		return std;
	}
	public void setStd(Students std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subj=" + subj + ", std=" + std + "]";
	}

}
