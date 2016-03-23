package cn.imeixi.chapter5.exer;

import cn.imeixi.chapter5.java.Money;

public class Test22SwitchEnum {
	Money m;
	public Test22SwitchEnum(Money m){
		this.m = m;
	}
	public void descirb(){
		System.out.print("This is " + m + " YUAN.");
		switch(m){
		case ONE:
			System.out.println("It's the smallest");
			break;
		case FIVE:
			System.out.println("It's the small");
			break;
		case TEN:
			System.out.println("It's the medium");
			break;
		case TWEENTY:
			System.out.println("It's the big");
			break;
		case FIFTY:
		case HUNDRED:
			System.out.println("It's the perfect");
			break;
		}
	}
	
	public static void main(String[] args) {
		new Test22SwitchEnum(Money.HUNDRED).descirb();
		new Test22SwitchEnum(Money.FIFTY).descirb();
		new Test22SwitchEnum(Money.TWEENTY).descirb();
		new Test22SwitchEnum(Money.TEN).descirb();
	}
	
}
