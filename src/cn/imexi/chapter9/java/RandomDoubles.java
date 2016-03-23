package cn.imexi.chapter9.java;

import java.util.*;

public class RandomDoubles {
	private static Random rand = new Random(47);
	public double next(){
		return rand.nextDouble();
	}
	
	public static void main(String[] args){
		RandomDoubles rd = new RandomDoubles();
		for(int i = 0;i < 10;i++){
			System.out.println(rd.next());
		}
	}
}
