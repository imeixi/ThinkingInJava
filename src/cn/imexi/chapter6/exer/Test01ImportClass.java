package cn.imexi.chapter6.exer;

import cn.imexi.chapter6.java.*;

public class Test01ImportClass extends TestPackage{
	public static void main(String[] args) {
		TestPackage.info();
		new Test01ImportClass().chomp();
			
	}
	public void chomp(){
		setA(a);   // main is static ,so this protected method can't be invoke.
		a = 12;
		getA();
		
	}
	
}
