package com.exam.program;

import java.util.Scanner;

public class AddingTwoNos {

	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	float n1 = input.nextFloat();
	float n2 = input.nextFloat();
	
	float result = n1 + n2;
	
	System.out.println((int)result);
	}
}
