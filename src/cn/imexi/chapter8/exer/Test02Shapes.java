package cn.imexi.chapter8.exer;

public class Test02Shapes {

	public static void main(String[] args) {
		Test02RandomShapeGenerator rand = new Test02RandomShapeGenerator();
		Test02Shape[] s = new Test02Shape[9];
		Test02Shape shape = new Test02Shape();
		for(int i = 0;i < s.length;i++){
			s[i] = rand.next();
		}
		for(Test02Shape sh:s){
			sh.draw();
			sh.erase();	
			sh.msg();
		}
		shape.draw();
		shape.erase();
		shape.msg();
		
	}
}
