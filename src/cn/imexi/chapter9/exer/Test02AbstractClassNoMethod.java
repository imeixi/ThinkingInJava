package cn.imexi.chapter9.exer;

public class Test02AbstractClassNoMethod {
	public static void main(String[] args) {
//		new NonMethod();
		new Method().print();
		
	}
}


abstract class NonMethod{}

class Method extends NonMethod{
	private int i =4;
	void print(){
		System.out.println("int i = " + i);
	} 
}