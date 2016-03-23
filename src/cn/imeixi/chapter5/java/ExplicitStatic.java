package cn.imeixi.chapter5.java;

public class ExplicitStatic {
	public static void main(String[] args) {
		System.out.println("Print Inside main");
		Cups.cup1.f(99);
		
	//!	static Cups c = new Cups();   static 不可以用来修饰局部变量
	}
	static Cups cup1 = new Cups();
	static Cups cup2 = new Cups();
}

class Cup{
	public Cup(int marker){
		System.out.println("Cup(" + marker + ")");
	}
	
	void f(int marker){
		System.out.println("f(" + marker + ")");
	}
}

class Cups{
	static Cup cup1;
	static Cup cup2;
	static{
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	
	Cups(){
		System.out.println("Cups()");
	}
}