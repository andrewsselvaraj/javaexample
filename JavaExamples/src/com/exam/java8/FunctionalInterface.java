package com.exam.java8;

import java.util.ArrayList;
import java.util.List;

public class FunctionalInterface {
	
	public static void printAllData(List<String> a)
	{
		for(int i=0;i<a.size();i++)
		{
		System.out.println("tradtional"+a.get(i));
		}
	}

	public static void main(String[] args) {
		
		
		List<String> a = new ArrayList<String>();
		a.add(""+5);
		a.add(""+3);
		a.add(""+5);
		a.add(""+4);
		a.add(""+6);
		//printAllData(a);
		// TODO Auto-generated method stub
		printFunctionalInterface(a);

	}

	private static void printFunctionalInterface(List<String> a) {
		// TODO Auto-generated method stub
		a.stream().forEach(andrew->System.out.println(andrew));
		
	}

}
