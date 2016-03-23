package cn.imeixi.chapter5.java;

public class VarArgs {
	static void printArray(Object[] args){
		for(Object obj:args){
			System.out.println(obj + " ");			
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		printArray(new Object[]{new Integer(47),new Float(10.2),new Character('c')});
		printArray(new Object[]{new A(),new A(),new A()});
		printArray(new Object[]{"AA",4.2,"CC"});


	}
}

class A{}
