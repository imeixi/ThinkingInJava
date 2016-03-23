package cn.imeixi.chapter3.exer;

class Tank{
	float level;
}

public class OtherNameP40 {
	public static void main(String[] args){
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 12.5f;
		t2.level = 13.4f;
		System.out.println("t1:" + t1);
		System.out.println("t2:" + t2);
		System.out.println("t1.level:" + t1.level);
		System.out.println("t2.level:" + t2.level);
		t1.level = t2.level;
		System.out.println();
		System.out.println("t1:" + t1);
		System.out.println("t2:" + t2);
		System.out.println("t1.level:" + t1.level);
		System.out.println("t2.level:" + t2.level);
		
		t1 = t2;		
		System.out.println();
		System.out.println("t1:" + t1);
		System.out.println("t2:" + t2);
		System.out.println("t1.level:" + t1.level);
		System.out.println("t2.level:" + t2.level);
		
		
	}
}
