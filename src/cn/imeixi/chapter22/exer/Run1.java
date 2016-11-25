package cn.imeixi.chapter22.exer;

public class Run1 implements Runnable{

	public Run1(){
		
	}
	public void run() {
		for(int i = 0; i < 3; i++){
			System.out.println(Thread.currentThread().getName() + " This is the number " + i + " message!");
			Thread.yield();
		}
	}
	
}
