package cn.imeixi.chapter5.exer;

public class Test06Dog {

	public Test06Dog(){
		System.out.println("This Constructor is Defined by me");
	}
	
	void bark(){
		System.out.println("The dog is barking.(È®·Í)");
	}
	
	void bark(String name,int age){
		System.out.println("The dog" + name + " is " + age + " years old.");
	}
	
	void bark(int times,String name){
		System.out.println("The dog" + name + "has been to china " + times + " times");
	}
	
	
	
	public static void main(String[] args) {
		new Test06Dog().bark("Poppy",10);
		new Test06Dog().bark(5,"Tim");
		
		new Test05Dog().bark();
		new Test05Dog().bark("Jim");
	}
}
