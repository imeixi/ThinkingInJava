package cn.imeixi.chapter21.exer;

/**
 * 实现Runnable接口，在run方法中打印一条信息，然后调用yield（）
 * 重复这个操作3次，在run（）中返回。在构造器中放置1条启动信息，任务终止时放置一条结束信息
   * @Name: Exer1.java
   * @Description: 
   * @Author: ZhengAH（作者）
   * @Version: V1.00 （版本号）
   * @Create Date: 2016年11月8日下午2:45:53
 */
public class Exer1 {
	public static void main(String[] args) {
		System.out.println( "Begin of print message!");
		new Thread(new Run1()).start();
		new Thread(new Run1()).start();
		new Thread(new Run1()).start();
		new Thread(new Run1()).start();
		new Thread(new Run1()).start();

		System.out.println("End of Print Message!");
	}
}



