package cn.imeixi.chapter1.exer;

public class Exer04_05DataOnly {
	public static void main(String[] args) {
		DataOnly data = new DataOnly();
		System.out.println("DataOnly.i = " + data.i );
		System.out.println("DataOnly.d = " + data.d );
		System.out.println("DataOnly.b = " + data.b );
		data.i = 47;
		data.d = 1.1;
		data.b = false;
		System.out.println("DataOnly.i = " + data.i );
		System.out.println("DataOnly.d = " + data.d );
		System.out.println("DataOnly.b = " + data.b );
	}
}


class DataOnly{
	int i;
	double d;
	boolean b;
}