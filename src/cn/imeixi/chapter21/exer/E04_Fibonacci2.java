package cn.imeixi.chapter21.exer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class E04_Fibonacci2 {
	public static void main(String[] args) {
		ExecutorService exService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			exService.execute(new Fibonacci(i));
		}
		Thread.yield();
		exService.shutdown();
		exService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			exService.execute(new Fibonacci(i));
		}
		Thread.yield();
		exService.shutdown();
		exService = Executors.newFixedThreadPool(1);
		for (int i = 0; i < 5; i++) {
			exService.execute(new Fibonacci(i));
		}
		Thread.yield();
		exService.shutdown();
		exService = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {
			exService.execute(new Fibonacci(i));
		}

	}
}

