package com.ro.beans;

import org.springframework.stereotype.Component;

@Component
public class Employe {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	private int empid;
}
