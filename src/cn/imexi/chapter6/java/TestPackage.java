package cn.imexi.chapter6.java;

public class TestPackage {
	protected int a;

	protected int getA() {
		return a;
	}

	protected void setA(int a) {
		this.a = a;
	}
	
	public static void info(){
		PrintName.print();
	}
	

	
}

class PrintName{
	static void print(){		
		System.out.println("I love the terriable world.");
	}
}

