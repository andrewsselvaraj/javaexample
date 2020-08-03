package com.exam.program;

public class Employee {
	
	String name;
	String age;
	String[] skills = null;
	public Employee()
	{
		
	}
	public Employee(String[] skills) {
		super();

		this.skills = skills;
	}
	public Employee(String name, String age, String[] skills) {
		super();
		this.name = name;
		this.age = age;
		this.skills = skills;
	}

}
