package cn.imeixi.chapter4.java;

public class IfElseP64 {
	static int result = 0;
	static void test(int testval,int target){
		if(testval < target){
			result = 1;
		}else if(testval > target){
			result = -1;
		}else{
			result = 0;
		}
	}
	
	public static void main(String[] args){
		test(5,10);
		System.out.println("test(5,10)" + result);
		test(15,10);
		System.out.println("test(15,10)" + result);
		test(10,10);
		System.out.println("test(10,10)" + result);
	}
}
