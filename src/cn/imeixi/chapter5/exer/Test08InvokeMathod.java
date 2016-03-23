package cn.imeixi.chapter5.exer;

public class Test08InvokeMathod {

	public void a(){
		System.out.println("This is A meth");
	}
	
	public void b(){
		a();
		this.a();
	}
	
	public static void main(String[] args) {
		new Test08InvokeMathod().b();
	}
	
}
