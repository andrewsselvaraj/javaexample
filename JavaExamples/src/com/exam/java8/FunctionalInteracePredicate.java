package com.exam.java8;

import java.util.Arrays;
import java.util.List;

import java.util.function.Predicate;

public class FunctionalInteracePredicate {
	
	List<String> values = Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");
	
	List<Integer> intvalue = Arrays.asList(4,5,6,71,2);
	
	public void predicateStringIMplementation(String str)
	{


		Predicate<String> predicate = (fia) -> fia.startsWith(str);
		
		for (String s : values) {
			if (predicate.test(s)) {
				System.out.println(s);
			}
		}
	}
	
	public void predicImplementationInt(int x)
	{
		Predicate<Integer> predicateInt = (fia) -> fia.intValue() > x;
		
		for(Integer si : intvalue)
		{
			System.out.println(predicateInt.test(si));
		}
		
	
	}

	public static void main(String args[]) {

		FunctionalInteracePredicate f = new FunctionalInteracePredicate();
		//f.predicateStringIMplementation("G");
		f.predicImplementationInt(3);
	}

}
