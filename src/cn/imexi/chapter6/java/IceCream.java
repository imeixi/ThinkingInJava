package cn.imexi.chapter6.java;

public class IceCream {
	public static void main(String[] args) {
//		Sundae sun1 = new Sundae();         //构造器被声明为private 所以不能直接创建
		Sundae sun = Sundae.makeASunae();
	}
}

class Sundae{
	private Sundae(){
		System.out.println("you made it.");
	}
	
	static Sundae makeASunae(){
		return new Sundae();
	}
	
}


//sundae ['sʌndeɪ; -dɪ]  n. 圣代冰淇淋