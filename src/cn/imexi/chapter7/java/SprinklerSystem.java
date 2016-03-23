package cn.imexi.chapter7.java;

public class SprinklerSystem {
	private String value1,value2,value3,value4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;
	public String toString(){
		return 
				" value1 = " + value1 +
				" value2 = " + value2 +
				" value3 = " + value3 +
				" value4 = " + value4 + "\n" +
				" i = " + i +
				" f = " + f + "\n" +
				" source = " + source;
				
	}
	
	public static void main(String[] args) {
		SprinklerSystem sprinkler = new SprinklerSystem();
		System.out.println(sprinkler);
	}

}

class WaterSource{
	private String s;
	public WaterSource(){
		System.out.println(" WaterSource()");
		s = "Constructor.";
	}
	
	public String toString(){
		return s;
	}
}

/*
 sprinkler system     自动喷水灭火系统；自动洒水装置
 
sprinkler   
 英 ['sprɪŋklə]   美 ['sprɪŋklɚ]  跟读 口语练习
n. 洒水车；洒水器
 
 */