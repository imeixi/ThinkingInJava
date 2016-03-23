package cn.imexi.chapter7.java;

public class Cartoon extends Drawing{
	public Cartoon(){
		System.out.println("Cartoon constructor.");
	}
	public static void main(String[] args){
		new Cartoon();
	}
	
}

class Art{
	public Art(){
		System.out.println("Art constructor.");
	}
}

class Drawing extends Art{
	public Drawing(){
		System.out.println("Darwing constructor.");
	}
}
