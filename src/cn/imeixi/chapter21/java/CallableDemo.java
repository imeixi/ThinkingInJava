package cn.imeixi.chapter21.java;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	
	public static void main(String[] args) {
		ExecutorService exService = Executors.newCachedThreadPool();
		List<Future<String>> results = new ArrayList<Future<String>>();
		for(int i = 0;i < 10;i++){
			results.add(exService.submit(new TaskWithResults(i)));
		}
		
		for (Future<String> future : results) {
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			} finally{
				exService.shutdown();
			}
		}
	}
	
}

class TaskWithResults implements Callable<String>{

	private int id;
	public TaskWithResults(int id){
		this.id = id;
	}
	
	public String call() throws Exception {
		return "Result of TaskWithResults " + id;
	}
	
}
