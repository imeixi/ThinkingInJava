package cn.imeixi.chapter3.exer;

class Ffloat{
	float level;
}

public class OtherNameP41 {
	static void ff(Ffloat f){
		f.level = 12.34f;
	}
	
	public static void main(String[] args){
		Ffloat f1 = new Ffloat();
		f1.level = 3.1415926f;
		System.out.println("f1.level = " + f1.level);
		
		ff(f1);
		System.out.println("f1.level = " + f1.level);
	}
	
}
