package com.async;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsyncTaskRunner {
	public static final ExecutorService es= Executors.newCachedThreadPool();
	
	public static Future<String> runStringReturnTask(Callable<String> callable){
		return es.submit(callable);
	}
	
	public  static Future<Emp[]> runEmpReturnTask(Callable<Emp[]> callable){
		return es.submit(callable);
	}

}
