package cn.imeixi.chapter3.exer;

import java.util.Random;

public class ComputeSpeedP43 {
	public static void main(String[] args){
		Random rand = new Random(47);
		int s = rand.nextInt(100);
		int t = rand.nextInt(60);
		int v = s/t;
		System.out.println("space is :" + s + "m");
		System.out.println("time is :" + t + "s");
		System.out.println("Speed is :" + v + "m/s");
	}
	
}
