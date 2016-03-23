package cn.imeixi.chapter5.exer;

public class Test09ThisConstructor {

	public Test09ThisConstructor(String s){
		System.out.println("this String " + s + " is from args.");
	}
	
	public Test09ThisConstructor(int i){
		this("s = " + i);
	}
	
	public static void main(String[] args) {
		new Test09ThisConstructor("HAHAHA");
		new Test09ThisConstructor(47);
	}
	
	
}
