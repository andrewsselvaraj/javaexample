package com.exam.java8.streams;

import java.util.ArrayList;

import com.exam.model.Employee;

public class StreamExample {
	
	public static void main(String args[])
	{
		ArrayList<Employee> a = new ArrayList<Employee>();
		a.add(new Employee("oioi","ajklsjdklajskl"));
		a.add(new Employee("oioi","ajklsjdklajskl"));
		a.add(new Employee("oioi","ajklsjdklajskl"));		
		a.add(new Employee("oioi","ajklsjdklajskl"));
		
		System.out.println(a.stream().count());
		//System.out.println(a.stream().filter(predicate));
		
		
	}

}
