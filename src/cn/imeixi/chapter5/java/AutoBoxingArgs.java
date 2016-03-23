package cn.imeixi.chapter5.java;

public class AutoBoxingArgs {
	static void f(Integer... args){
		for(Integer i:args){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		f(new Integer(1),new Integer(2),new Integer(12));
		f(1,2,3,4,5);
		f(2,new Integer(10));
	}
}
