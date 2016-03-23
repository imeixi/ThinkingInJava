package cn.imeixi.chapter5.exer;

public class Test17StringArrayConstructor {
	public static void main(String[] args) {
		StringArray[] sa = new StringArray[10];   //此时并没有真正创建对象，也还没有调用StringArray的构造函数。
		sa[0] = new StringArray("I love you.");
		sa[1] = new StringArray("The world that heavily damaged.");
	}
}

class StringArray{
	public StringArray(String str){
		System.out.println(str + " ");
	}
}
