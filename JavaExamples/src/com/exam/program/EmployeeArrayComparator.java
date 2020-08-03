package com.exam.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeArrayComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		String[] a =o1.skills;
		String[] b =o2.skills;
		boolean equal=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i].equalsIgnoreCase(b[i]))
			{
			equal = true;	
		
			}
			else
			{
				equal = false;	
				i = a.length;
			}
			
			
			
		}
		if(equal)
		{
			return 1;
		}
		else
		{
		return -1;
		}
	}
	
}


