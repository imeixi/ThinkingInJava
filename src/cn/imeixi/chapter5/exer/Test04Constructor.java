package cn.imeixi.chapter5.exer;

public class Test04Constructor {
	
	//¹¹ÔìÆ÷
	public Test04Constructor(){
		System.out.println("This is a null Parameters Constructor.");
	}
	
	public Test04Constructor(int i){
		System.out.println("This Constructor has one Parameters is :" + i);
	}
	
	public static void main(String[] args) {
		new Test04Constructor();
		new Test04Constructor(100);
	}
	
}
