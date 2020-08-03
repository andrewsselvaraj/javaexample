package com.exam.java8.LamdaEpression;

import com.exam.java8.functionalInterface.CustomFunctionalInterface;

public class CustomeLamda {

	public static void main(String[] args) {
	 
			CustomFunctionalInterface cfi = ()->{System.out.println("hi");};
		

			cfi.display();
	}

}
