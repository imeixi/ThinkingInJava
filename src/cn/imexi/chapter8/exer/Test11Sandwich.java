package cn.imexi.chapter8.exer;

public class Test11Sandwich {
	public static void main(String[] s){
		new Pickle();
	}
}

class meal{
	public meal(){
		System.out.println("Meal()");
	}
}

class Bread{
	public Bread(){
		System.out.println("Bread()");
	}
}

class Cheese{          
	public Cheese(){
		System.out.println("Cheese()");
	}
}

class Lettuce{        //lettuce  英 ['letɪs]   美 ['lɛtɪs]  n. [园艺] 生菜；莴苣；（美）纸币
	public Lettuce (){
		System.out.println("Lettuce()");
	}
}

class Lunch{
	public Lunch(){
		System.out.println("Lunch()");
	}
}

class ProtableLunch extends Lunch{         //portable  英 ['pɔːtəb(ə)l]   美 ['pɔrtəbl]	 adj. 手提的，便携式的；轻便的 	 n. 手提式打字机
	public ProtableLunch(){
		System.out.println("ProtableLunch()");
	}
}

class Sandwich extends ProtableLunch{
	private Bread b = new Bread();
	private Lettuce l = new Lettuce();
	private Cheese c = new Cheese();
	
	public Sandwich(){
		System.out.println("Sandwich();");
	}
	
}

class Pickle extends Sandwich{   //pickle  英 ['pɪk(ə)l]   美 ['pɪkl]	 n. 泡菜；盐卤；腌制食品	 vt. 泡；腌制
	private String s = "This is Pickle parameter s.";
	public Pickle(){
		System.out.println(" Pickle() + " + s);
	}
	}