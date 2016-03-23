package cn.imeixi.chapter5.java;

public class ArraysOfPrimitive {
	public static void main(String[] args) {
		int[] a1;
		int[] a2 = {1,2,3,4,5};
		
		a1 = a2;
		
		for(int i = 0;i < a1.length;i++){
			a1[i] += 1;
		}
		
		for(int i = 0;i < a2.length;i++){
			System.out.println("a2[" + i + "] = " + a2[i]);
		}
	}
}
