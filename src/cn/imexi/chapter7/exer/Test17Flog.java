package cn.imexi.chapter7.exer;

public class Test17Flog {
	public static void main(String[] args) {
		Flog1 f = new Flog1();
		f.run(f);
	}
}

class Amphibian1{
	public void walk(String s){System.out.println(s + " can walk on the road.");}
	public void swim(String s){System.out.println(s + " can swim in the river.");}
	public void run(Amphibian1 a){
		a.walk("Amphibian1");
		a.swim("Amphibian1");
	}
}

class Flog1 extends Amphibian1{
	public void run(Flog1 a){
		a.walk("Flog1");
		a.swim("Flog1");
	}
}