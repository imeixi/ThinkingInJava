package cn.imeixi.chapter5.java;

public class OrderInitialization {
	public static void main(String[] args) {
		House h = new House();
	}
}

class Window{
	public Window(int i){
		System.out.println("Windows " + i);
	}
}

class House{
	Window w = new Window(1);
	
	public House(){
		System.out.println("House");
		Window  w3 = new Window(33);
	}
	
	Window w1 = new Window(2);
	
	Window w2 = new Window(3);
}