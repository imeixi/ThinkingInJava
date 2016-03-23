package cn.imeixi.chapter5.java;

public class VarargTpye {
	static void f(Character... args){
		System.out.print(args.getClass());
		System.out.println(" length = " + args.length);
	}
	static void g(int... args){
		System.out.print(args.getClass());
		System.out.println("  length = " + args.length);
	}
	public static void main(String[] args){
		f('c');
		f('a','b');
		f();
		g(1);
		g(2);
		g();
	}
	

}
