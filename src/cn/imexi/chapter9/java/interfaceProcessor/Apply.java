package cn.imexi.chapter9.java.interfaceProcessor;

public class Apply {
	public static void process(Processor p,Object s){
		System.out.println("User Processor " + p.name());
		System.out.println(p.process(s));
	}
	
	
}
