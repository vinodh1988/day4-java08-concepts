package com.activity;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledTasksRunner {
  public static void main(String[] args) {
	 ScheduledExecutorService executor=Executors.newSingleThreadScheduledExecutor();
	 
	 ScheduledFuture future=executor.scheduleAtFixedRate(()->{
		 System.out.println("Hi");
	 }, 2,2, TimeUnit.SECONDS);
	 
	 while(!future.isDone()) {
	     try {
			System.out.println(future.get());
			//executor.shutdown();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 
	 }
  }
}
