package cn.imeixi.chapter5.exer;

public class Test12Tank {
	
	public static void main(String[] args) {
		new Tank().empty();
		new Tank();
		System.gc();
		System.runFinalization();
	}

}

class Tank{
	static int counter = 0;
	int id = counter++;
	boolean isFull;
	public Tank(){
		System.out.println("Tank " + id + " is created");
		isFull = true;
	}
	
	public void empty(){ isFull = false;}
	
	protected void finalize(){
		if(isFull){
			System.out.println("Error:Tank " + id + " must be empty at cleanup.");
		}else{
			System.out.println("Tank " + id + " is been cleanup.");
		}
	}
}
