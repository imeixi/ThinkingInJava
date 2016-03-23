package cn.imeixi.chapter4.exer;

import static net.mindview.util.Range.*;
public class Test07Break {
	public static void main(String[] args) {
		for(int i = 0;i <= 100;i++){
			if(i == 99) break;
			System.out.print(i + " ");
		}
		System.out.println();
		for(int x:range(100)){
			if(x == 99) break;
			System.out.print(x + " ");			
		}
		System.out.println();
		for(int x:range(100)){
			if(x == 99) return;
			System.out.print(x + " ");			
		}
		
		
	}
	
}
