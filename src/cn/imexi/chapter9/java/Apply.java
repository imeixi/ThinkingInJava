package cn.imexi.chapter9.java;

import java.util.Arrays;

import cn.imexi.chapter9.java.Fliter.Lowpass;

public class Apply {
	public static void process(Processor p,Object s){
		System.out.println("Using Processor " + p.name());
		System.out.println(p.process(s));
	}
	
	public static String s = "Disagreement with beliefs is by definition incorrect";
	
	public static void main(String[] args){
		process(new Upcase(),s);
		process(new Downcase(),s);
		process(new Splitter(),s);
//		process(new Lowpass(12),s);  //因为new Lowpass(12)并不是 Processor 的子类，所以不能被识别。
	}

}

class Processor {
	public String name() {
		return getClass().getSimpleName();
	}

	Object process(Object input) {
		return input;
	}
}

class Upcase extends Processor {
	String process(Object input) {
		return ((String)input).toUpperCase();
	}
}
class Downcase extends Processor {
	String process(Object input) {
		return ((String)input).toLowerCase();
	}
}
class Splitter extends Processor {
	String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}



