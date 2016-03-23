package cn.imexi.chapter7.java;

public class Bath {
	private String 
	 	s1 = "Happy",
	 	s2 = "Happy",
	 	s3,s4;
	private Soap s;
	private int i;
	private float f;
	
	public Bath(){
		System.out.println("This is inside the Bath.");
		s3 = "constructor.";
		f = 3.14f;
		s = new Soap();
	}
	
	{ i = 47;}
	
	public String toString(){
		if(s4 == null){
			s4 = "New year.";
		}
		return 
				" s1 = " + s1 + "\n" +
				" s2 = " + s2 + "\n" +
				" s3 = " + s3 + "\n" +
				" s4 = " + s4 + "\n" +
				" i = " + i + "\n" +
				" f = " + f + "\n" +
				" s = " + s + "\n" ;
		
	}
	
	public static void main(String[] args) {
		Bath b = new Bath();
		System.out.println(b);
	}
	
}

class Soap{
	private String s;
	public Soap(){
		System.out.println("Soup()");
		s = "Constructor.";
	}
	public String toString(){
		return s;
	}

}
