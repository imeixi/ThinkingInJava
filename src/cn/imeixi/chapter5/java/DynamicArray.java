package cn.imeixi.chapter5.java;

public class DynamicArray {
	public static void main(String[] args) {
		new Other().main(new String[]{"AAA","BBB","CCC"});
	}
}

class Other {
	public static void main(String[] args) {
		for (String s : args) {
			System.out.print(s + " ");
		}
	}
}
