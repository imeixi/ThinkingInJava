package cn.imeixi.chapter22.java;

/**
 * Demonstration of the Runnable Interface
   * @Name: LiftOff.java
   * @Description: 
   * @Author: ZhengAH（作者）
   * @Version: V1.00 （版本号）
   * @Create Date: 2016年11月8日下午2:23:36
 */
public class LiftOff implements Runnable {

	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;

	public LiftOff() {

	}

	public LiftOff(int countDown) {
		this.countDown = countDown;
	}
	
	public String status(){
		return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff") + ")";
	}

	public void run() {
		while (countDown-- > 0) {
			System.out.println(status());
			Thread.yield();  //释放CPU占用
		}
	}

}
