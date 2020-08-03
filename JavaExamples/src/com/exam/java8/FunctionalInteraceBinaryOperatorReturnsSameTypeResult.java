package com.exam.java8;

import java.util.Arrays;
import java.util.List;

import java.util.function.Predicate;

import java.util.function.BinaryOperator;

public class FunctionalInteraceBinaryOperatorReturnsSameTypeResult {
	
	public void binaryOperatorString()
	{
		List<String> values = Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");

		Predicate<String> predicate = (fia) -> fia.startsWith("G");
		for (String s : values) {
			if (predicate.test(s)) {
				System.out.println(s);
			}
		}
	}

	public static void main(String args[]) {

		FunctionalInteraceBinaryOperatorReturnsSameTypeResult f = new FunctionalInteraceBinaryOperatorReturnsSameTypeResult();
		f.binaryOperatorString();
	}

}
