package cn.imeixi.chapter4.java;

import static net.mindview.util.Range.*;
import static net.mindview.util.Print.*;

public class BreakAndContinue {
	public static void main(String[] args) {
		for(int i = 0;i < 100;i++){
			if(i == 74) break;
			if(i % 9 != 0) continue;
			printnb(i + " ");
		}
		print();
		
		for(int x:range(100)){
			if(x == 74) break;
			if(x % 9 != 0) continue;
			printnb(x + " ");			
		}
		print();
		
		int i = 1,j = 0;
		while(true){
			i++;
			j = i * 27;
			if(j == 1269) break;
			if(i % 10 != 0) continue;
			printnb(i + " ");
		}
		
		
		
	}
}
