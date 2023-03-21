package com.exam.java8;

import java.util.ArrayList;

import com.exam.java8.functionalInterface.LoginFunctionalInterface;
import com.exam.model.Employee;

public class FunctionalInterfaceImplemenationforLogin {

	public static void main(String arg[])
	{
		ArrayList<Employee> a = new ArrayList<Employee>();
		
		a.add(new Employee("idss0","ssssssvalue1"));
		a.add(new Employee("idss1","ssssssvalue2"));
		a.add(new Employee("idss2","ssssssvalue3"));
		
		Employee emploee= new Employee("idss2","ssssssvalue3");
		
		LoginFunctionalInterface fi= (x) -> { 
	 
		return x;
	 
			
		};
		
		 
		
		
		//LoginfunctionalInterface.()->{};
	}
}
