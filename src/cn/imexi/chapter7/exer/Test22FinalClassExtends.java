package cn.imexi.chapter7.exer;

public class Test22FinalClassExtends {

}

final class Final{
	int i = 12;
	int j = 24;
	public String toString(){
		return "i = " + i + ", j = " + j;
	}
}

//class FinalExtends extends Final {}    当class 被声明为final后，系统将不能够被继承。