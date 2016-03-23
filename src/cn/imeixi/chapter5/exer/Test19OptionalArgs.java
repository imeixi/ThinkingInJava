package cn.imeixi.chapter5.exer;

public class Test19OptionalArgs {
	static void f(String... strs){
		for(String str:strs){
			System.out.print(str + "  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		f("I","Love","you");
		f(new String[]{"I","can","do","it"});
	}
}
