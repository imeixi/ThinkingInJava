package cn.imeixi.chapter5.java;

public class StaticInitial {
	public static void main(String[] args){
		System.out.println("Create Cupboard in main");
		new Cupboard();
		System.out.println("Create Cupboard in main");
		new Cupboard();
		table.f2(1);
		cup.f3(1);
	}
	static Table table = new Table();
	static Cupboard cup= new Cupboard();
}

class Bowl{     //bowl:n,碗；木球；大酒杯
	public Bowl(int marker){
		System.out.println("Bowl(" + marker + ")");
	}
	
	void f1(int marker){
		System.out.println("f1(" + marker + ")");
	}
	
}

class Table{
	static Bowl bowl1 = new Bowl(1);
	public Table(){
		System.out.println("Table()");
		bowl2.f1(1);
	}
	
	void f2(int marker){
		System.out.println("f2(" + marker + ")");
	}
	
	static Bowl bowl2 = new Bowl(2);
}

class Cupboard{
	Bowl bowl3 = new Bowl(3);                  //非静态变量，每次创建对象的引用，都会初始化
	static Bowl bowl4 = new Bowl(4);           //静态变量，只被初始化一次
	public Cupboard(){
		System.out.println("Cupboard()");
		bowl4.f1(2);
	}
	void f3(int marker){
		System.out.println("f3(" + marker + ")");
	}
	static Bowl bowl5 = new Bowl(5);
}