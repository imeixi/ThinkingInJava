package cn.imeixi.chapter4.java;

public class ForEachString {
	public static void main(String[] args) {
		for(char x:"This is A Test for StringToCharArray".toCharArray()){
			System.out.println(x);
		}
	}
}
