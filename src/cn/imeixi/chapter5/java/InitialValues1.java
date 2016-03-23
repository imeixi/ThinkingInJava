package cn.imeixi.chapter5.java;

public class InitialValues1 {
	char c = 'a';
	byte b = 12;
	short s = 24;
	int i = 65535;
	long l = 2140656533L;
	float f = 3.14f;
	double d = 3.1415926;
	String str = "Hello my world!";
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
		new InitialValues1().printInfo();
	}
}