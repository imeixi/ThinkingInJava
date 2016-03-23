package cn.imexi.chapter8.exer;

import java.util.*;

public class Test02RandomShapeGenerator {
	private Random rand = new Random(47);
	public Test02Shape next(){
		switch(rand.nextInt(3)){
			default:			
			case 0:return new Test02Circle();
			case 1:return new Test02Square();
			case 2:return new Test02Triangle();
		//	default:return new Test02Shape();

		}
	}
}
