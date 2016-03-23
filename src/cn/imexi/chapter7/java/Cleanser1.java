package cn.imexi.chapter7.java;

public class Cleanser1{
	private String s = "Cleanser1";
	public void append(String a){  s += a;}
	public void dilute(){ append(" dilute()");}
	public void apply(){append(" apply()");}
	public void scrub(){append(" scurb()");}
	public String toString(){return s;}
	
	public static void main(String[] args) {
		Cleanser1 c = new Cleanser1();
		c.dilute();
		c.apply();
		c.scrub();
		System.out.println(c);
	}
	
}
