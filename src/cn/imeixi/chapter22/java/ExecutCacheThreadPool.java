package cn.imeixi.chapter22.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutCacheThreadPool {
	public static void main(String[] args) {
		ExecutorService exService = Executors.newCachedThreadPool();
		for(int i = 0; i< 5;i++){
			exService.execute(new LiftOff());
		}
		exService.shutdown();
	}
}

