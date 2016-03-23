package cn.imexi.chapter9.java.Fliter;

public class Waveform {
	private static long counter;
	private final long id = counter ++;
	public String toString(){
		return "Waveform " + id;
	} 	
}
