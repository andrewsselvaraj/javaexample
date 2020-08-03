package com.exam.program;

import java.util.Scanner;

public class ClosedPath {
	

	
	public void fineBestScorer(String cpstr)
	{
		char[] a= cpstr.toCharArray();
				int score = 0;
		for(int i=0;i<a.length;i++)
		{
			String str= ""+a[i];
			if (
					str.equals("0") || str.equals("4") || str.equals("6") || str.equals("9")
				)
			{
				score = score+ 1;
				System.out.println(a[i]);
			}
			else if (str.equals("8"))

			{
				System.out.println(a[i]);				
				score = score+ 2;
			}
	
		}
		System.out.println(score);
		
	}

	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	String cpstr = input.next();

	
	ClosedPath x= new ClosedPath();
	x.fineBestScorer(cpstr);
	
	
	}
}
