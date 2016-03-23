package cn.imeixi.chapter5.java;

public class PassingThis {
	public static void main(String[] args) {
		Person p = new Person();
		Apple a = new Apple();
		p.eat(a);
	}
}

class Person{
	void eat(Apple apple){
		Apple peeled = apple.getPeeled();
		System.out.println("Yummy");
	}
}

class Peeler{         //peeler :��Ƥ�������죻���ϰ�ģ�������Ů
	static Apple peel(Apple apple){
		// ...remove peel
		return apple;
	}
}

class Apple{
	Apple getPeeled(){         //peel:vt,�������䣻����  n��Ƥ
		return Peeler.peel(this);
	} 
}
