package com.activity;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainRunner {
    public static void main(String[] args) {
		//ExecutorService e=Executors.newSingleThreadExecutor();
    	//ExecutorService e=Executors.newFixedThreadPool(2);
		ExecutorService e=Executors.newCachedThreadPool();
		e.execute(()->{
			while(true) {
			System.out.println("Running..."+Thread.currentThread().getName());
			 try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
	   e.execute(()->{
	   while(true) {		
			System.out.println("Running..."+Thread.currentThread().getName());
	
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	   }
	   });
	}
}
