package cn.imeixi.chapter4.java;

import java.util.Random;

//for each 只能用于数组
public class ForEachFloat {
	public static void main(String[] args) {
		Random rand = new Random();
		float[] f = new float[10];
		for(int i = 0;i < 10;i++){
			f[i] = rand.nextFloat();
		}
		
		for(float x : f){
			System.out.println(x);
		}
	}
}
