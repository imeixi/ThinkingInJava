package cn.imexi.chapter8.exer;

import java.util.*;

public class Test06Music {
	private Random rand = new Random(47);
	
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument[] e){
		for(Instrument i:e){
			tune(i);
		}
	}
	
	public Instrument next(){
			switch(rand.nextInt(6)){
			default:
			case 0 : return new Wind();
			case 1 : return new Percussion();
			case 2 : return new Stringed();
			case 3 : return new Brass();
			case 4 : return new Woodwind();
			case 5 : return new Piano();
			}
			
	}
	
	
	public static void main(String[] args){
//		Instrument[] orchestra = {
//			new Wind(),
//			new Percussion(),
//			new Stringed(),
//			new Brass(),
//			new Woodwind(),
//			new Piano()
//		};
		Test06Music t = new Test06Music();
		
		Instrument[] orchestra = new Instrument[9];
		for(int i = 0;i < orchestra.length;i++){
			orchestra[i] = t.next();
		}
		
		tuneAll(orchestra);
		for (Instrument i:orchestra){
			System.out.println(i);
		}
	}
}

class Instrument {
	void play(Note n){System.out.println("Instrument.play() " + n);}
	public String toString(){return "Instrument.";}
	void adjust(){ System.out.println("Adjusting Instrument.");}
}

class Wind extends Instrument {
	void play(Note n){System.out.println("Wind.play() " + n);}
	public String toString(){return "Wind.";}
	void adjust(){ System.out.println("Adjusting Wind.");}
}

class Percussion extends Instrument {
	void play(Note n){System.out.println("Percussion.play() " + n);}
	public String toString(){return "Percussion.";}
	void adjust(){ System.out.println("Adjusting Percussion.");}
}

class Stringed extends Instrument {
	void play(Note n){System.out.println("Stringed.play() " + n);}
	public String toString(){return "Stringed.";}
	void adjust(){ System.out.println("Adjusting Stringed.");}
}

class Piano extends Instrument {
	void play(Note n){System.out.println("Piano.play() " + n);}
	public String toString(){return "Piano.";}
	void adjust(){ System.out.println("Adjusting Piano.");}
}

class Brass extends Wind{
	void play(Note n){System.out.println("Brass.play() " + n);}
	void adjust(){ System.out.println("Adjusting Brass.");}
}

class Woodwind extends Wind{
	void play(Note n){System.out.println("Woodwind.play() " + n);}
	void adjust(){ System.out.println("Adjusting Woodwind.");}
}