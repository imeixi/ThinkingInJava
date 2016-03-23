package cn.imeixi.chapter4.java;

public class IfElse2 {
	public static void main(String[] args) {
		System.out.println(test(5,10));
		System.out.println(test(15,10));
		System.out.println(test(10,10));

		
	}
	
	static int test(int testval,int target){
		if(testval < target){
			return -1;
		}else if(testval > target){
			return +1;
		}else{
			return 0;
		}
	}
}
