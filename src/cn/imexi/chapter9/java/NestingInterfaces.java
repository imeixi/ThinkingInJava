package cn.imexi.chapter9.java;

public class NestingInterfaces {
	public class BImp implements A.B{
		public void f(){};
	}
	
	class CImp implements A.C{
		public void f(){}
	}

// E is interface can't be implements
//	class EImp implements E{
//		public void f(){}
//	}
	class EImp implements E{
		public void g(){}
	}
	
	class EGImp implements E.G{
		public void f(){}
	}
	
	public static void main(String[] args){
		A a = new A();
//		A.D ad = a.getD();
//		
//		A.DImp2 di2 = a.getD();
//		
//		a.getD().f();
		
		A a2 = new A();
		a2.receiveD(a.getD());
	}
}

class A{
	interface B{
		void f();
	}
	
	public class BImp implements B{
		public void f(){}
	}
	
	public class BImp2 implements B{
		public void f(){}
	}
	
	public interface C{
		void f();
	}
	
	class CImp implements C{
		public void f(){}
	}
	
	private class CImp2 implements C{
		public void f(){}
	}
	
	private interface D{
		public void f();
	}
	
	private class DImp implements D{
		public void f(){}
	}
	
	public class DImp2 implements D{
		public void f(){}
	}
	
	public D getD(){
		return new DImp2();
//		return new DImp1();
	}	
	private D dRef;
	public void receiveD(D d){
		dRef =d;
		dRef.f();
	}
 }


interface E{
	interface G{
		void f();
	}
	
	public interface H{
		void f();
	}
	
	void g();
	
//		private interface I{}
}
	
