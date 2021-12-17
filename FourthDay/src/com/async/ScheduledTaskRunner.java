package com.async;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledTaskRunner {
	
	public static void main(String n[]) {
		ScheduledExecutorService service=Executors.newScheduledThreadPool(1);
		
		ScheduledFuture<String> future =service.schedule(()->{
			System.out.println("Working");
			return "Success";
		}, 3, TimeUnit.SECONDS);
		
		System.out.println("Job Scheduled");
		
		try {
			String result = future.get();
			System.out.println("received->"+result);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
