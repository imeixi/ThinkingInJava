package cn.imexi.chapter7.exer;

public class Test03ExtendsConstructor extends ExtendsConstructor{
	public Test03ExtendsConstructor(){
		System.out.println("Test03ExtendsConstructor constructor.");
	}
	public static void main(String[] args) {
		new Test03ExtendsConstructor();
	}
}

class ExtendsConstructor{
	public ExtendsConstructor(){
		System.out.println("Base class ExtendsConstructor.");
	}
}
