package cn.imeixi.chapter4.exer;

public class Test06IfElse {
	public static void main(String[] args) {
		System.out.println(test(5,4,10));
		System.out.println(test(5,5,10));
		System.out.println(test(5,9,10));
		System.out.println(test(5,10,10));
		System.out.println(test(5,20,10));
	}
	
	static int test(int begin,int testval,int end){
		if(testval <= begin){
			return -1;
		}else if(testval < end){
			return 0;
		}else
			return 1;
	}
}
