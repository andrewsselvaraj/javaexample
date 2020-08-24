package com.exam.model;

public class Employee {
	
	public Employee()
	{
		
	}
	public Employee(String empid, String empName) {
		super();
		this.empid = empid;
		this.empName = empName;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	String empid;
	String empName;

}
