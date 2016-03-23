package cn.imeixi.chapter5.exer;

public class Test10NewFinalized {
	protected void finalize(){
		System.out.println("Finalize called.");
	}
	
	public static void main(String[] args) {
		new Test10NewFinalized();
	}
}
