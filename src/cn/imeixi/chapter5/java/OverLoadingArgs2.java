package cn.imeixi.chapter5.java;

public class OverLoadingArgs2 {
	static void f(int i,Character... strs){
		System.out.print("First: int i = " + i);
		for(Character s:strs){
			System.out.print(" " + s);
		}
		System.out.println();
	}
	static void f(char c,Character... strs){
		System.out.print("Second: Non int");
		for(Character s:strs){
			System.out.print(" " + s);
		}
		System.out.println();
	}
	
/*  �������ط�����������ʱ���ᱨ��	
	static void f(Character... strs){
		System.out.print("Second: Non int");
		for(Character s:strs){
			System.out.print(" " + s);
		}
		System.out.println();
	}
*/	
	public static void main(String[] args) {
		f(1,'A');
		f('b');
	}
}
