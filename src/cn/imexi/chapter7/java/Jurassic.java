package cn.imexi.chapter7.java;

public class Jurassic {
	public static void main(String[] args) {
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		n.j++;
	}
}

class SmallBrain{}

final class Dinosaur{
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();
	void f(){}
}




/*
Jurassic 
 英 [dʒu'ræsik]  
adj. 侏罗纪的；侏罗系的
n. [地质] 侏罗纪

dinosaur   
 英 ['daɪnəsɔː]   美 ['daɪnə'sɔr]  
n. 恐龙；过时、落伍的人或事物

*/