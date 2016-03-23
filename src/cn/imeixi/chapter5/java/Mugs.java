package cn.imeixi.chapter5.java;
import static net.mindview.util.Print.*;

public class Mugs {
	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		print("mug1 & mug2 Initialed");
	}
	
	Mugs(){
		print("Mugs()");
	}
	Mugs(int i){
		print("Mugs(int)");
	}
	
	public static void main(String[] args) {
		print("Inside main!");
		new Mugs();
		print("Mugs() is complete");
		new Mugs(1);
		print("Mugs(int) is complete");
	}

}

class Mug{
	public Mug(int marker){
		print("Mug(" + marker + ")");
	}
	void f(int marker){
		print("Mug(" + marker + ")");
	}
}
