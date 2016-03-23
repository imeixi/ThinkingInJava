package cn.imexi.chapter8.exer;

public class Test05Circle {
	public void running(Cycle c){
		c.run();
	}
	
	public void wheels(Cycle c){
		System.out.println(c.getClass().getName().substring(23) + " have " + c.wheel() + " wheels.");
	}
	
	public static void main(String[] args) {
		Cycle c = new Cycle();
		Unicycle uc = new Unicycle();
		Bicycle bc = new Bicycle();
		Tricycle tc = new Tricycle();
		
		Test05Circle tc1 = new Test05Circle();
		tc1.running(c);
		tc1.running(uc);
		tc1.running(bc);
		tc1.running(tc);
		System.out.println();
		tc1.wheels(c);
		tc1.wheels(uc);
		tc1.wheels(bc);
		tc1.wheels(tc);
	}
}


