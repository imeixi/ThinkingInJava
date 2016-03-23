package cn.imeixi.chapter3.java;

public class OverflowP63 {
	public static void main(String[] args) {
		int big = Integer.MAX_VALUE;
		System.out.println("big = " + big);
		int bigger = big * 4;
		System.out.println("big * 4 = " + bigger);
	}
}
