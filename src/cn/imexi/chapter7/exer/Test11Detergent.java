package cn.imexi.chapter7.exer;

import cn.imexi.chapter7.java.Cleanser1;

public class Test11Detergent {
	public static void main(String[] args) {
		Detergent d = new Detergent();
		d.apply();
		d.dilute();
		d.scrub();
		d.foam();
		System.out.println(d);
		System.out.println("Testing base class:");
		Cleanser1.main(args);
	}
}

class Detergent{
	private Cleanser1 Cleanser1 = new Cleanser1();
	public void append(String a){Cleanser1.append(a);}
	public void apply(){Cleanser1.apply();}
	public void dilute(){Cleanser1.dilute();}
	public String toString(){return Cleanser1.toString();}
	
	public void scrub(){
		append("Detergent.scrub()");
		Cleanser1.scrub();
	}
	
	public void foam(){ append("foam()");}
}
