package cn.imeixi.chapter3.exer;
/*
 * �����������ֵ��0��1���棬1�������ЧλΪ0,1�������ЧλΪ1.��Integer.toBinaryString������ӡ
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
