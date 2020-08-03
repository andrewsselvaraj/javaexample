package com.exam.java8;

import java.util.function.BiFunction;

public class Java8BiFunction {

    public static void main(String[] args) {

        // BiFunction
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;

        Integer result = func.apply(2, 3);

        System.out.println("Bifunction is methodh which accepts 2 parameters and returns 1 value of same type"); // 5
        
        System.out.println(result); // 5
        
        BiFunction<String, String, String> funcstr = (x1, x2) -> x1 + x2;

        String result1 = funcstr.apply("2","3");

  
    }

}
