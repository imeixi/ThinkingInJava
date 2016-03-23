package cn.imeixi.chapter5.java;

import java.util.Arrays;
import java.util.Random;

public class ArrayClassObject {
	public static void main(String[] args) {
		Random rand = new Random(47);
		//静态初始化
		Integer[] b = new Integer[]{new Integer(rand.nextInt(500)),new Integer(rand.nextInt(500)),new Integer(rand.nextInt(500)),4};
		
		//动态初始化
		Integer[] a = new Integer[rand.nextInt(20)];
		for(int i = 0;i < a.length;i++){
			a[i] = rand.nextInt(500);
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
