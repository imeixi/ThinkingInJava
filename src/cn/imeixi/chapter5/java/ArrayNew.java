package cn.imeixi.chapter5.java;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
	public static void main(String[] args) {
		int[] a;
		Random rand = new Random();
		int b[] = new int[3];
		b[0] = 1;
		a = new int[rand.nextInt(20)];
		System.out.println(Arrays.toString(a));
	}
}
