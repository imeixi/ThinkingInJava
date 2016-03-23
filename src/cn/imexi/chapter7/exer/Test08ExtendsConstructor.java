package cn.imexi.chapter7.exer;

public class Test08ExtendsConstructor {
	public static void main(String[] args) {
		Son s = new Son();
		Son ss = new Son("Mr Zheng",46);
	}
}

class Father{
	public Father(int age){
		System.out.println("Father is " + age + " years old.");
	}
}

class Son extends Father{
	public Son(){
		super(50);
	}
	public Son(String Name,int age){
		super(age);
		System.out.println("Father's name is " + Name);
	}
}
