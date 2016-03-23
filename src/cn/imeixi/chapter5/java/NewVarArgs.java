package cn.imeixi.chapter5.java;

public class NewVarArgs {
	static void printArray(Object ... args){
		for(Object obj:args){
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		printArray(new Integer(47),new Float(3.14f),new Double(234));
		printArray(12,3.1415f,20l);
		printArray("one","two","three");
		printArray(new B(),new B(),new A());
		printArray((Object[])new Integer[]{1,2,3,4});
		printArray();
	}
	
}

class B{}
