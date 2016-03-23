package cn.imexi.chapter6.java;

public class Lunch {
	public static void main(String[] args) {
		//Soup1 s1 = new Soup1();
		Soup1.makeSoup1();
		
//		Soup2 s2 =new Soup2();
		Soup2 s2 = Soup2.makeSoup2();
		s2.f();
	}
}


/*
 lunch :n Îç²Í
 launch vt. ·¢Éä
 *
 */


class Soup1{
	private Soup1(){
		System.out.println("Soup1 Constructor.");
	}
	
	public static Soup1 makeSoup1(){
		return new Soup1();		
	}
}

class Soup2{
	private Soup2(){
		System.out.println("Soup2 Private Constructor.");
	}
	
	private static Soup2 sp2 = new Soup2();
	
	public static Soup2 makeSoup2(){
		return sp2;
	}
	
	public void f(){}
}