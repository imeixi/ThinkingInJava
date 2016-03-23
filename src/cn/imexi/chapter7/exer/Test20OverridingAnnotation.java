package cn.imexi.chapter7.exer;

public class Test20OverridingAnnotation {
	public static void main(String[] args) {
		OverridingPrivate op = new OverridingPrivate();
//		op.f();
//		op.g();
		OverridingPrivate1 op1 = new OverridingPrivate1();
		op1.f();
		op1.g();
	}
}


class WithFinals{
	private final void f(){System.out.println("WithFinals.f()");}
	private void g(){System.out.println("WithFinals.g()");}
}

class OverridingPrivate extends WithFinals{
//	@Override 
	private final void f(){
		System.out.println("OverridingPrivate.f()");
	}
//	@Override 
	private void g(){
		System.out.println("OverridingPrivate.g()");
	}
	
}

class OverridingPrivate1 extends OverridingPrivate{
//	@Override 
	public final void f(){
		System.out.println("OverridingPrivate.f()");
	}
//	@Override 
	public void g(){
		System.out.println("OverridingPrivate.g()");
	}
	
}