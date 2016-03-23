package cn.imeixi.chapter4.java;

import static net.mindview.util.Range.*;
import static net.mindview.util.Print.*;


public class ForEachInt {
	public static void main(String[] args) {
		for(int x:range(10)){         //range  (从0开始产生10个数据)
			printnb(x + " ");
		}
		print();
		
		for(int x:range(5,10)){       //(从5开始产生数据到10)
			printnb(x + " ");
		}
		print();
		
		for(int x:range(0,20,3)){     //从0开始到20，步进3
			printnb(x + " ");
		}
		print();
	}
}
