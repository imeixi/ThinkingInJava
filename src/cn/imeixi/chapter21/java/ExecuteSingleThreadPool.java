package cn.imeixi.chapter21.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteSingleThreadPool {
	public static void main(String[] args) {
		
		//FixedThreadPool 使用的Thread是有界的
		ExecutorService exService = Executors.newFixedThreadPool(2);
		for(int i = 0; i< 5;i++){
			exService.execute(new LiftOff());
		}
		exService.shutdown();
	}
}

