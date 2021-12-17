package com.async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class MainTask2 {
    public static void main(String n[]) {
    	CompletableFuture<String> x=CompletableFuture.supplyAsync(Tasks::getTaskResult);
    	
    	try {
			String result=x.get();
			System.out.println("Result is "+result);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}