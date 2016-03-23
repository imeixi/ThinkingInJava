package cn.imeixi.chapter5.java;

public class Leaf {

	int i;
	
	Leaf increatment(){
		i++;
		return this;     //返回当前对象
	}
	
	void print(){
		System.out.println("i = " + i);
	}
	
	public static void main(String[] args) {
		Leaf l = new Leaf();
		l.increatment().increatment().increatment().print();

	}
	
}
