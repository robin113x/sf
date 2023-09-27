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

	
	public String display() {
		System.out.println("Student : "+std.getName());
		System.out.println(std.getRoll());
		String ans="Teacher [name=" + this.name + ", subj=" + this.subj + ", std=" + this.std + "]";
		return ans;
	}

}
