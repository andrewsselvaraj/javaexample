package com.exam.java8.LamdaEpression;

import com.exam.java8.functionalInterface.Square;
public class SquareLamda {

	public static void main(String[] args) {
		Square s = (int x)->x*x;
		
		int a=1000;
		
		int ans = s.calculate(a);
		
		System.out.println(ans);
		
		

	}

}
