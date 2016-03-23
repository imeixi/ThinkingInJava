package cn.imexi.chapter6.exer;

import cn.imexi.chapter6.java.*;

public class Test09NonPublicClassInvoke {
	public static void main(String[] args) {
//		cn.imexi.chapter6.java.PackageClasses p = new cn.imexi.chapter6.java.PackageClasses();   //Because the PackagesClasses is not Public,so,this class can not invoke it.
		PackageClasses p = new PackageClasses();
		p.info();
		PackageClasses p1;
//		p1.info();
		System.out.println(p.s.concat("i"));
		
	}
}



	class PackageClasses {
		public PackageClasses(){
			System.out.println("Creating a new PackageClasses.");
		}
		
		void info(){
			System.out.println("Hello");
		}
		
		String s;
	}
