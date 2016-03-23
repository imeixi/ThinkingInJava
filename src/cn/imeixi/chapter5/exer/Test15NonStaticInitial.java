package cn.imeixi.chapter5.exer;

public class Test15NonStaticInitial {
	public static void main(String[] args) {
		System.out.println("Inside main");
		new NonStaticInitial();
		System.out.println("**************************");
		new NonStaticInitial();
		System.out.println("**************************");
		new NonStaticInitial();
		System.out.println("**************************");
	}
}

class NonStaticInitial{
	String str1;
	String str2;
	{
		str1 = "Hello ,Can you do it.";
		str2 = "Yeah, I can do it.";
	}
	public NonStaticInitial(){
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("Trust me!");
	}
}
