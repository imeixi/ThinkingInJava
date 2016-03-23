package cn.imexi.chapter6.exer;

public class Test06ProtectedMethod {
	public static void main(String[] args) {
		ProtectedMethodSon person = new ProtectedMethodSon();
		person.info();
	}
}

class ProtectedMethod{
	protected void info(){
		System.out.println("This is Protected Method from Father.");
	}
}

class ProtectedMethodSon extends ProtectedMethod{
	
}