package com.exam.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Executor {
	
   public static void main(final String[] arguments) throws InterruptedException {
      ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newCachedThreadPool();

      //Stats before tasks execution
      System.out.println("Largest executions: "
         + executor.getLargestPoolSize());
      System.out.println("Maximum allowed threads: "
         + executor.getMaximumPoolSize());
      System.out.println("Current threads in pool: "
         + executor.getPoolSize());
      System.out.println("Currently executing threads: "
         + executor.getActiveCount());
      System.out.println("Total number of threads(ever scheduled): "
         + executor.getTaskCount());

      executor.submit(new Task());
      executor.submit(new Task());

      //Stats after tasks execution
      System.out.println("Core threads: " + executor.getCorePoolSize());
      System.out.println("Largest executions: "
         + executor.getLargestPoolSize());
      System.out.println("Maximum allowed threads: "
         + executor.getMaximumPoolSize());
      System.out.println("Current threads in pool: "
         + executor.getPoolSize());
      System.out.println("Currently executing threads: "
         + executor.getActiveCount());
      System.out.println("Total number of threads(ever scheduled): "
         + executor.getTaskCount());

      executor.shutdown();
   }  

   static class Task implements Runnable {

      public void run() {

         try {
            Long duration = (long) (Math.random() * 5);
            System.out.println("Running Task! Thread Name: " +
               Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(duration);
            System.out.println("Task Completed! Thread Name: " +
               Thread.currentThread().getName());
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
}
