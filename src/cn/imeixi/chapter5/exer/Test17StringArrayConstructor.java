package cn.imeixi.chapter5.exer;

public class Test17StringArrayConstructor {
	public static void main(String[] args) {
		StringArray[] sa = new StringArray[10];   //��ʱ��û��������������Ҳ��û�е���StringArray�Ĺ��캯����
		sa[0] = new StringArray("I love you.");
		sa[1] = new StringArray("The world that heavily damaged.");
	}
}

class StringArray{
	public StringArray(String str){
		System.out.println(str + " ");
	}
}
