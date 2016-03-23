package cn.imeixi.chapter1.exer;

public class Exer08StaticTest {
	public static void main(String[] args) {
		
		StaticTest1 st1 = new StaticTest1();
		StaticTest1 st2 = new StaticTest1();
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
		st1.i++;
		System.out.println("(st1.i + 1) output st2.i = " + st2.i);
		
		
	}
}

class StaticTest1{
	static int i = 100;
}
