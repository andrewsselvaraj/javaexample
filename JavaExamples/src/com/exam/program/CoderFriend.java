package com.exam.program;

import java.util.Scanner;

public class CoderFriend {
	
	public int userScore(char[] a)
	{
		int score = 0;
		for(int i=0;i<a.length;i++)
		{
			String str = ""+a[i];
			if (str.equalsIgnoreCase("E"))
			{
				score = score+ 1;
			}
			if (str.equalsIgnoreCase("M"))
			{
				score = score+ 3;
			}
			if (str.equalsIgnoreCase("H"))
			{
				score = score+ 5;
			}
		}
		return score;
	}
	
	public void fineBestScorer(String e,String b)
	{
		char[] es= e.toCharArray();
		int erc=userScore(es);
		System.out.println("Eric Score"+erc);
		char[] eb= b.toCharArray();
		int boc=userScore(eb);
		System.out.println("BOB Score"+boc);
		if(erc<boc)
		{
			System.out.println("Bob is winner");
		}
		if(erc>boc)
		{
			System.out.println("Eric is winner");
		}
		if(erc==boc)
		{
			System.out.println("TIE");
		}
	
	}

	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	String erica = input.next();
	String bob = input.next();
	
	CoderFriend x= new CoderFriend();
	x.fineBestScorer(erica,bob);
	
	
	}
}
