package cn.imexi.chapter7.exer;

public class Test04ExtendsConstructor extends ExtendsConstructor1{
//	public Test04ExtendsConstructor(){
//		System.out.println("Test03ExtendsConstructor constructor.");
//	}
	public static void main(String[] args) {
		new Test04ExtendsConstructor();
	}
}

class ExtendsConstructor1{
	public ExtendsConstructor1(){
		System.out.println("Base class ExtendsConstructor.");
	}
}
