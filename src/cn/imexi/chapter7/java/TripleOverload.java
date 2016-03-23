package cn.imexi.chapter7.java;

public class TripleOverload {
	public void fly(){System.out.println("I believe I can fly.");}
	public void fly(String s){System.out.println("I believe I can fly." + s);}
	public void fly(int height){System.out.println("I believe I can fly " + height + " meters");}
	
}
