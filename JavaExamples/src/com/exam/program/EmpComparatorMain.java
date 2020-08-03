package com.exam.program;

import java.util.Arrays;
import java.util.Scanner;

public class EmpComparatorMain {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);


        int n = scan.nextInt();



        Employee[] emp = new Employee[n];
        
        for(int i = 0; i < n; i++){

        	String[] a = {"skill"+1000+i,"kill"+2000+i};
        	//emp[i] = new Employee("name"+i, "arr"+i+20,a);
        	emp[i] = new Employee(a);


        }
        EmployeeArrayComparator eac = new EmployeeArrayComparator();
        Arrays.sort(emp,eac);
        
        for(int i = 0; i < emp.length; i++){


            System.out.println( "result"+emp[i].name +"-"+emp[i].skills[0]+" - "+emp[i].skills[1]+" "+emp[i].age);


        }

        scan.close();
        
	}


}
