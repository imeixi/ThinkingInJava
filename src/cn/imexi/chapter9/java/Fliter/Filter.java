package cn.imexi.chapter9.java.Fliter;

public class Filter {
	public String name(){return getClass().getSimpleName();}
	
	public Waveform process(Waveform input){return input;}
}