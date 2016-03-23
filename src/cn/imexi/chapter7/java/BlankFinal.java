package cn.imexi.chapter7.java;

public class BlankFinal {
	private final int i = 0;  //final 在声明时赋值
	
	private final int j;      //声明为空白final
	private final Popet p;
	
	public BlankFinal(){      //空白final必须在构造器中被初始化。
		j = i;
		p = new Popet(i);
	}
	
	public BlankFinal(int x){
		j = x;
		p = new Popet(x);
	}
	
	public String toString(){
		return "i = " + i + " j = " + j + " Popet.i = " + p.getI();
	}
	
	public static void main(String[] args) {
		BlankFinal b = new BlankFinal();
		BlankFinal b1 = new BlankFinal(47);
		System.out.println(b);
		System.out.println(b1);
	}
}

class Popet{
	private int i;
	public Popet(int ii){
		i = ii;
	}
	public int getI(){
		return i;
	}
}
