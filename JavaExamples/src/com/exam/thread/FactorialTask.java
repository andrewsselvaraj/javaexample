package com.exam.thread;

import java.util.concurrent.Callable;

public class FactorialTask implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		Integer a = new Integer(7777);
		
		return a;	
		}

}
