package cn.imeixi.chapter5.java;

//Optional  :可选择的
//Trailing  ：后面的；拖尾的


public class OptionalTrailingArguments {        //
	static void f(int require,String... Trailing){
		System.out.print("require = " + require);
		for(String str:Trailing){
			System.out.print(" " + str);
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		f(1,"one");
		f(2,"two","three");
		f(0);
	}
	
}
