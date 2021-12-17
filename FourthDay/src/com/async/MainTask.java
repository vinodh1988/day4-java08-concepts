package com.async;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class MainTask {
   public static void main(String n[]) {
	   System.out.println("Main Task Started");
	  
	   Future<String> future1=AsyncTaskRunner.runStringReturnTask(Tasks::getTaskResult);
	   Future<Emp[]> future2=AsyncTaskRunner.runEmpReturnTask(Tasks::getEmployeeData);
	   
	   System.out.println("Started two asynchronous tasks and main is still running");
	   System.out.println("Decided to block the code as all other jobs are done "
	   		+ "and First Want to read String Status");
	   try {
		String result=future1.get();
		System.out.println("Obtained the result"+result);
	} catch (InterruptedException | ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   System.out.println("Main still runs and want to block for emp read");
	   
	   try {
			Emp[] result=future2.get();
			for(Emp x:result)
				System.out.println(x);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	   
   }
}
