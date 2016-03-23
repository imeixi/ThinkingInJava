package cn.imexi.chapter7.java;

public class BlankFinal {
	private final int i = 0;  //final ������ʱ��ֵ
	
	private final int j;      //����Ϊ�հ�final
	private final Popet p;
	
	public BlankFinal(){      //�հ�final�����ڹ������б���ʼ����
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
