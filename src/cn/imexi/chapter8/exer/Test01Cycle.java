package cn.imexi.chapter8.exer;

public class Test01Cycle {
	public void running(Cycle c){
		c.run();
	}
	
	public static void main(String[] args) {
		Cycle c = new Cycle();
		Unicycle uc = new Unicycle();
		Bicycle bc = new Bicycle();
		Tricycle tc = new Tricycle();
		
		Test01Cycle tc1 = new Test01Cycle();
		tc1.running(c);
		tc1.running(uc);
		tc1.running(bc);
		tc1.running(tc);
	}
}

class Cycle{
	void run(){
		System.out.println("Cycle is run.");
	}
	
	int wheel(){return 0;}
}

class Unicycle extends Cycle{
	void run(){
		System.out.println("Unicycle is run.");
	}
	int wheel(){return 1;}
}
class Bicycle extends Cycle{
	void run(){
		System.out.println("Bicycle is run.");
	}
	int wheel(){return 2;}
}
class Tricycle extends Cycle{
	void run(){
		System.out.println("Tricycle is run.");
	}
	int wheel(){return 3;}
}

