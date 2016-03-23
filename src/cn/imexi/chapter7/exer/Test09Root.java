package cn.imexi.chapter7.exer;

public class Test09Root {
	public static void main(String[] args) {
		Stem st = new Stem();
	}
}

class Component1{
	public Component1(){
		System.out.println("Component1 constructor.");
	}
}

class Component2{
	public Component2(){
		System.out.println("Component2 constructor.");
	}
}

class Component3{
	public Component3(){
		System.out.println("Component3 constructor.");
	}
}

class Root{
	public Root(){
		Component1 c1 = new Component1();
		Component2 c2 = new Component2();
		Component3 c3 = new Component3();
		System.out.println("Root constructor.");
	}
}

class Stem extends Root{
	public Stem(){
		Component1 c1 = new Component1();
		Component2 c2 = new Component2();
		Component3 c3 = new Component3();
		System.out.println("Stem constructor.");
	}
}