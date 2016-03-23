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

class Bowl{     //bowl:n,�룻ľ�򣻴�Ʊ�
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
	Bowl bowl3 = new Bowl(3);                  //�Ǿ�̬������ÿ�δ�����������ã������ʼ��
	static Bowl bowl4 = new Bowl(4);           //��̬������ֻ����ʼ��һ��
	public Cupboard(){
		System.out.println("Cupboard()");
		bowl4.f1(2);
	}
	void f3(int marker){
		System.out.println("f3(" + marker + ")");
	}
	static Bowl bowl5 = new Bowl(5);
}