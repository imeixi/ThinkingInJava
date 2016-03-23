package cn.imeixi.chapter5.java;

import static net.mindview.util.Print.*;
public class Flower {
	int petalsCount = 0;//花瓣
	String s = "initial value";
	
	//构造器
	public Flower(int petals){
		petalsCount = petals;
		print("Constructor w/ int args only,petlsCount = " + petalsCount);
	}
	
	public Flower(String ss){
		print("Constructor w/ String only,String = " + ss);
		s = ss;
	}
	
	//构造器中调用构造器	
	public Flower(String ss,int petals){
		this(ss);
//		this(petals);
		this.petalsCount = petals;
		print("String & int");
	}
	
	public Flower(int petals,String ss){
		this(petals);
		this.s = ss;
		print("int & String");
	}	
	
	public Flower(){
		this("hi",47);
		print("Default constructor(no args)");
//		this("hi",47);
	}
	
	void printPetalsCount(){
//		this(11);
		print("PetalsCount = " + petalsCount);
	}
	
	public static void main(String[] args) {
		Flower f = new Flower();
		f.printPetalsCount();
	}
	
}
