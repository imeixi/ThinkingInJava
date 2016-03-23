package cn.imexi.chapter6.exer;

public class Test04ProtectedPackageAuthority {
	public static void main(String[] args) {
		ProtectedPackageAuthority p = new ProtectedPackageAuthority();
		System.out.println("The class in the same package can be invoked the protected method of other classes.");
		p.info();
	}
}

class ProtectedPackageAuthority{
	public ProtectedPackageAuthority() {
		// TODO Auto-generated constructor stub
		System.out.println("This is a constructor to create a new ProtectedPackageAuthority class object.");
	}
	
	protected void info(){
		System.out.println("This is a Protected method.");
	}
}
