package cn.imexi.chapter7.exer;

import cn.imexi.chapter7.java.Detergent;

public class Test02ExtendsDetergent extends Detergent {
	public void scrub(){
		System.out.println("Extends Detergnet:");
		super.scrub();
	}
	public void sterilize(){
		append(" sterilize()");
	}
	
	public static void main(String[] args){
		Test02ExtendsDetergent t = new Test02ExtendsDetergent();
		t.scrub();
		t.dilute();
		t.foam();
		t.apply();
		t.sterilize();
		System.out.println(t);
		System.out.println();
		Detergent.main(args);
		
	}
}
