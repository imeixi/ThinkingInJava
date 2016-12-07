package cn.imeixi.chapter21.java;

public class BasicThreads {
	public static void main(String[] args) {
		Thread th = new Thread(new LiftOff());
		th.start();
		System.out.println("waiting for LiftOff");
	}
}

