package cn.imexi.chapter7.exer;

public class Test10Root {
	public static void main(String[] args) {
		Stem1 st = new Stem1(" From main");
	}
}

class Component11{
	public Component11(String s){
		System.out.println("Component11 constructor." + s);
	}
}

class Component22{
	public Component22(String s){
		System.out.println("Component22 constructor." + s);
	}
}

class Component33{
	public Component33(String s){
		System.out.println("Component33 constructor." + s);
	}
}

class Root1{
	public Root1(String s){
		Component11 c1 = new Component11(" From Root1");
		Component22 c2 = new Component22(" From Root1");
		Component33 c3 = new Component33(" From Root1");
		System.out.println("Root1 constructor." + s);
	}
}

class Stem1 extends Root1{
	public Stem1(String s){
		super("From Stem1");
		Component11 c1 = new Component11(" From Stem1");
		Component22 c2 = new Component22(" From Stem1");
		Component33 c3 = new Component33(" From Stem1");
		System.out.println("Stem1 constructor." + s);
	}
}