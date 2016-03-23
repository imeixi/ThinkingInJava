package cn.imeixi.chapter1.exer;

/*
 * Exercise Á·Ï°
 */
public class Exer01GetInit {
	int i;
	char c;
	public void getInit(){
		System.out.println("i = " + i );
		System.out.println("c = [" + c + "]");
		System.out.println("c = " + (int)c );
	}
	
	public static void main(String[] args) {
		Exer01GetInit e01 = new Exer01GetInit();
		e01.getInit();
		
	
	}
}
