package cn.imeixi.chapter22.exer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class E03_Runnable2 {
	public static void main(String[] args) {
		ExecutorService exService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			exService.execute(new Printer());
		}
		Thread.yield();
		exService.shutdown();
		exService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			exService.execute(new Printer());
		}
		Thread.yield();
		exService.shutdown();
		exService = Executors.newFixedThreadPool(1);
		for (int i = 0; i < 5; i++) {
			exService.execute(new Printer());
		}
		Thread.yield();
		exService.shutdown();
		exService = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {
			exService.execute(new Printer());
		}

	}
}

