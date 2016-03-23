package cn.imexi.chapter7.exer;

public class Test07ConstructorHasParameter {
	public static void main(String[] args){
		CC c = new CC("This is create by main.");
	}
}

class AA{
	public AA(String s){
		System.out.println("AA Constructor " + s);
	}
}

class BB{
	public BB(String s){
		System.out.println("BB Constructor " + s);
	}
}

class CC extends AA{
	public CC(String s){
		super(s);
		BB b = new BB("Create by CC");
		System.out.println("CC Constructor " + s);
	}
}
