package com.exam.loop;

public class Palindrome {
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Palindrome a = new Palindrome();
		a.getPolindrome("Malayalam");

	}

	private void getPolindrome(String x) {
		// TODO Auto-generated method stub
		for(int i=0;i<x.length();i++)
		{
			System.out.println(x.charAt(i));
		}
		
	}   

}
