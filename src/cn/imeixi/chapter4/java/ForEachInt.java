package cn.imeixi.chapter4.java;

import static net.mindview.util.Range.*;
import static net.mindview.util.Print.*;


public class ForEachInt {
	public static void main(String[] args) {
		for(int x:range(10)){         //range  (��0��ʼ����10������)
			printnb(x + " ");
		}
		print();
		
		for(int x:range(5,10)){       //(��5��ʼ�������ݵ�10)
			printnb(x + " ");
		}
		print();
		
		for(int x:range(0,20,3)){     //��0��ʼ��20������3
			printnb(x + " ");
		}
		print();
	}
}
