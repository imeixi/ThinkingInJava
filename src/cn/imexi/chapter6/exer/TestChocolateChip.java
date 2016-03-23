package cn.imexi.chapter6.exer;

import cn.imexi.chapter6.java.Cookie;

public class TestChocolateChip extends Cookie {
	public TestChocolateChip(){
		System.out.println("ChocolateChip constructor");
	}
	
	public void chomp(){
	//	bite();
		bite1();  //protected classes can be invoke.
	}
	
	public static void main(String[] args) {
		TestChocolateChip x = new TestChocolateChip(); 
		x.chomp();
	}
}


/*output:
 *Cookie constructor.
 *ChocolateChip constructor
*/

/*继续的类，会先调用父类的构造器，再调用子类的构造器
 * 
 */
