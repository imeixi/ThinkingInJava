package cn.imexi.chapter7.exer;

import cn.imexi.chapter7.java.TripleOverload;

public class Test13OverLoadExtends extends TripleOverload {

	public void fly(String s, int height) {
		System.out.println("I believe I can fly " + height + " kilometers."
				+ "\n" + s);
	}
	
	public static void main(String[] args) {
		Test13OverLoadExtends t = new Test13OverLoadExtends();
		t.fly();
		t.fly("I believe I can touch the sky.");
		t.fly(10);
		t.fly("Trust me.", 100);
	}
}
