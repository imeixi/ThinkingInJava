package cn.imeixi.chapter5.java;

import static net.mindview.util.Print.*;
public class OverLoading {
	public static void main(String[] args) {
		Tree t = new Tree();
		Tree t1 = new Tree(25);
		t.info();
		t1.info("No.1");
	}
}

class Tree{
	int Height;
	
	public Tree(){		
		print("Planting a new seedling!");
		Height = 0;
	}
	
	//OverLoad
	public Tree(int Height){
		this.Height = Height;
		print("Create New Tree the Height is " + Height + " feeds tall.");
	}
	
	void  info(){
		print("Tree is " + Height + " feeds tall.");
	}
	
	void  info(String st){
		print(st + ":Tree is " + Height + " feeds tall.");
	}
	
	
	
	
	
}