package cn.imexi.chapter9.java.interfaceProcessor;

import cn.imexi.chapter9.java.Fliter.Bandpass;
import cn.imexi.chapter9.java.Fliter.Filter;
import cn.imexi.chapter9.java.Fliter.Highpass;
import cn.imexi.chapter9.java.Fliter.Lowpass;
import cn.imexi.chapter9.java.Fliter.Waveform;

public class FilterProcessor {
	public static void main(String[] args) {
		Waveform w1 = new Waveform();
		Waveform w2 = new Waveform();
		Waveform w3 = new Waveform();
		Apply.process(new FilterAdpter(new Lowpass(1.0)), w1);
		Apply.process(new FilterAdpter(new Highpass(4.0)), w2);
		Apply.process(new FilterAdpter(new Bandpass(2.0,4.0)), w3);
	}
}

class FilterAdpter implements Processor {
	Filter file;
	
	public FilterAdpter(Filter file){
		this.file = file;
	}

	public String name() {
		return file.name();
	}

	public Waveform process(Object input) {
		return file.process((Waveform)input);
	}
}
