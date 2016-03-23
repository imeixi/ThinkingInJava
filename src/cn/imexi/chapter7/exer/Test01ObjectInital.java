package cn.imexi.chapter7.exer;

public class Test01ObjectInital {
	static ObjectInital obj;
	public static void main(String[] args) {
		System.out.println("This message from main method.");
		if(obj == null){
			obj = new ObjectInital();
		}
		System.out.println(obj);
	}
}

class ObjectInital{
	public ObjectInital(){
		System.out.println("this is Constructor.");
	}
	
	public String toString(){
		return "It's print by toString.";
	}
}
