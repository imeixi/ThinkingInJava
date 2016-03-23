package cn.imexi.chapter9.java.Fliter;

public class Lowpass extends Filter{
	private double cutoff;
	public Lowpass(double cutoff){
		this.cutoff = cutoff;
	}
	Waveform process(Object input){
		return (Waveform)input;
	}
}
