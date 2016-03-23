package cn.imexi.chapter9.exer;

public class Test14ExtendsInterface {
	public void invokeA(A a){
		a.a1();
		a.a2();
	}
	public void invokeB(B b){
		b.b1();
		b.b2();
	}
	public void invokeC(C c){
		c.c1();
		c.c2();
	}
	public void invokeD(D d){
		d.d1();
		d.d2();
	}
	
	public static void main(String[] args) {
		M m = new M();
		Test14ExtendsInterface i = new Test14ExtendsInterface();
		i.invokeA(m);
		System.out.println();
		i.invokeB(m);
		System.out.println();
		i.invokeC(m);
		System.out.println();
		i.invokeD(m);
	}
	

}

interface A{
	void a1();
	void a2();
}
interface B{
	void b1();
	void b2();
}
interface C{
	void c1();
	void c2();
}
interface D extends A,B,C{
	void d1();
	void d2();
}

class E{
	void e(){}
}

class M extends E implements D{
	//实现接口方法
	@Override
	public void a1() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		System.out.println(new Throwable().getStackTrace()[0].getClassName());
	}

	@Override
	public void a2() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		System.out.println(new Throwable().getStackTrace()[0].getClassName());
	}

	@Override
	public void b1() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		System.out.println(new Throwable().getStackTrace()[0].getClassName());
	}

	@Override
	public void b2() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		System.out.println(new Throwable().getStackTrace()[0].getClassName());	
	}

	@Override
	public void c1() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		System.out.println(new Throwable().getStackTrace()[0].getClassName());	
	}

	@Override
	public void c2() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		System.out.println(new Throwable().getStackTrace()[0].getClassName());	
	}

	@Override
	public void d1() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		System.out.println(new Throwable().getStackTrace()[0].getClassName());
		
	}

	@Override
	public void d2() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		System.out.println(new Throwable().getStackTrace()[0].getClassName());
		
	}
	
	//重载基类方法
	@Override
	public void e(){
		System.out.println("override E.");          //overrides  n. 重写；代理佣金（override的复数）  v. 重写；压倒（override的第三人称单数）；撤销；无视
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		System.out.println(new Throwable().getStackTrace()[0].getClassName());
	}
	
	//扩展新方法
	public void m(){
		System.out.println("M.m method.");
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		System.out.println(new Throwable().getStackTrace()[0].getClassName());
	}

	
}