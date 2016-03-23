package cn.imeixi.chapter5.java;

public class MethodInit {
	int i = f();     //初始化1
	int j = g(i);		//初始化2
	int f(){return 11;}  //方法声明
	int g(int n){return n * 10;}   //方法声明
}

//初始化 顺序很重要--自上而下。
//函数声明 位置可随意。编程习惯：初始化程序在上，函数声明在下。
