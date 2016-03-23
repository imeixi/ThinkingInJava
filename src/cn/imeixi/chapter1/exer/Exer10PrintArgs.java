package cn.imeixi.chapter1.exer;

public class Exer10PrintArgs {
	public static void main(String[] args) {
		if(args.length < 3){
			System.err.println("Need 3 arguments");
			System.exit(1);
		}
		
		for(int i = 0;i < args.length;i++){
			System.out.println("args[" + i + "] = " + args[i]);
		}			
	
	}
}
