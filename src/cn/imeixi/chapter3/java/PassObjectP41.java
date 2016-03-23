package cn.imeixi.chapter3.java;

//Passing(vt.通过；经过；传递) objects to methods may not be what you're used to
import static net.mindview.util.Print.*;

class Letter{
	char c;
}


public class PassObjectP41 {

	static void f(Letter y){
		y.c = 'z';
	}
	
	public static void main(String[] args){
		Letter x = new Letter();
		x.c = 'a';
		print("1: x.c = " + x.c);
		f(x);
		print("2: x.c = " + x.c);
	}
}
