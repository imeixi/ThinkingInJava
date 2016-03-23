package cn.imexi.chapter7.exer;

public class Test05ExtendsConstructor {
	public static void main(String[] args) {
		C c = new C();
	}
}

class A{
	public A(){
		System.out.println("A()");
	}
}

class B{
	public B(){
		System.out.println("B()");
	}
}

class C extends A{
	B b = new B();
}
