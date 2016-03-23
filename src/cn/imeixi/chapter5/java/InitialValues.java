package cn.imeixi.chapter5.java;

public class InitialValues {
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	String str;
	InitialValues init; 
	
	public void printInfo(){
		System.out.println("Data Type           Values");
		System.out.println("char                [" + c + "]");
		System.out.println("byte                 " + b);
		System.out.println("short                " + s);
		System.out.println("int                  " + i);
		System.out.println("long                 " + l);
		System.out.println("float                " + f);
		System.out.println("double               " + d);
		System.out.println("String               " + str);
		System.out.println("init                 " + init);
	}
	
	public static void main(String[] args) {
		new InitialValues().printInfo();
	}
}
