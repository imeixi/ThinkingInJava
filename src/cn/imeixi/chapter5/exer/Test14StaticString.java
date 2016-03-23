package cn.imeixi.chapter5.exer;

public class Test14StaticString {
	static String str1 = "Working Hard and Improve everyday!";
	static String str2;
	static{
		str2 = "Everyone should be have a dream ,in case of it comes true.";
	}
	public static void main(String[] args) {

		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
	}
}

class StaticString{
	StaticString(){
		System.out.println("Are you the best?" + " No.I am not. " + " But I am try to make myself better and more.");
	}	
}
