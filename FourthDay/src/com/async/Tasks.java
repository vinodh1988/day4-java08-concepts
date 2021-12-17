package com.async;

public class Tasks {
	public static String getTaskResult(){
		try {
			Thread.sleep(3000);
			return "Task Wrapped";
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			return "Task Failed";
		}
	}
	
	public static Emp[] getEmployeeData(){
		Emp[] list= {
			new Emp(1,"Raj","Mumbai"),new Emp(2,"Ravi","Chennai"),new Emp(3,"Harry","Mumbai")	
		};
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}		
}
