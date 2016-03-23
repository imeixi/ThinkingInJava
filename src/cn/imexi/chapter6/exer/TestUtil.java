package cn.imexi.chapter6.exer;

import static cn.imeixi.util.Print.*;
import static cn.imeixi.util.Range.*;

public class TestUtil {
	public static void main(String[] args) {
		print("Available from now on!");
		print(100);
		print(100L);
		print(3.14159);
		
		for(int i:range(20)){
			printnb(i + " ");
		};
		print();
		for(int i:range(5,25)){
			printnb(i + " ");
		};
		print();
		for(int i:range(20,100,15)){
			printnb(i + " ");
		};
		print();
		for(int i:range(20,100,20)){
			printnb(i + " ");
		};
	}
}
