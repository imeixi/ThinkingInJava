package cn.imeixi.chapter5.java;

public class OverLoadingArgs {
	static void f(Integer... integers){
		System.out.print("First: ");
		for(Integer i:integers){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	static void f(Character... integers){
		System.out.print("Second: ");
		for(Character i:integers){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	static void f(Long... integers){
		System.out.print("Third: ");
		for(Long i:integers){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		f(1,2,3,4,5);
		f('a','v','d');
		f(23L,35L);
		f(0);
	}
	
}
