package cn.imexi.chapter7.exer;

import java.util.Random;

public class Test18FinalAndStatic {
	public static void main(String[] args) {
		FinalAndStatic f1 = new FinalAndStatic();
		System.out.println(f1);
		FinalAndStatic f2 = new FinalAndStatic();
//		f1.i = 12;
//		f1.NUM = 24;
		System.out.println(f2);
		FinalAndStatic f3 = new FinalAndStatic();
		System.out.println(f3);
		FinalAndStatic f4 = new FinalAndStatic();
		System.out.println(f4);
		FinalAndStatic f5 = new FinalAndStatic();
		System.out.println(f5);
		FinalAndStatic f6 = new FinalAndStatic();
		System.out.println(f6);
		
	}
}

class FinalAndStatic{
	private static Random rand = new Random(47);
	final int i = rand.nextInt(50);
	static final int NUM = rand.nextInt(50);
	public String toString(){
		return "final int i = " + i + " ,static final int NUM = " + NUM;
	}
}
