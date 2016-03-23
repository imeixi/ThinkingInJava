package cn.imeixi.chapter5.exer;

public class Test02Constructor {
	public static void main(String[] args) {
		NewString1 ns1 = new NewString1("Initialed at Constructor!");
		System.out.println("NewString1.str1 = " + ns1.str1);
		System.out.println("NewString1.str2 = " + ns1.str2);
		
	}
}

class NewString1{
	String str1 = "Initialized at definded!";
	String str2;
	public NewString1(String st){
		str2 = st;
	}
	
}
