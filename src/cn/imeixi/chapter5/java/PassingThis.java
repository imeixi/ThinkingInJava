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

class Peeler{         //peeler :°þÆ¤»ú£»¾¯²ì£»½ººÏ°å²Ä£»ÍÑÒÂÎèÅ®
	static Apple peel(Apple apple){
		// ...remove peel
		return apple;
	}
}

class Apple{
	Apple getPeeled(){         //peel:vt,°þ£¬°þÂä£»Ï÷£»  n£¬Æ¤
		return Peeler.peel(this);
	} 
}
