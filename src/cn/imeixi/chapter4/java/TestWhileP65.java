package cn.imeixi.chapter4.java;

public class TestWhileP65 {
	static boolean condition(){
		boolean result = Math.random() < 0.99;
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		while(condition())
			System.out.println("The message is in the while");
		System.out.println("The message is out of the while");
	}

}
