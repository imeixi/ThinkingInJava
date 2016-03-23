package cn.imexi.chapter7.exer;

public class Test16Amphibian {
	public static void main(String[] args) {
		Flog f = new Flog();
		f.run(f);
	}
}

class Amphibian{
	public void walk(){System.out.println("I can walk on the road.");}
	public void swim(){System.out.println("I can swim in the river.");}
	public void run(Amphibian a){
		a.walk();
		a.swim();
	}
}

class Flog extends Amphibian{
	
}

/*
amphibian 
 英 [æm'fɪbɪən]   美 [æm'fɪbɪən]  跟读 口语练习
n. [脊椎] 两栖动物；水陆两用飞机；具有双重性格的人
adj. 两栖类的；[车辆] 水陆两用的；具有双重性格的
  
frog   
 英 [frɒg]   美 [frɔɡ]  跟读 口语练习
n. 青蛙；[铁路] 辙叉；饰扣
vi. 捕蛙
n. (Frog)人名；(俄)弗罗格

 */