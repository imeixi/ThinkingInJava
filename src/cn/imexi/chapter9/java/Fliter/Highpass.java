package cn.imexi.chapter9.java.Fliter;

public class Highpass extends Filter{
	private double cutoff;
	public Highpass(double cutoff){
		this.cutoff = cutoff;
	}
	public Waveform process(Waveform input){return input;}
}
