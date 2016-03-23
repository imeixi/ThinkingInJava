package cn.imexi.chapter9.java.interfaceProcessor;

import java.util.Arrays;

public abstract class StringProcessor implements Processor{

	public String name(){
		return getClass().getSimpleName();
	}
	
	public abstract String process(Object s);
	
	public static String s = "If she weights the same as a duck,she's  made of food.";
	
	public static void main(String[] args){
		Apply.process(new Upcase(), s);
		Apply.process(new Downcase(), s);
		Apply.process(new Splitter(), s);
	}
}

class Upcase extends StringProcessor{

	@Override
	public String process(Object input) {
		return ((String)input).toUpperCase();
	}
	
}
class Downcase extends StringProcessor{
	
	@Override
	public String process(Object input) {
		return ((String)input).toLowerCase();
	}
	
}
class Splitter extends StringProcessor{
	
	@Override
	public String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
	
}