package cn.imeixi.chapter1.exer;

public class Exer07Incrementable {
	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		Incrementable in = new Incrementable();
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
		StaticTest.i++;
		System.out.println("StaticTest.i++ = " + StaticTest.i);
		in.increment();
		System.out.println("StaticTest.i  invoke  Incrementable.increment = " + StaticTest.i);
	}
}

class StaticTest{
	static int i = 47;
}

class Incrementable{
	static void increment(){
		StaticTest.i++;
	}
}