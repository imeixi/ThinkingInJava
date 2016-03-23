package cn.imeixi.chapter5.exer;

import cn.imeixi.chapter5.java.Money;

public class Test21EnumOrdial {
	public static void main(String[] args) {
		for(Money m:Money.values()){
			System.out.println(m + ", Ordial is " + m.ordinal());
		}
	}
}
