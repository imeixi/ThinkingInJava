package cn.imeixi.chapter3.exer;
/*
 * 输出两个常量值，0和1交替，1个最低有效位为0,1个最低有效位为1.用Integer.toBinaryString（）打印
 */

public class Test10BitWise {
	public static void main(String[] args) {
		int a = 0xaaaaaaaa;
		int b = 0x55555555;
		System.out.println(" a = " + Integer.toBinaryString(a));
		System.out.println(" b = " + Integer.toBinaryString(b));
		System.out.println("~a = " + Integer.toBinaryString(~a));
		System.out.println("~b = " + Integer.toBinaryString(~b));
		System.out.println("a | a = " + Integer.toBinaryString(a | a));
		System.out.println("a & a = " + Integer.toBinaryString(a & a));
		System.out.println("a ^ a = " + Integer.toBinaryString(a ^ a));
		System.out.println("a | b = " + Integer.toBinaryString(a | b));
		System.out.println("a & b = " + Integer.toBinaryString(a & b));
		System.out.println("a ^ b = " + Integer.toBinaryString(a ^ b));
	
	}
}
