package cn.imeixi.chapter1.java;

public class ShowProperties {
	public static void main(String[] args){
		System.getProperties().list(System.out);
		System.out.println("user.name = " + System.getProperty("user.name"));
		System.out.println("java.library.path = " +
				System.getProperty("java.library.path"));
	}
}
