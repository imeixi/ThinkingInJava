package cn.imexi.chapter7.exer;

public class Test19BlankFinal {
	public static void main(String[] args) {
		BlankFinal b = new BlankFinal();
		System.out.println(b);
//		b.s = "1";
//		b.a = new int[4];
//		b.f[2] = 12.0f;
		
	}
}

class BlankFinal{
	private final double pi = Math.PI;
	
	private final String s;
	private final int[] a;
	private final float[] f;
	
	public double getPi() {
		return pi;
	}

//	public double setPi() {
//		pi = 3.14;
//	}
	
	public String getS() {
		return s;
	}

	public int[] getA() {
		return a;
	}

	public float[] getF() {
		return f;
	}
	
	public BlankFinal(){
		s = "I love you ,baby.";
		a = new int[]{1,2,3,4,5};
		f = new float[5];
	}
	
	public String toString(){
		String str = s + "\npi = " + pi;
		for(int i = 0;i < a.length;i++){
			str += "\n" + "a[" + i + "] = " + i;
		}
		return str;
	}
}
