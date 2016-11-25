package cn.imeixi.chapter22.java;

public class BasicThreads {
	public static void main(String[] args) {
		Thread th = new Thread(new LiftOff());
		th.start();
		System.out.println("waiting for LiftOff");
	}
}

