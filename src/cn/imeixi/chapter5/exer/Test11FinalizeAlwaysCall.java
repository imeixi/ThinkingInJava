package cn.imeixi.chapter5.exer;

public class Test11FinalizeAlwaysCall {
	protected void finalize(){
		System.out.println("finalize Called.");
	}
	public static void main(String[] args) {
		new Test11FinalizeAlwaysCall();
		System.gc();
//		System.runFinalization();
		Runtime.getRuntime().runFinalization();
		
		
	}
}
