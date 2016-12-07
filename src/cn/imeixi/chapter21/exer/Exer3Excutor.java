package cn.imeixi.chapter21.exer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exer3Excutor {

	public static void main(String[] args) {
		ExecutorService exService = Executors.newCachedThreadPool();
		for(int i = 0;i < 5;i++){
			exService.execute(new Run1());
		}
		exService.shutdown();
	}
}

