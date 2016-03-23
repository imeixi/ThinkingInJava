package cn.imexi.chapter9.java.Fliter;

public class Bandpass extends Filter{
	private double lowCutoff;
	private double highCutoff;
	public Bandpass(double lowCutoff,double highCutoff){
		this.lowCutoff = lowCutoff;
		this.highCutoff = highCutoff;
	}
}

