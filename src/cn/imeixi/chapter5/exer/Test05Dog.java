package cn.imeixi.chapter5.exer;

public class Test05Dog {

	void bark(){
		System.out.println("The dog is barking.(Ȯ��)");
	}
	
	void bark(String name){
		System.out.println("The dog " + name + " is howling.(����)");
	}
	
	public static void main(String[] args) {
		new Test05Dog().bark();
		new Test05Dog().bark("Poppy");
	}
	
	
}
