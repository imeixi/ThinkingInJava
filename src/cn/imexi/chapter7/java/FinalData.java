package cn.imexi.chapter7.java;

import java.util.Random;

public class FinalData {
	private static Random rand = new Random(47);
	private String id;
	public FinalData(String id){
		this.id = id;
	}
	//可以作为 编译时常量
	private final int valueOne = 9;
	private static final int VALUE_TWO = 99;
	
	//经典模式定义常量
	public static final int VALUE_THREE = 39;
	
	//不可以作为 编译时常量
	private final int i4 = rand.nextInt(20);
	static final int INT_5 = rand.nextInt(20);
	private Value v1 = new Value(11);
	private final Value v2 = new Value(22);
	private static final Value VAL_3 = new Value(33);
	
	//数组
	private final int[] a = {1,2,3,4,5};
	
	public String toString(){
		return id + ":" + "i4 = " + i4 + ", INT_5 = " + INT_5;
	}
	
	public static void main(String[] args) {
		FinalData fd1 = new FinalData("fd1");
//		fd1.valueOne ++;    //valueOne is final base data type
		fd1.v2.i++;         //v2 is final reference(参考；引用) data type，引用对象不可以修改，但是对象的值可以修改。
		fd1.v1 = new Value(9);    //v1 is not final ,can be changed.
		for(int i = 0;i < fd1.a.length;i++){
			fd1.a[i]++;
		}
//		fd1.v2 = new Value(0);            //引用对象是final所以不可以修改
//		fd1.VAL_3 = new Value(0);		  //引用对象是static final所以不可以修改
//		fd1.a = new int[3];               //数组也是引用对象的一种，不可以修改
		
		System.out.println(fd1);
		System.out.println("Creating new FinalDate:");
		FinalData fd2 = new FinalData("fd2");
		System.out.println(fd1);
		System.out.println(fd2);
	}
	

}

class Value{
	int i;
	public Value(int i){this.i = i;}
}
