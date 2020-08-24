package com.exam.java8.functionalInterface;

@FunctionalInterface
public interface CustomFunctionalInterface {
   void display();
   public default void anotherDefaultFunction()
   {
	  System.out.println(""); 
   }
   
   public static void anotherStaticFunction()
   {
	   
   }
}
