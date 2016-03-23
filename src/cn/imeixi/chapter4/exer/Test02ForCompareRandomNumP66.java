package cn.imeixi.chapter4.exer;

import java.util.Random;

public class Test02ForCompareRandomNumP66 {
	public static void main(String[] args){
		for(int i = 0;i < 25;i++){
			compareRandomNum();			
		}
	}
	static void compareRandomNum(){
		Random rand = new Random();
		int a1 = rand.nextInt();
		int a2 = rand.nextInt();
		System.out.println("a = " + a1 + ", a2 =" + a2);
		if(a1 < a2){
			System.out.println( a1 + " < " + a2);
		}else if(a1 > a2){
			System.out.println( a1 + " > " + a2);
		}else{
			System.out.println( a1 + " = " + a2);
		}
	}
}


