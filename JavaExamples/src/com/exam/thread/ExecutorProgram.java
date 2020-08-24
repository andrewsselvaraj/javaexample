package com.exam.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorProgram {

	public static void main(String args[])
	{
		//ThreadPoolExecutor tp = Executors.newFixedThreadPool(5);
        ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        executor.submit(new FactorialTask());
        System.out.println("POOL SIZE : "+ executor.getPoolSize());
        executor.submit(new FactorialTask());
        executor.shutdown();
        System.out.println("get Queue:"+ executor.getQueue());
	}
}
